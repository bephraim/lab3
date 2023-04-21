import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] a1 = new int[]{1,2,3};
    ArrayExamples.reverseInPlace(a1);
    assertArrayEquals(new int[]{3,2,1}, a1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] a1 = new int[]{1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(a1));
  }

  @Test public void testAverageWithoutLowest() {
    double[] d4 = new double[]{3,3,3};
    assertEquals(3, ArrayExamples.averageWithoutLowest(d4), 0.0);
}
}
