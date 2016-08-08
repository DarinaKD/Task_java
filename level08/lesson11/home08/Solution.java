package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {  int max, ind;
       for(int i=0; i< array.length-1; i++){
           max = array[i];
           ind = i;
           for(int j=i+1; j<array.length; j++){
               if(max<array[j]){
                   ind=j;
                   max = array[j];

               }
           }
           if(i!=ind)
           {
               array[ind] = array[i];
               array[i] = max;
           }

       }
    }
}