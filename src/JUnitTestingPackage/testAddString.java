package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnitFunction.addStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
