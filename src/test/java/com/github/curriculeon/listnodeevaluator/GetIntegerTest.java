package com.github.curriculeon.listnodeevaluator;

import com.github.curriculeon.ListNodeEvaluator;
import org.junit.Assert;
import org.junit.Test;

public class GetIntegerTest {
    private void test(Integer expected, Integer... input) {
        // given
        ListNodeEvaluator evaluator = new ListNodeEvaluator(input);

        // when
        Integer actual = evaluator.getIntegerValue();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThreeDigit1() {
        test(100, 1, 0, 0);
    }

    @Test
    public void testThreeDigit2() {
        test(123, 1, 2, 3);
    }

    @Test
    public void testThreeDigit3() {
        test(243, 2, 4, 3);
    }

    @Test
    public void testTwoDigit1() {
        test(10, 0, 1, 0);
    }

    @Test
    public void testTwoDigit2() {
        test(20, 0, 2, 0);
    }

    @Test
    public void testTwoDigit3() {
        test(30, 0, 3, 0);
    }

    @Test
    public void testOneDigit1() {
        test(0, 0, 0, 0);
    }

    @Test
    public void testOneDigit2() {
        test(1, 0, 0, 1);
    }

    @Test
    public void testOneDigit3() {
        test(2, 0, 0, 2);
    }

    @Test
    public void testNegative1() {
        test(-112, -1, 1, 2);
    }

    @Test
    public void testNegative2() {
        test(-212, -2, 1, 2);
    }

    @Test
    public void testNegative3() {
        test(-312, -3, 1, 2);
    }

    @Test(expected = NumberFormatException.class)
    public void testException1() {
        test(0, 1, -2, 2);
    }

    @Test(expected = NumberFormatException.class)
    public void testException2() {
        test(0, 1, -1, 2);
    }

    @Test(expected = NumberFormatException.class)
    public void testException3() {
        test(0, 1, 1, -2);
    }
}
