package com.looper.work0326.work02.dao.impl;

import com.looper.work0326.work02.dao.EmpDao;
import com.looper.work0326.work02.domain.Emp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

    List<Emp> al = new ArrayList<>();

    public EmpDaoImpl() {

        al.add(new Emp(100,"张三","123", LocalDateTime.now(),20000,"admin"));
        al.add(new Emp(101,"李四","123", LocalDateTime.now(),10000,"common"));
        al.add(new Emp(102,"王五","123", LocalDateTime.now(),10000,"common"));
        al.add(new Emp(103,"赵六","123", LocalDateTime.now(),10000,"common"));
        al.add(new Emp(104,"田七","123", LocalDateTime.now(),10000,"common"));

    }

    @Override
    public List<Emp> findAllEmps() {
        return al;
    }

    @Override
    public Emp getEmpByEmpno(int empno) {
        Iterator<Emp> iterator = al.iterator();
        while(iterator.hasNext()){

            if (iterator.next().getEmpno()==empno){
                return iterator.next();
            }
        }
        return null;
    }

    @Override
    public boolean modifyRoleByEmpno(int empno, String role) {
        /*Iterator<Emp> iterator = al.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getEmpno()==empno){
                iterator.next().setRole(role);
                return true;
            }
        }*/
        for (Emp emp : al) {
            if (emp.getEmpno()==empno){
                emp.setRole(role);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean modifySalaryByEmpno(int empno, String role) {
        /*Iterator<Emp> iterator = al.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getEmpno()==empno){
                if ("admin".equals(role)){
                    iterator.next().setSalary(40000);
                }else{
                    iterator.next().setSalary(30000);
                }
                return true;
            }
        }*/

        for (Emp emp : al) {
            if (emp.getEmpno()==empno){
                if ("admin".equals(role)){
                    emp.setSalary(40000);
                }else{
                    emp.setSalary(30000);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean modifyPasswordByEnameAndPassword(String ename, String password, String newpassword) {
        /*Iterator<Emp> iterator = al.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getEname()==ename&&iterator.next().getPassword()==password){
                iterator.next().setPassword(newpassword);
                return true;
            }
        }*/
        for (Emp emp : al) {
            if (emp.getEname()==ename&&emp.getPassword()==password){
                emp.setPassword(newpassword);
                return true;
            }
        }
        return false;
    }
}
