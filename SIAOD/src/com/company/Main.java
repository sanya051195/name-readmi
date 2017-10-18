package com.company;

import com.company.Siaod.Stacks.Stacksofstring;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    }
   private static void StachOfStrings (Scanner in, PrintStream out){

       Stacksofstring stack = new Stacksofstring();
        while(in.hasNext()) {
            String s = in.next();
            if ((s.equals("-"))) {
                out.print(stack.pop()+" ");
            } else {
                stack.push(s);
        }
   }
}
public static void main (String[]args) throws