package com.javarush.test.level08.lesson08.task05.task03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args){
        HashSet<Integer> set1 = createSet();
        HashSet<Integer> set = removeAllNumbersMoreThan10(set1);
        for(int n:set) System.out.println(n);
    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> si = new HashSet<Integer>();
        for(int i=0; i<20; i++)
            si.add(i+1);
        return si;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            int n= it.next();
            if (n > 10) it.remove();
        }
        return set;
    }
}