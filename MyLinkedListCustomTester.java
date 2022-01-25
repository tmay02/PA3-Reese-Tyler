/**
 * Name: Tyler May, Reese Whitlock
 * ID: A16792035, A17074829
 * Email: tjmay@ucsd.edu, rwhitlock@ucsd.edu
 * Sources used: Coding done jointly, 
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
		twoIntList.add(1);
		twoIntList.add(2);
	}

	/**
	 * TODO: test the add method when [fill in a possible edge case here]
	 */
	@Test
	public void testAdd() {

	}

	/**
	 * TODO: test the add with index method when [...]
	 */
	@Test
	public void testAddWithIndexTestOne() {

	}

	/**
	 * TODO: test the add with index method when [fill in another one here]
	 */	
	@Test
	public void testAddWithIndexTestTwo() {

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