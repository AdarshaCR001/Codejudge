package com.company;

public class ArrayMultiplacation
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5};

        int[] res=solution(nums);
        for (int n:res)
        {
            System.out.print(n+" ");
        }
    }

    public static int[] solution(int[] nums)
    {
        int totalSum=1;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
                totalSum=totalSum*nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(totalSum!=0)
                result[i]=totalSum/nums[i];
        }

        return result;
    }
}
