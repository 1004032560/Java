package com.looper.work0326.work02.service.impl;

import com.looper.work0326.work02.dao.impl.EmpDaoImpl;
import com.looper.work0326.work02.domain.Emp;
import com.looper.work0326.work02.service.EmpService;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    EmpDaoImpl empDao = new EmpDaoImpl();

    @Override
    public List<Emp> listAllEmps() {
        return empDao.findAllEmps();
    }

    @Override
    public Emp findEmpByEmpno(int empno) {
        return empDao.getEmpByEmpno(empno);
    }

    @Override
    public boolean modifyRoleByEmpno(int empno, String role) {
        return empDao.modifyRoleByEmpno(empno,role);
    }

    @Override
    public boolean modifySalaryByEmpno(int empno, String role) {
        return empDao.modifySalaryByEmpno(empno,role);
    }

    @Override
    public boolean modifyPasswordByEnameAndPassword(String ename, String password, String newpassword) {
        return empDao.modifyPasswordByEnameAndPassword(ename,password,newpassword);
    }
}
