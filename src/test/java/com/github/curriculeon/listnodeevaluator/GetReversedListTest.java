package com.github.curriculeon.listnodeevaluator;

import com.github.curriculeon.ListNode;
import com.github.curriculeon.ListNodeEvaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GetReversedListTest {
    private void test(Integer expected, Integer... input) {
        // given
        ListNodeEvaluator evaluator = new ListNodeEvaluator(input);

        // when
        List<ListNode> result = evaluator.getReversedList();
        for (int i = 0; i < input.length; i++) {
            ListNode currentNode = result.get(i);
            int expectedValue = input[i];
            int actualValue = currentNode.val;

            // then
            Assert.assertEquals(expectedValue, actualValue);
        }
    }


    @Test
    public void testThreeDigit1() {
        test(100,  0,0,1);
    }

    @Test
    public void testThreeDigit2() {
        test(123, 3,2,1);
    }

    @Test
    public void testThreeDigit3() {
        test(243, 3,4,2);
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
}
