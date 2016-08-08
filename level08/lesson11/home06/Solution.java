package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> all = new ArrayList<Human>();
        Human c1 = new Human("c1", true,1, null);
        Human c2 = new Human("c2", true,3, null);
        Human c3 = new Human("c3", false,5, null);
        ArrayList<Human> list = new ArrayList<Human>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Human f = new Human("f", true,20, list);
        Human m = new Human("m", false,20, list);
        ArrayList<Human> listm = new ArrayList<Human>();
        listm.add(m);
        Human d1 = new Human("d1",true,50,listm);
        Human m1 = new Human("m1",false,50,listm);
        ArrayList<Human> listf = new ArrayList<Human>();
        listf.add(f);
        Human d2 = new Human("d2",true,50,listf);
        Human m2 = new Human("m2",false,50,listf);

        Collections.addAll(all,d2,m2,d1,m1,f,m,c1,c2,c3);
         for(Human h:all)System.out.println(h);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
         public Human(String name, boolean sex, int age, ArrayList<Human> children){

             this.name = name;
             this.sex = sex;
             this.age = age;
             this.children = new ArrayList<Human>();
             if(children!=null && children.size()>0)this.children.addAll(children);
         }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
