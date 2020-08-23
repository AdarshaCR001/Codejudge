package com.company;

public class RequiredCD
{
    public static void main(String[] args)
    {
        int res=solution2(6,1 ,6);
        System.out.println(res);
    }

    public static int solution(int N,int L,int C)
    {
        if(L>C)
            return -1;
        if(L==C)
            return N;
        int totalTime=N*L+N-1;
        int totalCD=totalTime/C;
        if(totalTime%C!=0) {
            totalCD++;
        }
        int oneCD=N/totalCD;
        if(oneCD%7==0)
        {
            int res=totalCD/(oneCD-1);
            int rem=totalCD%(oneCD-1);
            totalCD+=res;
            if(rem!=0)
                totalCD++;
        }

        return  totalCD;
    }

    public  static int  solution2(int N,int L,int C)
    {
        if(L>C)
            return -1;
        if(L==C)
            return N;

        int oneCd=0;
        //int neededTime=oneCd*L+(oneCd-1);
        for(int i=1;i<N;i++)
        {
            if(L*i+(i-1)<=C)
                oneCd=i;
            else
                break;
        }
        if(oneCd%7==0)
        {
            oneCd--;
        }

        int totalCd=N/oneCd;

        if(N%oneCd!=0)
            totalCd++;
        if(N%7==0)
            totalCd++;

        return totalCd;
    }
}
