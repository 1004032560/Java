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
            Student up = head; //保存遍历对象的前一项数据
            boolean flag = false;
            while(true){
                if (temp == null){
                    //flag = true;
                    break;
                }else{
                    if (temp.getId() == id) {
                        Student next = temp.getNext();
                        System.out.println("下" + next);
                        System.out.println("上" + up);
                        up.setNext(next);
                        System.out.println("删除成功");
                    }
                    //检查下一项
                    temp = temp.getNext();
                    up = up.getNext();
                }
            }


            if (flag){
                System.out.println("ID错误,该学生未找到");
            }
        }
    }

}
