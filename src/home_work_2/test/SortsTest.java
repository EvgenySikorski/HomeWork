package home_work_2.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import home_work_2.sorts.SortsUtils;

import java.util.Arrays;

public class SortsTest {


    @Test
    public void sortsBubble1() {
        int[] arrTest1 = new int[]{6, 8, 2, 4, 7};

        String resultExpect = "[2, 4, 6, 7, 8]";

        Assertions.assertEquals(resultExpect, Arrays.toString(SortsUtils.bubble(arrTest1)));
    }

    @Test
    public void sortsBubble2() {
        int[] arrTest2 = new int[]{1, 1, 1, 1, 1};

        String resultExpect = "[1, 1, 1, 1, 1]";

        Assertions.assertEquals(resultExpect, Arrays.toString(SortsUtils.bubble(arrTest2)));
    }
}
