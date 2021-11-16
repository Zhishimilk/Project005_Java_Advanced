package com.bilibili.infoManager.dao;

import com.bilibili.infoManager.domain.Student;

public class StudentDao {
    private static Student[] stuArr = new Student[5];

    public boolean addStudent(Student student) {

        //记录学生数组中空数据的索引
        int index = -1;
        for (int i = 0; i < stuArr.length; i++) {
            if(stuArr[i] == null){
                index = i;
            }
        }

        //存在为空的索引就进行"添加"
        if(index != -1){
            stuArr[index] = student;
            return true;
        }
        return false;
    }

    public Student[] srcAll() {
        return stuArr;
    }
}
