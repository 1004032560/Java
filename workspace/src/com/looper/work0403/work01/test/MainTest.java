package com.looper.work0403.work01.test;

import com.looper.work0403.work01.domain.Emp;
import com.looper.work0403.work01.service.impl.ServiceEmpImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Emp> emps = new ArrayList<>();
        ServiceEmpImpl serviceEmp = new ServiceEmpImpl();

        loop:while(true){

            System.out.println("==================员工管理系统==================");
            System.out.println("                    1.登录");
            System.out.println("                    2.注册");
            System.out.println("                    0.退出");
            System.out.print("                    请输入选择：");
            String sel = scanner.next();
            if ("1".equals(sel)){
                System.out.println("==================员工管理系统==================");
                System.out.print("                    请输入用户名：");
                String loginEname = scanner.next();
                System.out.print("                    请输入密码：");
                String loginPassword = scanner.next();
                if (serviceEmp.login(loginEname,loginPassword)){
                    Emp emp = serviceEmp.showEmp(loginEname);
                    if ("admin".equals(emp.getRole())){
                        while(true){
                            System.out.println("==============================================");
                            System.out.println("             欢迎管理员:"+emp.getEname()+"登录");
                            System.out.println("==============================================");
                            System.out.println("                    1.查询全部员工");
                            System.out.println("                    2.添加新员工");
                            System.out.println("                    3.根据员工编号修改员工的角色");
                            System.out.println("                    4.根据员工编号修改员工的薪资");
                            System.out.println("                    0.退出");
                            System.out.print("                    请输入选择：");
                            String sel1 = scanner.next();
                            switch(sel1){
                                case "1":{
                                    System.out.println("==============================================");
                                    for (Emp emp1 : serviceEmp.allEmp()) {
                                        System.out.println(emp1);
                                    }
                                    break;
                                }
                                case "2":{
                                    System.out.println("==============================================");
                                    System.out.print("                    请输入员工ID：");
                                    int id = scanner.nextInt();
                                    System.out.print("                    请输入员工姓名：");
                                    String name = scanner.next();
                                    System.out.print("                    请输入员工密码：");
                                    String password = scanner.next();
                                    System.out.print("                    请输入员工工资：");
                                    double salary = scanner.nextDouble();
                                    System.out.print("                    请输入员工角色：");
                                    String role = scanner.next();
                                    if (serviceEmp.isExists(name)){
                                        if (serviceEmp.register(id,name,password,salary,role)){
                                            System.out.println("添加成功！");
                                        }else {
                                            System.out.println("添加失败！");
                                        }
                                    }else{
                                        System.out.println("该用户已存在！");
                                    }
                                    break;
                                }
                                case "3":{
                                    System.out.println("==============================================");
                                    System.out.print("                    请输入员工ID：");
                                    int empno = scanner.nextInt();
                                    System.out.print("                    请输入员工新角色：");
                                    String newRole = scanner.next();
                                    if (serviceEmp.modifyRole(empno,newRole)){
                                        System.out.println("修改成功！");
                                    }else{
                                        System.out.println("修改失败！");
                                    }
                                    break;
                                }
                                case "4":{
                                    System.out.println("==============================================");
                                    System.out.print("                    请输入员工ID：");
                                    int empno = scanner.nextInt();
                                    System.out.print("                    请输入员工新工资：");
                                    double newSalary = scanner.nextDouble();
                                    if (serviceEmp.modifySalary(empno,newSalary)){
                                        System.out.println("修改成功！");
                                    }else{
                                        System.out.println("修改失败！");
                                    }
                                    break;
                                }
                                case "0":{
                                    break loop;
                                }
                            }
                        }
                    }else{
                        while(true) {
                            System.out.println("==============================================");
                            System.out.println("                欢迎:"+emp.getEname()+"登录");
                            System.out.println("==============================================");
                            System.out.println("                    1.查看自己的信息");
                            System.out.println("                    2.修改自己的密码");
                            System.out.println("                    0.退出");
                            System.out.print("                    请输入选择：");
                            String sel1 = scanner.next();
                            loop1:switch(sel1){
                                case "1":{
                                    System.out.println("==============================================");
                                    System.out.println(serviceEmp.showEmp(emp.getEname()));
                                    break;
                                }
                                case "2":{
                                    System.out.println("==============================================");
                                    System.out.print("                    请输入用户名：");
                                    String name = scanner.next();
                                    System.out.print("                    请输入密码：");
                                    String password = scanner.next();
                                    System.out.print("                    请输入新密码：");
                                    String newPassword = scanner.next();
                                    if (serviceEmp.modifyPassword(name,password,newPassword)){
                                        System.out.println("修改成功！");
                                    }else{
                                        System.out.println("修改失败！用户名或密码错误");
                                    }
                                    break;
                                }
                                case "0":{
                                    break loop;
                                }
                            }
                        }
                    }
                }else{
                    System.out.println("用户名密码不正确！");
                    System.out.println("请重新登录或注册：");
                }
            }else if ("1".equals(sel)){

            }else if (serviceEmp.logout(sel)){
                break;
            }

        }

    }

}
