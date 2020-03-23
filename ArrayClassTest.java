import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayClassTest {

    @Test
    public void test() {

        int[] arr = {6, 3, 5, 10, 2, 7, 1, 8};
        int[] arrs = {1, 2, 3, 5, 6, 7, 8, 10};

        ArrayClass.sort(arr);
        assertArrayEquals(arrs, arr);

        assertEquals(1, ArrayClass.min(arr));
        assertEquals(10, ArrayClass.max(arr));
        assertEquals(3, ArrayClass.search(arrs, 5));
        assertEquals(-1, ArrayClass.search(arrs, 100));
    }

    @Test
    public void search_whenNullArrayPassedThenExpectedMinusOne() {
        int resultOfSearch = ArrayClass.search(null, 0);
        Assert.assertEquals(-1, resultOfSearch);
    }

    @Test
    public void search_whenEmptyArrayPassedThenExpectedMinusOne() {
		Random random = new Random();
		// Generate random integers in range 0 to 999
        int randInt = random.nextInt(1000);
        int[] emptyArray = new int[]{};

        int resultOfSearch = ArrayClass.search(emptyArray, randInt);
        Assert.assertEquals(-1, resultOfSearch);
    }
}
