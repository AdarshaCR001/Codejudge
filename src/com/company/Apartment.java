package com.company;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Apartment
{
    static Apartment apartment;
    static int count=0;

    public  static  void main(String[] args) throws InterruptedException
    {
//        Apartment apartment1=new Apartment();
//        apartment1=null;
//        System.gc();
//        Thread.sleep(1000);
//        apartment=null;
//        System.gc();
//        Thread.sleep(1000);

        // milliseconds
        long miliSec =Long.parseLong("1573594032528");

        Date date = new Date(miliSec);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date gmt = new Date(sdf.format(date));
        System.out.println(gmt);


    }

    @Override
    protected void finalize() throws Throwable
    {
        count++;
        apartment=this;
    }

    //    static int[] solve(int size_of_magor, int[] elements_of_magor){
//        // Write your code here
//        List mergeAppartment=new ArrayList<Integer>();
//        int j=0;
//        int prev=0;
//        for(int i=0;i<size_of_magor;i++)
//        {
//            if(i==0||(prev>0&&elements_of_magor[i]<0)||(prev<0&&elements_of_magor[i]>0))
//            {
//                prev=elements_of_magor[i];
//                mergeAppartment.add(elements_of_magor[i]);
//                j++;
//            }
//            else
//            {
//                int mergeSum=(int)mergeAppartment.get(j)+elements_of_magor[i];
//                mergeAppartment.set(j,mergeSum);
//            }
//        }
//
//        int[] result= new int[2];
//        result[0]=mergeAppartment.size();
//        int max1=0,max2=0,max3=0;
//        for(int i=0;i<mergeAppartment.size();i++)
//        {
//            if((int)mergeAppartment.get(i)>0)
//            {
//                max1+=(int)mergeAppartment.get(i);
//            }
//            else
//            {
//                max2++;
//            }
//            if(max2>2)
//            {
//                break;
//            }
//        }
//        result[1]=5;
//        return  result;
//
//    }
}
