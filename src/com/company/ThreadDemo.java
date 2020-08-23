package com.company;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo
{

    public static void main(String[] args) throws InterruptedException
    {
        List<String> mainNames=new ArrayList<>();
        Looper looper=new Looper(mainNames);

        List<String> names1=new ArrayList<>();
        names1.add("Adarsha");
        names1.add("Abhishek");
        names1.add("Ajay");
        names1.add("Abhi");

        MyThread thread1=new MyThread(looper,names1);

        List<String> names2=new ArrayList<>();
        names2.add("Bharath");
        names2.add("Bhanu");
        names2.add("Bhima");
        names2.add("Bhisma");

        MyThread thread2=new MyThread(looper,names2);


        List<String> names3=new ArrayList<>();
        names3.add("charath");
        names3.add("chanu");
        names3.add("chima");
        names3.add("chisma");

        MyThread thread3=new MyThread(looper,names3);

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        for (String name:mainNames)
        {
            System.out.println(name);
        }

    }
}

class MyThread extends Thread
{
    Looper looper;
    List<String> names;
    static boolean shouldWait=true;
    MyThread(Looper looper,List<String> names)
    {
        this.looper=looper;
        this.names=names;
    }

    public void run()
    {
        for(String name:names)
        {
            try {
                looper.notifier();
                looper.adder(name);
                looper.notifier();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Looper
{
    List<String> names;
    boolean flag = false;
    Looper(List<String> names)
    {
        this.names=names;
    }
    public synchronized void notifier()
    {
        notify();
    }
    public synchronized void adder(String name) throws InterruptedException
    {
        names.add(name);
        wait(50);
    }

}
