package level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
       // ArrayList<String> mon = new ArrayList<String>();
        //Collections.addAll(mon,"january","february","march","april","may","june","july","august","september","october","november","december");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
      //  int ind = mon.indexOf(month.toLowerCase())+1;
        Map <String, Integer> mapMonths = new HashMap<String, Integer>(); //создаем и инициализируем мапу для хранения значений

        mapMonths.put("January", 1);
        mapMonths.put("February", 2);
        mapMonths.put("March", 3);
        mapMonths.put("April", 4);
        mapMonths.put("May", 5);
        mapMonths.put("June", 6);
        mapMonths.put("July", 7);
        mapMonths.put("August", 8);
        mapMonths.put("September", 9);
        mapMonths.put("October", 10);
        mapMonths.put("November", 11);
        mapMonths.put("December", 12);

      //  for(Map.Entry<String,Integer> pair:mapMonths.entrySet()){
       //     if(pair.getKey().equals(month))
       // }
       int ind = mapMonths.get(month);
        System.out.println(month +" is "+ind+" month");

    }

}
