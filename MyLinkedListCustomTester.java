/**
 * Name: Tyler May, Reese Whitlock
 * ID: A16792035, A17074829
 * Email: tjmay@ucsd.edu, rwhitlock@ucsd.edu
 * Sources used: Coding done jointly
 * 2-4 sentence file description here
 */

import static org.junit.Assert.*;
import org.junit.*;

/**
 * TODO: Add your class header
 * 
 * IMPORTANT: Do not change the method headers and points are awarded 
 * only if your test cases cover cases that the public tester file
 * does not take into account.
 */
public class MyLinkedListCustomTester {

	private MyLinkedList<String> emptyStringList;
	private MyLinkedList<Integer> twoIntList;
	private Integer[] intList = {1, 2};
	/**
	 * This sets up the test fixture. JUnit invokes this method before
	 * every testXXX method. The @Before tag tells JUnit to run this method
	 * before each test.
	 */
	@Before
	public void setUp() throws Exception {
		emptyStringList = new MyLinkedList<>();
		twoIntList = new MyLinkedList<>();
	}

	private void populateTwoIntList(){
		twoIntList.add(this.intList[0]);
		twoIntList.add(this.intList[1]);
	}

	/**
	 * Test the add method when adding a null element
	 */
	@Test
	public void testAdd() {
		boolean test = false;
		try{
			this.emptyStringList.add(null);
		} catch (NullPointerException E){
			test = true;
		}
		assertTrue(test);
	}

	/**
	 * Test the add with index method when adding to the middle of the list
	 */
	@Test
	public void testAddWithIndexTestOne() {
		this.populateTwoIntList();
		assertEquals(2, this.twoIntList.size());
		this.twoIntList.add(1, 3);
		assertEquals(3, this.twoIntList.size());
		assertEquals(Integer.valueOf(3), this.twoIntList.head.next.next.data);
		assertEquals(Integer.valueOf(3), this.twoIntList.tail.prev.prev.data);
		assertEquals(Integer.valueOf(2), this.twoIntList.tail.prev.data);
		assertEquals(Integer.valueOf(1), this.twoIntList.head.next.next.prev.data);
		assertEquals(Integer.valueOf(2), this.twoIntList.tail.prev.prev.next.data);
	}

	/**
	 * Test the add with index method when index is out of bounds
	 */	
	@Test
	public void testAddWithIndexTestTwo() {
		boolean test = false;
		try{
			this.emptyStringList.add(-1, "String!");
		} catch (IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
		test = false;
		try{
			this.emptyStringList.add(2, "String!");
		} catch (IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
	}

	/**
	 * Test the get method when index is out of bounds
	 */
	@Test
	public void testGet() {
		this.populateTwoIntList();
		boolean test = false;
		try{
			this.twoIntList.get(-1);
		} catch(IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
		test = false;
		try{
			this.twoIntList.get(2);
		} catch(IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
	}

	/**
	 * Test the getNth method when index is out of bounds
	 */
	@Test
	public void testGetNth() {
		this.populateTwoIntList();
		boolean test = false;
		try{
			this.twoIntList.get(-1);
		} catch(IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
		test = false;
		try{
			this.twoIntList.get(2);
		} catch(IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
	}

	/**
	 * Test the set method when index is out of bounds
	 */
	@Test
	public void testSet() {
		boolean test = false;
		try{
			this.emptyStringList.set(-1, "String!");
		} catch (IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
		test = false;
		try{
			this.emptyStringList.set(2, "String!");
		} catch (IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
	}

	/**
	 * Test the remove method when index is out of bounds
	 */
	@Test
	public void testRemoveTestOne() {
		boolean test = false;
		try{
			this.emptyStringList.remove(-1);
		} catch (IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
		test = false;
		try{
			this.emptyStringList.remove(2);
		} catch (IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
	}
	
	/**
	 * Test the remove method when removing the middle element
	 */
	@Test
	public void testRemoveTestTwo() {
		this.populateTwoIntList();
		this.twoIntList.add(3);
		assertEquals(3, this.twoIntList.size());
		assertEquals(Integer.valueOf(2), this.twoIntList.remove(1));
		assertEquals(Integer.valueOf(1), this.twoIntList.tail.prev.prev.data);
		assertEquals(Integer.valueOf(3), this.twoIntList.head.next.next.data);
		assertEquals(2, this.twoIntList.size());
	}

	/**
	 * Test the clear method when the list is empty
	 */
	@Test
	public void testClear() {
		this.emptyStringList.clear();
		assertEquals(emptyStringList.head.data, null);
		assertEquals(emptyStringList.tail.data, null);
		assertEquals(emptyStringList.head.next, emptyStringList.tail);
		assertEquals(emptyStringList.tail.prev, emptyStringList.head);
		assertEquals(emptyStringList.size, 0);
	}

	/**
	 * Test the size method when the list has 2 items
	 */
	@Test
	public void testSize() {
		this.populateTwoIntList();
		assertEquals(2, this.twoIntList.size());
	}
}