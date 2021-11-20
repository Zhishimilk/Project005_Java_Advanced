package com.bilibili.extends_.person;

public class Student extends Person{
    private String school;
    private String stuNumber;

    public Student() {
    }

    public Student(String name, String sex, int age, String nationality, String school, String stuNumber) {
        super(name, sex, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学习");
    }
}
