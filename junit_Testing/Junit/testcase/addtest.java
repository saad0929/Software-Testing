package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class addtest {

	
	@Test
	public void addtest1() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("abcdf");
		assertEquals(true, result);
	}
	@Test
	public void addtest2() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("a");
		assertEquals(true, result);
	}
	@Test
	public void addtest3() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("ababababab");
		assertEquals(true, result);
	}
	@Test
	public void addtest4() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("abababababb");
		assertEquals(false, result);
	}
	@Test
	public void addtest5() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("");
		assertEquals(false, result);
	}
	
	


}
