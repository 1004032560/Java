package com.looper.day3.test2;

public class EmpLinkedList {

    Emp head = null;//链表头，默认为null

    //添加员工
    public void add(Emp emp){
        if (head==null){//链表头为空，则将数据存储
            head = emp;
            return;
        }else{
            Emp temp = head;//定义临时变量
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = emp;
        }
    }

    //遍历列表
    public void list(){
        if(head==null){
            System.out.println("当前索引位置链表为空！");
        }else{
            System.out.print("当前链表数据如下：");
            Emp currentEmp = head;//定义临时变量
            while(true){
                System.out.print(currentEmp);
                if(currentEmp.next==null){
                    break;
                }else{
                    currentEmp = currentEmp.next;
                }
            }
            System.out.println("");
        }
    }

    //根据id查找链表中的emp
    public Emp findEmpById(int id){
        Emp currentEmp = head;//定义临时变量
        if(head==null){
            System.out.println("当前链表为空！");
            return null;
        }else {
            while (true) {
                if (currentEmp.id == id) {//找到了
                    System.out.println("找到了员工信息：" + currentEmp);
                }
                if (currentEmp.next == null) {//找到最后了
                    break;
                } else {
                    currentEmp = currentEmp.next;
                }
            }
        }
        return currentEmp;
    }

}
