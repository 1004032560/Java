package com.looper.work0326.work02.service;

import com.looper.work0326.work02.domain.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> listAllEmps();
    Emp findEmpByEmpno (int empno);
    boolean modifyRoleByEmpno (int empno,String role);
    boolean modifySalaryByEmpno (int empno,String role);
    boolean modifyPasswordByEnameAndPassword (String ename,String password, String newpassword);

}
