package com.bilibili.extends_.person;

public class StudentLeader extends Person{
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String sex, int age, String nationality, String job) {
        super(name, sex, age, nationality);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting(){
        System.out.println("开会");
    }
}
