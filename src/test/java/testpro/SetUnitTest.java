package testpro;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SetUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test 
	public void testEmptySetContainShouldFail () {
		SetTest<Integer> obj = new SetTest<Integer>();
		
		Integer testEle = new Integer(1);
		assertFalse(obj.contains(testEle));
	}
	
	@Test 
	public void integer_should_contain_element_after_add_into_the_set() {
		SetTest<Integer> obj = new SetTest<Integer>();
		
		Integer testEle = new Integer(1);
		assertFalse(obj.contains(testEle));
		
		obj.addElement(testEle);
		assertTrue(obj.contains(testEle));
	}
	
	@Test
	public void integer_should_contain_no_null_element_after_remove_null_element() throws NoSuchElementException, EmptySetException {
		SetTest<Integer> obj = new SetTest<Integer>();
		assertFalse(obj.contains(null));
		
		obj.addElement(null);
		assertTrue(obj.contains(null));
		obj.remove(null);
		assertFalse(obj.contains(null));
	}
	
	@Test
	public void integer_should_contain_the_element_after_add_into_set() {
		SetTest<Integer> obj = new SetTest<Integer>();
		assertEquals(0, obj.getSize());
		Integer testEle = new Integer(1);
		obj.addElement(testEle);
		assertTrue(obj.contains(testEle));
	}
}
