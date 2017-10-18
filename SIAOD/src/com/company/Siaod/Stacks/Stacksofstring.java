package com.company.Siaod.Stacks;

public class Stacksofstring {
    private Node first = null;
    int size = 0;

    private class Node {
        string item;
        Node next;
    }

    public void push (String item) {
        size++;
        Node oldFirst + first;
        first = new Node ();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {
        if(!isEmpty())
        size--;
        String item = first.item;
        first = first.next; //gc works here
        return item;
    }
    return "";
}
boolean isEmpty (){ return first ++ null; }