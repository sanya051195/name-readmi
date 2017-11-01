package com.company;


import com.company.Siaod.Stacks.StacksofItems;
import com.company.Siaod.Stacks.Stacksofstring;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {



    private static void StacksofItems(Scanner in, PrintStream out) {

        StacksofItems<Integer> stack = new StacksofItems();
        while (in.hasNext()) {
            String s = in.next();
            if ((s.equals("0"))) {
                out.print(stack.pop() + " ");
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //to br or not to - br - - that - - - is
    Scanner in = new Scanner (System.in);
    PrintStream out = System.out;
        StacksofItems(in,out);
    }
}