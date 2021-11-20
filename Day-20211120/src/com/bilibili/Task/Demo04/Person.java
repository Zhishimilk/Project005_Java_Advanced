package com.bilibili.Task.Demo04;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



//    public void keepPet(Dog dog, String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"的"+dog.getAge()+"的宠物");
//        dog.eat(something);
//    }

    public void keepPet(Animal animal, String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animal.getColor()+"的"+animal.getAge()+"岁的宠物");
       animal.eat(something);
    }

}
