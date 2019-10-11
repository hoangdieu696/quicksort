package devops.quicksort;

import static org.junit.Assert.assertArrayEquals;

import org.testng.annotations.Test;

public class QuicksortTestNG {

	private static Quicksort qs = new Quicksort();

	@Test
	public void successSortInt() {

		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] test = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		qs.run(test, 0, test.length - 1);

		assertArrayEquals(expected, test);
	}
}
