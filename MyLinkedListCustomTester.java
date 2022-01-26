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
		this.twoIntList.add(1, 3);
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
			this.emptyStringList.add(2, "String!");
		} catch (IndexOutOfBoundsException E){
			test = true;
		}
		assertTrue(test);
	}

	/**
	 * TODO: test the get method when [...]
	 */
	@Test
	public void testGet() {

	}

	/**
	 * TODO: test the getNth method when [...]
	 */
	@Test
	public void testGetNth() {

	}

	/**
	 * TODO: test the set method when [...]
	 */
	@Test
	public void testSet() {

	}

	/**
	 * TODO: test the remove method when [...]
	 */
	@Test
	public void testRemoveTestOne() {

	}
	
	/**
	 * TODO: test the remove method when [fill in another one here]
	 */
	@Test
	public void testRemoveTestTwo() {

	}

	/**
	 * TODO: test the clear method when [...]
	 */
	@Test
	public void testClear() {

	}

	/**
	 * TODO: test the size method when [...]
	 */
	@Test
	public void testSize() {

	}
}