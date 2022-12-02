package com.github.curriculeon;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListNodeEvaluator {
    private final ListNode head;

    public ListNodeEvaluator(ListNode head) {
        this.head = head;
    }

    public ListNodeEvaluator(Integer values) {
        this(Stream
                .of(values.toString().split(""))
                .map(str -> Integer.parseInt(str))
                .toArray(Integer[]::new));
    }

    public ListNodeEvaluator(Integer... values) {
        this(new ListNode(values[0]));
    }

    public Integer getIntegerValue() {
        return null;
    }

    public List<ListNode> getReversedList() {
        return null;
    }

    public List<ListNode> getList() {
        return null;
    }

    public ListNode getHead() {
        return head;
    }
}