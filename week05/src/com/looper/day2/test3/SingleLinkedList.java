package com.looper.day2.test3;

public class SingleLinkedList {

    //初始化  指定头结点  头结点不保存数据
    private StarNode head = new StarNode(0,"");

    //向链表中添加元素
    public void add(StarNode starNode){
        if (head.getNext()==null){//链表没有数据；判断链表下一个是否为null
            head.setNext(starNode);
        }else{

            /*while(true){
                //声明临时变量
                StarNode temp = head.getNext();
                if (temp.getNext()==null){
                    //保存数据
                    temp.setNext(starNode);
                    //退出循环
                    break;
                }else {
                    //寻找下一个
                    temp = temp.getNext();
                }
            }*/

            //声明临时变量
            StarNode temp = head.getNext();
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(starNode);
        }
    }

    //遍历数据
    public void list(){

        if (head.getNext()==null){
            System.out.println("数据链表是空");
        }else{
            StarNode temp = head.getNext();

            if (temp==null){
                temp.toString();
            }else{

            }

            /*while(temp!=null){
                System.out.println(temp.toString());
            }*/
            System.out.println("数据输出结束");
        }

    }


}
