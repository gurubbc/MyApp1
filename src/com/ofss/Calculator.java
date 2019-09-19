package com.ofss;

import java.util.*;

public class Calculator
{
    private static int solution;
    private int x;
    private int y;
    private char operators;

    public Calculator()
    {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
    }

    public static int addition(int x, int y)
    {
       return x + y;
    }
    public static int subtraction(int x, int y)
    {
       return x - y;
    }
    public static int multiplication(int x, int y)
    {    
       return x * y;
    }
    public static int division(int x, int y)
    {
       solution = x / y;
       return solution;
    }
}