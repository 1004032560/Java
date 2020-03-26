package com.looper.work0326.work02.dao;

import com.looper.work0326.work02.domain.Emp;

import java.util.List;

public interface EmpDao {

    List< Emp> findAllEmps();
    Emp getEmpByEmpno (int empno);
    boolean modifyRoleByEmpno (int empno,String role);
    boolean modifySalaryByEmpno (int empno,String role);
    boolean modifyPasswordByEnameAndPassword (String ename,String password, String newpassword);

}
