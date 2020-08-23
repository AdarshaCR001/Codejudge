package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumber
{
    public static void main(String args[])
    {
        int[] nums = {4, 1, 2, 1, 2};
        int res = singleNumber(nums);

        System.out.println(res);
    }

    public static void convertArrayToList(int array[])
    {

        // Create the List by passing the Array
        // as parameter in the constructor
        List<Integer> you = Arrays.stream(array).boxed().collect(Collectors.toList());

    }

    public static int singleNumber2(int[] nums)
    {
        Set<Integer> unique = new TreeSet<>();
        List<Integer> you = Arrays.stream(nums).boxed().collect(Collectors.toList());
        unique.addAll(you);

        for (Integer aSiteId : unique) {
            System.out.println(aSiteId);
            //return  aSiteId;
        }

        return 0;
    }

    public static int singleNumber(int[] nums)
    {
        //write the solution here.
        Map m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                //Integer oldVal= (Integer) ;
                m.put(nums[i], (Integer) m.get(nums[i]) + 1);
            } else {
                m.put(nums[i], 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return 0;
    }
}
