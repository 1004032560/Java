package com.looper.work0320.work07.test;

import com.looper.work0320.work07.dao.impl.EmpDaoImpl;
import com.looper.work0320.work07.domain.Emp;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Emp[] emps;

        EmpDaoImpl empDaoImpl = new EmpDaoImpl();

        emps = empDaoImpl.findAllEmps();

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
                for (Emp allEmp : emps) {
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
                                        for (int i = 0; i < emps.length; i++) {
                                            System.out.println(emps[i].toString());
                                        }
                                        break;
                                    }
                                    case 2:{
                                        System.out.print("请输入员工编号：");
                                        Emp emp = empDaoImpl.findEmpByEmpno(scanner.nextInt());
                                        if (emp==null){
                                            System.out.println("未找到该员工！");
                                        }
                                        break;
                                    }
                                    case 3:{
                                        System.out.print("请输入员工编号：");
                                        int empId = scanner.nextInt();
                                        System.out.print("请输入员工薪资所对应的角色：");
                                        String empRole = scanner.next();
                                        boolean flag = empDaoImpl.modifySalaryByEmpno(empId,empRole);
                                        if (flag){
                                            System.out.println("修改成功！");
                                            for (Emp daoImplAllEmp : empDaoImpl.findAllEmps()) {
                                                System.out.println(daoImplAllEmp.toString());
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
                                        empDaoImpl.modifyPasswordByEnameAndPassword(allEmp.getEname(),allEmp.getPassword(),"1234567");
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
