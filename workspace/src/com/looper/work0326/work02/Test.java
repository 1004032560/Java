package com.looper.work0326.work02;

import com.looper.work0326.work02.dao.impl.EmpDaoImpl;
import com.looper.work0326.work02.domain.Emp;
import com.looper.work0326.work02.service.impl.EmpServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmpServiceImpl empService = new EmpServiceImpl();
        List<Emp> alEmp = new ArrayList<>();
        alEmp = empService.listAllEmps();


        loop:while(true){
            System.out.println("------------------主菜单------------------");
            System.out.println("      ------------1.登录------------");
            System.out.println("      ------------0.退出------------");
            System.out.println("-----------------------------------------");
            System.out.print("请输入选择：");
            int loginNum = scanner.nextInt();

            //判断是否登录
            loop1:if (loginNum==1){

                System.out.print("请输入用户名：");
                String username = scanner.next();
                System.out.print("请输入密码：");
                String password = scanner.next();

                //判断密码是否正确
                for (Emp allEmp : alEmp) {
                    if (allEmp.getEname().equals(username)&&allEmp.getPassword().equals(password)){

                        //判断是用户还是管理员
                        if ("admin".equals(allEmp.getRole())){
                            while(true){
                                System.out.println("------------------经理界面------------------");
                                System.out.println("      ---------1.查询全部员工---------");
                                System.out.println("      ---2.根据员工编号修改员工的角色---");
                                System.out.println("      ---3.根据员工编号修改员工的薪资---");
                                System.out.println("      ---------0.退出------------");
                                System.out.println("-----------------------------------------");
                                System.out.print("请输入选择：");
                                int num = scanner.nextInt();
                                switch(num){
                                    case 1:{
                                        Iterator<Emp> iterator = alEmp.iterator();
                                        while(iterator.hasNext()){
                                            System.out.println(iterator.next());
                                        }
                                        break;
                                    }
                                    case 2:{
                                        System.out.print("请输入员工编号：");
                                        boolean emp = empService.modifyRoleByEmpno(scanner.nextInt(),scanner.next());
                                        if (!emp){
                                            System.out.println("未找到该员工！");
                                        }
                                        break;
                                    }
                                    case 3:{
                                        System.out.print("请输入员工编号：");
                                        int empId = scanner.nextInt();
                                        System.out.print("请输入员工薪资所对应的角色：");
                                        String empRole = scanner.next();
                                        boolean flag = empService.modifySalaryByEmpno(empId,empRole);
                                        if (flag){
                                            System.out.println("修改成功！");
                                            for (Emp emp : alEmp) {
                                                System.out.println(emp.toString());
                                            }
                                        }else{
                                            System.out.println("未找到该员工！");
                                        }
                                        break;
                                    }
                                    case 0:{
                                        System.out.print("确定要退出(y/n):");
                                        String logoutStr3 = scanner.next();
                                        if ("y".equals(logoutStr3)){
                                            break loop;
                                        }
                                    }
                                }
                            }
                        }else if ("common".equals(allEmp.getRole())){
                            while(true){
                                System.out.println("------------------员工界面------------------");
                                System.out.println("     ---------1.查看自己的信息---------");
                                System.out.println("     ---------2.修改自己的密码---------");
                                System.out.println("     -------------0.退出-------------");
                                System.out.println("-----------------------------------------");
                                System.out.print("请输入选择：");
                                int num = scanner.nextInt();
                                switch(num){
                                    case 1:{
                                        System.out.println(allEmp.toString());
                                        break;
                                    }
                                    case 2:{
                                        System.out.print("请输入新密码：");
                                        String newName = scanner.next();
                                        empService.modifyPasswordByEnameAndPassword(allEmp.getEname(),allEmp.getPassword(),newName);
                                        System.out.println("修改成功！新信息："+allEmp.toString());
                                        break;
                                    }
                                    case 0:{
                                        System.out.print("确定要退出(y/n):");
                                        String logoutStr3 = scanner.next();
                                        if ("y".equals(logoutStr3)){
                                            break loop;
                                        }
                                    }
                                }
                            }
                        }

                    }
                }

                System.out.println("用户名或密码错误！是否继续登录？");
                System.out.print("确定要退出(y/n):");
                String logoutStr2 = scanner.next();
                if ("n".equals(logoutStr2)){
                    break loop;
                }else{
                    break loop1;
                }

            }else{
                System.out.print("确定要退出(y/n):");
                String logoutStr1 = scanner.next();
                if ("y".equals(logoutStr1)){
                    break;
                }
            }

        }

    }

}
