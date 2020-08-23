package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class FibonacciDynamicProgramming
{
    public static void main(String[] args) throws InterruptedException
    {
        FibonacciDynamicProgramming f = new FibonacciDynamicProgramming();
        int res;

        //Memoization
        System.out.println("Memoization");
        res = f.fiboMemoization(45);
        System.out.println(res);
        System.out.println(LocalDateTime.now());

        //Non-Memo
        System.out.println();
        System.out.println(LocalDateTime.now());
        res = f.fibo2(45);
        System.out.println(res);
        System.out.println(LocalDateTime.now());

    }

    static int[] s = new int[100];

    FibonacciDynamicProgramming()
    {
        s[0] = 1;
        s[1] = 1;
    }

    private static int fiboMemoization(int n) throws InterruptedException
    {
        //Thread.sleep(10);
        if (s[n] == 0) {
            s[n] = fiboMemoization(n - 2) + fiboMemoization(n - 1);
        }

        return s[n];
    }

    private static int fibo2(int n)
    {
        if (n == 0 || n == 1)
            return 1;

        return fibo2(n - 2) + fibo2(n - 1);
    }
}
