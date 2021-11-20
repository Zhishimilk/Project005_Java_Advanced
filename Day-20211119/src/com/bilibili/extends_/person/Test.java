package com.bilibili.extends_.person;

public class Test {
    public static void main(String[] args) {

//        Student student = new Student();
//        Worker worker = new Worker();
//        StudentLeader studentLeader = new StudentLeader();
//
//        student.work();
//        worker.work();
//        studentLeader.meeting();


        Fu zi = new Zi();
        _interFace zi2 = new Zi();

        Zi zi1 = (Zi) zi;
        Fu zi3 = (Zi)zi2;
        Fu zi4 = (Fu)zi2;
        _interFace zi5 = (_interFace) zi;
        _interFace zi6 = (Zi) zi;

    }
}

class Fu{
    public void method(){
        System.out.println("fu");
    }
}

class Zi extends Fu implements _interFace{
    @Override
    public void method() {
        System.out.println("zi");
    }

    public void eat(){
        System.out.println("吃");
    }
}
