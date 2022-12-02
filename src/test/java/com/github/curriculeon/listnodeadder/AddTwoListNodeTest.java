package com.github.curriculeon.listnodeadder;

import com.github.curriculeon.ListNode;
import com.github.curriculeon.ListNodeAdder;
import com.github.curriculeon.ListNodeEvaluator;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoListNodeTest {
    // given
    private void test(int value1, int value2, String expected) {
        ListNodeAdder listNodeAdder = new ListNodeAdder();
        ListNodeEvaluator listNode1 = new ListNodeEvaluator(value1);
        ListNodeEvaluator listNode2 = new ListNodeEvaluator(value2);

        // when
        ListNode actualNode = listNodeAdder.addTwoNumbers(listNode1.getHead(), listNode2.getHead());
        String actual = actualNode.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        // given
        test(123, 456, "ListNode{val=9, next=ListNode{val=7, next=ListNode{val=5, next=null}}}");
    }

    @Test
    public void test2() {
        // given
        test(111, 456, "ListNode{val=7, next=ListNode{val=6, next=ListNode{val=5, next=null}}}");
    }

    @Test
    public void test3() {
        // given
        test(222, 456, "ListNode{val=8, next=ListNode{val=7, next=ListNode{val=6, next=null}}}");
    }

    @Test
    public void test4() {
        // given
        test(101, 231, "ListNode{val=2, next=ListNode{val=3, next=ListNode{val=3, next=null}}}");
    }
}