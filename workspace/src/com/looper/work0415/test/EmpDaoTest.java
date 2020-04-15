package com.looper.work0415.test;

import com.looper.work0415.dao.EmpDao;
import com.looper.work0415.dao.impl.EmpDaoImpl;
import com.looper.work0415.domain.Emp;

public class EmpDaoTest {

    public static void main(String[] args) {

        EmpDao empDao = new EmpDaoImpl();

        for (Emp emp : empDao.findAllEmp()) {
            System.out.println(emp);
        }

    }

}
