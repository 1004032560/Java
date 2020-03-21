package com.looper.work0320.work07.dao;

import com.looper.work0320.work07.domain.Emp;

public interface EmpDao {

    Emp[] findAllEmps();

    Emp findEmpByEmpno (int empno);

    boolean modifyRoleByEmpno (int empno,String role);

    boolean modifySalaryByEmpno (int empno,String role);

    boolean modifyPasswordByEnameAndPassword (String ename,String password, String newpassword);

}
