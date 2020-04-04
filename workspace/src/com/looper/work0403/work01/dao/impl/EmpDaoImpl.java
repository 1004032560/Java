package com.looper.work0403.work01.dao.impl;

import com.looper.work0403.work01.dao.EmpDao;
import com.looper.work0403.work01.domain.Emp;

import java.util.List;

public class EmpDaoImpl implements EmpDao {



    @Override
    public List<Emp> allEmp() {
        return null;
    }

    @Override
    public void modifyRoleByEmpno(int empno) {

    }

    @Override
    public void modifySalaryByEmpno(int empno) {

    }

    @Override
    public Emp showEmp() {
        return null;
    }

    @Override
    public boolean modifyPassword(String ename, String password, String newPassword) {
        return false;
    }
}
