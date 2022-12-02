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
        List<Integer> ints = new LinkedList<>();
        for (int i = 0; i < values.length; i++) {
            Integer value = values[i];
            ints.add(value);
        }
        Collections.reverse(ints);
        ListNode currentListNode = null;
        ListNode previousListNode = head;
        for (int i = 1; i < ints.size(); i++) {
            int previousDigit = ints.get(i-1);
            int currentDigit = ints.get(i);
            currentListNode = new ListNode(currentDigit);
            previousListNode.val = previousDigit;
            previousListNode.next = currentListNode;
            previousListNode = currentListNode;
        }
    }

    public Integer getIntegerValue() {
        return Integer.valueOf(getReversedList()
                .stream()
                .map(node -> String.valueOf(node.val))
                .collect(Collectors.toList())
                .toString()
                .replaceAll("\\[", "")
                .replaceAll(",", "")
                .replaceAll("]", "")
                .replaceAll(" ", ""));
    }

    public List<ListNode> getReversedList() {
        List<ListNode> list = getList();
        System.out.println(list);
        Collections.reverse(list);
        return list;
    }

    public List<ListNode> getList() {
        List<ListNode> result = new LinkedList<>();
        ListNode previousNode = head;
        ListNode currentNode = null;
        result.add(previousNode);
        while (previousNode.next != null) {
            currentNode = previousNode.next;
            result.add(currentNode);
            previousNode = currentNode;
        }
        return result;
    }

    public ListNode getHead() {
        return head;
    }
}