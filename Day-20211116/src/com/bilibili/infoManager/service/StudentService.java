package com.bilibili.infoManager.service;

import com.bilibili.infoManager.dao.StudentDao;
import com.bilibili.infoManager.domain.Student;

public class StudentService {
    //数据操作类
    private static StudentDao studentDao = new StudentDao();

    //添加服务
    public boolean addService(Student student) {
        return studentDao.addStudent(student);
    }
    //删除服务
    public void delService() {
    }
    //修改服务
    public void updateService() {
    }
    //查询所有服务
    public void srcAllService() {
    }
    //验证id
    public boolean checkId(String id) {
        Student[] stuArr = studentDao.srcAll();
        for (int i = 0; i < stuArr.length; i++) {
            if(stuArr[i] != null && stuArr[i].getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
