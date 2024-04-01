package at.htl.lego.solution.searching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Bsp001Test {

    @Test
    void testBinarySearch() {

        int[] given = {3, 5, 36, 37, 37, 44, 63, 79, 80, 90};
        int expectedPosition = Bsp001.binaerSuchen(given, 3);
        assertThat(expectedPosition).isEqualTo(0);
    }

    @Test
    void runBubbleSort() {
        int[] given = {5, 3, 1};
        Bsp001.sortList(given);
        System.out.println(Arrays.toString(given));

    }

    @Test
    void runBubbleSortForDebugging() {
        int[] given = {3, 1, 6, 5, 2, 4};
        Bsp001.sortList(given);
        System.out.println(Arrays.toString(given));
    }

    @Test
    void runBubbleSortInASortedArray() {
        int[] given = {1, 2, 3, 4, 5, 6};
        Bsp001.sortList(given);
        System.out.println(Arrays.toString(given));
    }




        @Test
        public void testSortList() {
            Bsp001 bsp001 = new Bsp001();
            int[] array = {5, 3, 8, 1, 2};
            bsp001.sortList(array);
            assertThat(array).isSorted();
        }





}