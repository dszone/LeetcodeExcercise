package lc001.two.sum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SummerTest {
	Summer summer;
	int[] input = new int[4];

	@Before
	public void setUp() throws Exception {
		summer = new Summer();
		input[0] = 4;
		input[1] = 2;
		input[2] = 1;
		input[3] = 3;
	}

	@Test
	public void test() {
		int[] output = {0,2};
		assertArrayEquals(summer.twoSum(input, 5), output);;
	}

}
