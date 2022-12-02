package com.github.curriculeon;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        // given
        ListNodeEvaluator listNode1 = new ListNodeEvaluator(new int[]{2, 4, 3});
        ListNodeEvaluator listNode2 = new ListNodeEvaluator(new int[]{5, 6, 4});
        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(listNode1.getHead(), listNode2.getHead());

        // then
        System.out.println(actual);

    }

}

