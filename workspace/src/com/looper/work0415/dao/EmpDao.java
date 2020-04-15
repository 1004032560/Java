package com.looper.work0415.dao;

import com.looper.work0415.domain.Emp;

import java.util.List;

public interface EmpDao {

    List<Emp> findAllEmp();
    Emp findEmpByEmpNo(int empNo);
    boolean modifyRoleByEmpNo(int empNo,String role);
    boolean modifySalaryByEmpNo(int empNo,double salary);
    boolean modifyPasswordByNameAndPassword(String ename,String password, String newPassword);

}
