package com.looper.work0403.work01.dao;

import com.looper.work0403.work01.domain.Emp;


import java.util.Date;
import java.util.List;

public interface EmpDao {

    List<Emp> allEmp();

    boolean modifyRoleByEmpno(int empno,String newRole);

    boolean modifySalaryByEmpno(int empno,Double newSalary);

    Emp showEmp(String ename);

    boolean modifyPassword(String ename,String password,String newPassword);

    boolean findEmpByEname(String ename);

    boolean addEmp(int empno, String ename, String password,Double salary, String role);

    boolean addEmp(int empno, String ename, String password,Double salary);

    boolean findEmpByEnameAndPassword(String ename,String password);

}
