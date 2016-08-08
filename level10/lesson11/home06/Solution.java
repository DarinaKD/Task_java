package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human moth;
        Human fath;
        ArrayList<Human> children;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human moth, Human fath){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.moth = moth;
        this.fath = fath;
    }
        public Human(String name, boolean sex, int age, Human moth, Human fath,ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.moth = moth;
            this.fath = fath;
            this.children = new ArrayList<Human>(children);
        }

        public Human(String name, boolean sex, int age,ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(children);
        }
        public Human(String name,Human moth, Human fath,ArrayList<Human> children){
        this.name = name;
        this.moth = moth;
        this.fath = fath;
        this.children = new ArrayList<Human>(children);
    }
        public Human(String name, ArrayList<Human> children){
            this.name = name;
            this.moth = moth;
            this.fath = fath;
            this.children = new ArrayList<Human>(children);
        }
        public Human(String name,Human moth, Human fath){
            this.name = name;
            this.moth = moth;
            this.fath = fath;
            this.children = new ArrayList<Human>(children);
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;

        }
        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;

        }
    }
}
