package com.looper.work0403.work01.service;

import com.looper.work0403.work01.domain.Emp;

import java.util.List;

public interface ServiceEmp {

    //查询所有的用户
    List<Emp> allEmp();

    //判断用户是否存在
    boolean isExists(String ename);

    //注册
    boolean register(int empno, String ename, String password, Double salary, String role);

    //注册（默认角色）
    boolean register(int empno, String ename, String password, Double salary);

    //登陆
    boolean login(String ename, String password);

    //修改角色
    boolean modifyRole(int empno, String newRole);

    //修改薪资
    boolean modifySalary(int empno, Double newSalary);

    //修改密码
    boolean modifyPassword(String ename, String password, String newPassword);

    //个人信息
    Emp showEmp(String ename);

    //退出
    boolean logout(String str);

}
