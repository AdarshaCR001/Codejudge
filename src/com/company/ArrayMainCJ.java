package com.company;

import java.util.Scanner;  // Import the Scanner class


class ArrayMainCJ
{

    public static int[] takeInput(String input)
    {
        if (input.length() == 0) {
            return new int[0];
        }
        String[] parts = input.split(" ");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            if (!part.isEmpty())
                try {
                    output[index] = Integer.parseInt(part);
                } catch (Exception e) {
                    System.out.println(part);
                    System.out.println(index);
                    System.out.println("continue");
                    System.out.println(e.getMessage());
                }
            output[index] = Integer.parseInt(part);
        }

        return output;
    }

    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  //  a Scanner object
        String line = myObj.nextLine();  // Read user input
        int[] numbers = takeInput(line.trim().trim());
        int[] product = new Solution2().multiplicativePuzzle(numbers);// Output user input
        for (int i : product) {
            System.out.print(i + " ");
        }
        myObj.close();
    }
}

class Solution2
{
    public int[] multiplicativePuzzle(int[] nums)
    {
        //write solution here.
        System.out.println("Hello " + nums.length);
        int totalSum = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum * nums[i];
        }


        for (int i = 0; i < nums.length; i++) {
            if (totalSum != 0)
                result[i] = totalSum / nums[i];
        }

        return result;
    }
}

