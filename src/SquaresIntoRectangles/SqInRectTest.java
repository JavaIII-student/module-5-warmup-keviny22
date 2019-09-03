package SquaresIntoRectangles;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import java.util.Random;

public class SqInRectTest {

	@Test
	public void test1() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), SquaresIntoRectangles.sqInRect(5, 3));
	}
	@Test
	public void test2() {
		assertEquals(null, SquaresIntoRectangles.sqInRect(5, 5));
	}
	@Test
	public void test3() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), SquaresIntoRectangles.sqInRect(3, 5));
	}
	@Test
	public void test4() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(14, 6, 6, 2, 2, 2)), SquaresIntoRectangles.sqInRect(20, 14));
	}
	@Test
	public void test5() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(14, 6, 6, 2, 2, 2)), SquaresIntoRectangles.sqInRect(14, 20));
	}
	@Test
	public void test6() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(32, 32, 32, 32, 32, 32, 32, 16, 16)), SquaresIntoRectangles.sqInRect(240, 32));
	}
	@Test
	public void test7() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(230, 230, 165, 65, 65, 35, 30, 5, 5, 5, 5, 5, 5)), SquaresIntoRectangles.sqInRect(625, 230));
	}
	@Test
	public void test8() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(230, 230, 230, 41, 41, 41, 41, 41, 25, 16, 9, 7, 2, 2, 2, 1, 1)), SquaresIntoRectangles.sqInRect(731, 230));
	}
	@Test
	public void test9() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(14, 14, 9, 5, 4, 1, 1, 1, 1)), SquaresIntoRectangles.sqInRect(37, 14));
	}
	@Test
	public void test10() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(1, 1)), SquaresIntoRectangles.sqInRect(2, 1));
	}
	
	public static List<Integer> sqInRectTest(int lng, int wdth) {
		if (lng == wdth) return null;
		if (lng < wdth) {
			int tmp = lng;
			lng = wdth;
			wdth = tmp;
		}
		List<Integer> res = new ArrayList<Integer>();
		while (lng != wdth) {
			res.add(wdth);
			lng -= wdth;
			if (lng < wdth) {
				int tmp = lng;
				lng = wdth;
				wdth = tmp;
			}
		}
		res.add(wdth);
		return res;
	}
	@Test
	public void test() {
		Random rnd = new Random();
		List <Integer> someLengths = new ArrayList<Integer>(Arrays.asList(
				55,89,144,233,377,610,987,1597,2584,418,
                676,41,99,56,78,907,561,453,32,12,
                24,13,59,90,21,66,77,88,62,11));
		List <Integer> someWidths = new ArrayList<Integer>(Arrays.asList(
				22,75,121,340,52,78,157,88,55,102,
                120,73,37,44,565,1002,43,90,72,10,
                24,13,59,32,34,51,12,68,34,100));
		for (int i = 0; i < 10; i++) {
			int rn = rnd.nextInt(29);
			int f1 = someLengths.get(rn); 
			int f2 = someWidths.get(rn);
			System.out.println("Random test " + i);
			assertEquals(SqInRectTest.sqInRectTest(f1, f2), SquaresIntoRectangles.sqInRect(f1, f2));
		}
		
	}
}