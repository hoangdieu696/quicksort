package devops.quicksort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuicksortTest {

	private static Quicksort qs = new Quicksort();
	
	@Test
	public void successSortInt() {

		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] test = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		qs.run(test, 0, test.length - 1);
		
		assertArrayEquals(expected, test);
	}
	
	@Test
	public void successSortFloat() {

		double[] expected = { 1.2, 2.3, 3.5, 4.1, 4.6, 6.0, 7.2 };
		double[] test = { 1.2, 2.3, 4.6, 4.1, 6.0, 7.2, 3.5 };
		
		qs.run(test, 0, test.length - 1);
		
		assertArrayEquals(expected, test, 0);
		
	}
	
	@Test
	public void successSortChar() {

		char[] expected = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		char[] test = { 'g', 'd', 'e', 'f', 'b', 'a', 'c' };
		
		qs.run(test, 0, test.length - 1);
		
		assertArrayEquals(expected, test);
		
	}
}
