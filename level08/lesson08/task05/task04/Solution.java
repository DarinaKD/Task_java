package com.javarush.test.level08.lesson08.task05.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args){
        HashMap<String, Date> m = createMap();
        removeAllSummerPeople(m);
        for(Map.Entry<String,Date> p: m.entrySet()) System.out.println(p.getKey()+" "+p.getValue());
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Сталлоне2", new Date("JUNE 2 1980"));
        map.put("Сталлоне3", new Date("JUNE 1 1980"));
        map.put("Сталлоне4", new Date("JUNE 1 1980"));
        map.put("Сталлоне5", new Date("JUNE 1 1980"));
        map.put("Сталлоне6", new Date("JUNE 1 1980"));
        map.put("Сталлоне7", new Date("MAY 1 1980"));
        map.put("Сталлоне8", new Date("SEPTEMBER 1 1980"));
        map.put("Сталлоне9", new Date("AUGUST 1 1980"));
        map.put("Сталлоне10", new Date("JUNE 1 1980"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String, Date> p = it.next();
            if(p.getValue().getMonth()>=5 && p.getValue().getMonth()<=7) it.remove();
        }
    }
}