/**
 * Name: Tyler May, Reese Whitlock
 * ID: A16792035, A17074829
 * Email: tjmay@ucsd.edu, rwhitlock@ucsd.edu
 * Sources used: Coding done jointly, Week 4 Quiz
 * 2-4 sentence file description here
 */

import java.util.AbstractList;

/** 
 * TODO: Add class header here 
 */

public class MyLinkedList<E> extends AbstractList<E> {

	int size;
	Node head;
	Node tail;

	/**
	 * A Node class that holds data and references to previous and next Nodes.
	 */
	protected class Node {
		E data;
		Node next;
		Node prev;

		/** 
		 * Constructor to create singleton Node 
		 * @param element Element to add, can be null	
		 */
		public Node(E element) {
			// Initialize the instance variables
			this.data = element;
			this.next = null;
			this.prev = null;
		}

		/** 
		 * Set the parameter prev as the previous node
		 * @param prev - new previous node
		 */
		public void setPrev(Node prev) {
			this.prev = prev;		
		}

		/** 
		 * Set the parameter next as the next node
		 * @param next - new next node
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		/** 
		 * Set the parameter element as the node's data
		 * @param element - new element 
		 */
		public void setElement(E element) {
			this.data = element;
		}

		/** 
		 * Accessor to get the next Node in the list 
		 * @return the next node
		 */
		public Node getNext() {
			return this.next;
		}

		/** 
		 * Accessor to get the prev Node in the list
		 * @return the previous node  
		 */
		public Node getPrev() {
			return this.prev;
		}

		/** 
		 * Accessor to get the Nodes Element 
		 * @return this node's data
		 */
		public E getElement() {
			return this.data;
		}
	}

	//  Implementation of the MyLinkedList Class
	/** Only 0-argument constructor is defined */
	public MyLinkedList() {
		this.size = 0;
		this.head = new Node(null);
		this.tail = new Node(null);
	}

	/**
	 * @return size of list
	 */
	@Override
	public int size() {
		return this.size;
	}

	/**
	 * @param index - index to get element from
	 * @return returns element at given index
	 */
	@Override
	public E get(int index) {
		if(index < 0){
			throw new IndexOutOfBoundsException("Index cannot be less than 0.");
		}
		if(index >= this.size()){
			throw new IndexOutOfBoundsException("Index cannot be equal to or greater than size of list.");
		}
		Node curNode = this.head;
		for(int i = -1; i < index; i++){
			curNode = curNode.getNext();
		}
		return (E) curNode.getElement();
	}

	/**
	 * Adds element at given index
	 * @param index - index to add element
	 * @param data - element to add
	 */
	@Override
	public void add(int index, E data) {
		if(data == null){
			throw new NullPointerException("data cannot be null");
		}
		if(index < 0 || index > this.size){
			throw new NullPointerException("Index cannot exceed size or be less than 0");
		}

		Node curNode = this.head;
		for(int i = 0; i < index; i++){
			curNode = curNode.getNext();
		}
		Node newNode = new Node(data);

		//Code adapted from Week 4 Discussion quiz Q11.1
		curNode.next.prev = newNode;
		newNode.next = curNode.getNext();
		newNode.prev = curNode;
		curNode.next = newNode;

		this.size++;
	}

	public boolean add(E data) {
		if(data == null){
			throw new NullPointerException("data cannot be null");
		}
		Node curNode = this.tail;
		curNode = curNode.getPrev();

		//Code adapted from Week 4 Discussion quiz Q11.1 (again)
		curNode.next.prev = newNode;
		newNode.next = curNode.getNext();
		newNode.prev = curNode;
		currNode.next = newNode;

		return true;
	}

	public E set(int index, E data) {
		Node curNode = this.head;
		for(int i = 0; i < index; i++){
			curNode = curNode.getNext();
		}
		curNode.setElement(data);
	}

	public E remove(int index) {
		return (E) null; // TODO
	}

	public void clear() {
		/* Add your implementation here */
	}

	public boolean isEmpty() {
		return true;  // TODO
	}

	protected Node getNth(int index) {
		return (Node) null;  // TODO
	}
}