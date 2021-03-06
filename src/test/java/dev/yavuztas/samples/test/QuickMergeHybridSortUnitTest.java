package dev.yavuztas.samples.test;

import dev.yavuztas.samples.QuickMergeHybridSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickMergeHybridSortUnitTest {

    @Test
    public void whenEmptyArrayGiven_thenEmptyArrayReturns() {
        int[] actual = new QuickMergeHybridSort().sort();
        int[] expected = new int[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSingleElementArrayGiven_thenSameArrayReturns() {
        int[] actual = new QuickMergeHybridSort(99).sort();
        int[] expected = new int[]{99};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenRandomArrayGiven_thenSortedArrayReturns() {
        int[] actual = new QuickMergeHybridSort(2, 5, 6, 3, 2, 4, 9).sort();
        int[] expected = new int[]{2, 2, 3, 4, 5, 6, 9};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenAllEqualElementArrayGiven_thenSameArrayReturns() {
        int[] actual = new QuickMergeHybridSort(3, 3, 3, 3, 3, 3, 3).sort();
        int[] expected = new int[]{3, 3, 3, 3, 3, 3, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenAllDifferentElementArrayGiven_thenSortedArrayReturns() {
        int[] actual = new QuickMergeHybridSort(8, 4, 5, 7, 2, 1, 3).sort();
        int[] expected = new int[]{1, 2, 3, 4, 5, 7, 8};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenArrayWithZerosGiven_thenSortedArrayReturns() {
        int[] actual = new QuickMergeHybridSort(5, 3, 2, 0, 0, 3, 3).sort();
        int[] expected = new int[]{0, 0, 2, 3, 3, 3, 5};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenAllZeroArrayGiven_thenSameArrayReturns() {
        int[] actual = new QuickMergeHybridSort(0, 0, 0, 0, 0, 0, 0).sort();
        int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(expected, actual);
    }


}
