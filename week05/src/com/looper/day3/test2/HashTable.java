package com.looper.day3.test2;

public class HashTable {
    //散列表存储的数据类型  单链表
    EmpLinkedList[] array;
    int size;//总共有几个链表

    public HashTable(int size) {//初始化数组的大小
        this.size = size;
        array=new EmpLinkedList[size];
        //注意：此处有坑，必须初始化,否则会空指针异常
        for (int i=0;i<size;i++){
            array[i]=new EmpLinkedList();
        }
    }

    //创建哈希表的散列函数  假设有5个链表
    public int hashFunc(int id){
        return id%5;
    }

    //添加用户
    public void  add(Emp emp){
        //使用散列表表确定去哪加入
        int arrayNo = hashFunc(emp.id);
        //将数据加入到相应的列表中
        array[arrayNo].add(emp);
    }

    //遍历所有的链表
    public void list(){
        for (int i = 0; i < array.length; i++) {
            array[i].list();
        }
    }

    //根据id查找用户
    public Emp findEmpById(int id){
        //使用散列表表确定去哪寻找
        int arrayNo = hashFunc(id);
        Emp emp = array[arrayNo].findEmpById(id);
        return emp;
    }

}
