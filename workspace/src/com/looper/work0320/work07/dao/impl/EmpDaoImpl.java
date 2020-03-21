package com.looper.work0320.work07.dao.impl;

import com.looper.work0320.work07.dao.EmpDao;
import com.looper.work0320.work07.domain.Emp;

import java.time.LocalDateTime;

public class EmpDaoImpl implements EmpDao {

    static Emp[] emps = new Emp[5];

    static{
        emps[0] = new Emp(100,"张三","123", LocalDateTime.now(),20000,"admin");
        emps[1] = new Emp(101,"李四","123", LocalDateTime.now(),10000,"common");
        emps[2] = new Emp(102,"王五","123", LocalDateTime.now(),10000,"common");
        emps[3] = new Emp(103,"赵六","123", LocalDateTime.now(),10000,"common");
        emps[4] = new Emp(104,"田七","123", LocalDateTime.now(),10000,"common");
    }

    @Override
    public Emp[] findAllEmps() {
        return emps;
    }

    @Override
    public Emp findEmpByEmpno(int empno) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getEmpno()==empno){
                System.out.println("找到了该员工！");
                System.out.println(emps[i].toString());
                return emps[i];
            }
        }
        return null;
    }

    @Override
    public boolean modifyRoleByEmpno(int empno, String role) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getEmpno()==empno){
                emps[i].setRole(role);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean modifySalaryByEmpno(int empno, String role) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getEmpno()==empno){
                if ("admin".equals(role)){
                    emps[i].setSalary(40000);
                }else{
                    emps[i].setSalary(30000);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean modifyPasswordByEnameAndPassword(String ename, String password, String newpassword) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getEname().equals(ename)&&emps[i].getPassword().equals(password)){
                emps[i].setPassword(newpassword);
                return true;
            }
        }
        return false;
    }
}
