package com.liumin.study.clone;

/**
 * @Author:lm
 * @Despriction:
 * @Date:2019/4/3 11:24
 */
public class Person {

    public int age;
    public String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}