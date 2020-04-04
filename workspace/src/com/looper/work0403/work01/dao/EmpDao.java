package com.looper.work0403.work01.dao;

import com.looper.work0403.work01.domain.Emp;

import java.util.List;

public interface EmpDao {

    List<Emp> allEmp();

    void modifyRoleByEmpno(int empno);

    void modifySalaryByEmpno(int empno);

    Emp showEmp();

    boolean modifyPassword(String ename,String password,String newPassword);


}
