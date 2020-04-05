package com.looper.work0403.work01.service.impl;

import com.looper.work0403.work01.dao.EmpDao;
import com.looper.work0403.work01.dao.impl.EmpDaoImpl;
import com.looper.work0403.work01.domain.Emp;
import com.looper.work0403.work01.service.ServiceEmp;

import java.util.List;

public class ServiceEmpImpl implements ServiceEmp {

    EmpDao empDao = new EmpDaoImpl();

    @Override
    public List<Emp> allEmp() {
        return empDao.allEmp();
    }

    @Override
    public boolean isExists(String ename) {
        return empDao.findEmpByEname(ename);
    }

    @Override
    public boolean register(int empno, String ename, String password, Double salary, String role) {
        return empDao.addEmp(empno, ename, password, salary, role);
    }

    @Override
    public boolean register(int empno, String ename, String password, Double salary) {
        return empDao.addEmp(empno, ename, password, salary);
    }

    @Override
    public boolean login(String ename,String password) {
        return empDao.findEmpByEnameAndPassword(ename,password);
    }

    @Override
    public boolean modifyRole(int empno, String newRole) {
        return empDao.modifyRoleByEmpno(empno,newRole);
    }

    @Override
    public boolean modifySalary(int empno, Double newSalary) {
        return empDao.modifySalaryByEmpno(empno,newSalary);
    }

    @Override
    public boolean modifyPassword(String ename, String password, String newPassword) {
        return empDao.modifyPassword(ename,password,newPassword);
    }

    @Override
    public Emp showEmp(String ename) {
        return empDao.showEmp(ename);
    }

    @Override
    public boolean logout(String str) {
        return "0".equals(str);
    }
}
