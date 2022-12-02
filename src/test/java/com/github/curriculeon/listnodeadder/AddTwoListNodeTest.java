package com.github.curriculeon.listnodeadder;

import com.github.curriculeon.ListNode;
import com.github.curriculeon.ListNodeAdder;
import com.github.curriculeon.ListNodeEvaluator;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoListNodeTest {

    @Test
    public void test() {
        // given
        ListNodeAdder listNodeAdder = new ListNodeAdder();
        ListNodeEvaluator listNode1 = new ListNodeEvaluator(new int[]{1, 2, 3});
        ListNodeEvaluator listNode2 = new ListNodeEvaluator(new int[]{4, 5, 6});
        String expected = "ListNode{val=9, next=ListNode{val=7, next=ListNode{val=5, next=null}}}";

        // when
        ListNode actualNode = listNodeAdder.addTwoNumbers(listNode1.getHead(), listNode2.getHead());
        String actual = actualNode.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

}

