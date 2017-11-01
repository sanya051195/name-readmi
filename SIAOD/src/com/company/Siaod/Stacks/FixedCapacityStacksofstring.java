package com.company.Siaod.Stacks;

public class FixedCapacityStacksofstring {

    private String[] s;
    private int N = 0;



    public FixedCapacityStacksofstring (int capacity) { s = new String [capacity] ; }

    public boolean isEmpty(){return N == 0; }

    public void puch(String item) {s[N++] = item; }

    public String pop() {
        String item = s[--N];
        s[N] = null;
        return item;
    }
}