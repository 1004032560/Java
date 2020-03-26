package com.looper.work0326.work02;

import com.looper.work0326.work02.dao.impl.EmpDaoImpl;
import com.looper.work0326.work02.domain.Emp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        EmpDaoImpl empDao = new EmpDaoImpl();

        List<Emp> list = new ArrayList<>();

        list = empDao.findAllEmps();

        Iterator<Emp> iterator = list.iterator();

        while(iterator.hasNext()){

            if (iterator.next().getEname()=="张三"){
                iterator.next().setEname("2233");
            }
        }

        Iterator<Emp> iterator1 = list.iterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next().toString());
        }


    }

}
