package com.looper.work0324.work02;

public class SingleLinkList {

    Student head = new Student(0,"");

    //添加学生数据
    public void add(Student student){
        if (head.getNext()==null){
            head.setNext(student);
        }else{
            Student temp = head.getNext();
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(student);
        }
    }

    //遍历学生数据
    public void list(){
        if (head.getNext()==null){
            System.out.println("学生排行榜为空");
        }else{
            Student temp = head.getNext();
            while(temp!=null){
                System.out.println(temp.toString());
                temp = temp.getNext();
            }
        }
    }

    //根据id查询数据
    public void findById(int id){
        if (head.getNext()==null){
            System.out.println("学生排行榜为空,该学生不存在");
        }else{
            Student temp = head.getNext();
            boolean flag = true;
            while (temp!=null){
                if(temp.getId()==id){
                    System.out.println("该学生为"+temp.toString());
                    flag = false;
                }
                temp = temp.getNext();
            }
            if (flag){
                System.out.println("ID错误,该学生未找到");
            }
        }
    }

    //根据id删除数据
    public void deleteById(int id){
        if (head.getNext()==null){
            System.out.println("学生排行榜为空,该学生不存在");
        }else{
            Student temp = head.getNext();
            Student up = head;
            boolean flag = false;
            if (temp.getId()==id){
                up.setNext(temp.getNext());
                flag = true;
            }else{
                while (temp.getNext()!=null){
                    if(temp.getNext().getId()==id){
                        up = temp.getNext().getNext();
                        System.out.println("删除成功");
                        flag = true;
                    }
                    up = temp.getNext();
                }
            }

            if (flag){
                System.out.println("ID错误,该学生未找到");
            }
        }
    }

}
