package com.looper.work0403.work01.test;

import com.looper.work0403.work01.dao.impl.EmpDaoImpl;
import com.looper.work0403.work01.domain.Emp;

import java.util.Date;

public class EmpDaoImplTest {

    public static void main(String[] args) {

        EmpDaoImpl empDao = new EmpDaoImpl();

        //boolean isFlag = empDao.modifyPassword("张三","123456","123");

        //boolean isFlag = empDao.findEmpByEname("张三");

        //boolean isFlag = empDao.findEmpByEnameAndPassword("looper","123456789");
        //System.out.println(isFlag);

        /*boolean isFlag = empDao.modifyRoleByEmpno(1001,"common");
        System.out.println(isFlag);*/

        //empDao.showEmp("looper");

        //System.out.println(empDao.showEmp("looper"));

        //empDao.addEmp(1002,"looper","1234560",50000.00,"admin");

        for (Emp emp : empDao.allEmp()) {
            System.out.println(emp);
        }

    }

}
