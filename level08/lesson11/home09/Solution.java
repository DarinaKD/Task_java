package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date)
    {   Date dat = new Date(date);
        Date dat2 = new Date(dat.getYear(),0,1);

        long t = dat.getTime()-dat2.getTime();//System.out.println("dat1 "+dat+" dat "+dat2+ t);
      //  t=t==0? 1:t;
        long d = t/(60*60*24*1000)+1;
      //  if(d==0) return true;
        if(d%2==0) return false;
        return true;
    }
}
