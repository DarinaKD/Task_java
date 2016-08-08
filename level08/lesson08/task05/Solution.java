//package com.javarush.test.level08;
package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for(Map.Entry<String,String> par : map.entrySet()){
          System.out.println(par.getKey()+"-"+par.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        HashMap m = new HashMap();
        m .put("Гулаева", "Анна");
        m.put("Смердяков", "Алексей");
        m.put("Попова", "Анна");
        m.put("Попович", "Иван");
        m.put("Пенькова", "Мария");
        m.put("Пеньков", "Алёна");
        m.put("Вострецова", "Анна");
        m.put("Попов", "Алексей");
        m.put("Звягин", "Алексей");
        m.put("Долгушина", "Юлия");
        return m;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashSet<String> ad = new HashSet<String>();
        HashMap<String, String> cop = new HashMap<String, String>(map);
        for(Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext();)
        {
            Map.Entry<String, String> par = it.next();
            if(cop.containsKey(par.getKey()))
            {
                cop.remove(par.getKey());
            }
            String key = par.getKey();
            String val = par.getValue();
            if (cop.containsValue(par.getValue()))
            {
                //removeItemFromMapByValue(map, val);
                ad.add(val);
            }



        }
        Iterator<String> pad = ad.iterator();
        while(pad.hasNext()){
     //   for(Map.Entry<String> pad:ad.entrySet()){
          //  map.(pad.getKey(),pad.getValue());
            removeItemFromMapByValue(map, pad.next());
        }


  }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}


/*public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> people = new HashMap<String, String>();

        people.put( "Ivanov", "Ivan" );
        people.put( "Petrov", "Petr" );
        people.put( "Sidorov", "Ivan" );
        people.put( "Semenov", "Sergey" );
        people.put( "Frolov", "Igor" );
        people.put( "Sergeev", "Igor" );
        people.put( "Kostenko", "Alexey" );
        people.put( "Petrenko", "Sergey" );
        people.put( "Dmitriev", "Sergey" );
        people.put( "Nikonov", "Petr" );

        return people;
    }

    public static void removeTheFirstNameDuplicates( HashMap<String, String> map )
    {
        Set<String> setNames = new HashSet<String>();
        Set<String> duplicateNames = new HashSet<String>();
       Collections.frequency(map.values(),"as");
        for ( Map.Entry<String, String> pair : map.entrySet() )
        {
            String name = pair.getValue();

            if ( setNames.contains( name ) )
            {
                duplicateNames.add( name );
            }
            else
            {
                setNames.add( name );
            }
        }

        for ( String name : duplicateNames )
        {
            removeItemFromMapByValue( map, name );
        }
    }

    public static void removeItemFromMapByValue( HashMap<String, String> map, String value )
    {
        HashMap<String, String> copy = new HashMap<String, String>( map );
        for ( Map.Entry<String, String> pair : copy.entrySet() )
        {
            if ( pair.getValue().equals( value ) )
            {
                map.remove( pair.getKey() );
            }
        }
    }

    public static void main( String[] args )
    {
        HashMap<String, String> map = createMap();

        removeTheFirstNameDuplicates( map );
    }
}*/