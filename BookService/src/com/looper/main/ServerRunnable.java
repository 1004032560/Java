package com.looper.main;

import com.looper.Service.StudentService;
import com.looper.Service.impl.StudentServiceImpl;
import com.looper.domain.Data;
import com.looper.domain.Student;

import java.io.*;
import java.net.Socket;

public class ServerRunnable implements Runnable {

    private Socket socket;

    public ServerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        System.out.println();
        System.out.println("与"+Thread.currentThread().getName()+"开始通讯");

        while (true){

            try {

                InputStream is = socket.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                Object object = ois.readObject();

                Data dataRecv = (Data) object;

                System.out.println(dataRecv.getMsg());

                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);

                if ("查找所有学生信息".equals(dataRecv.getMsg())){

                    System.out.println("ok");
                    StudentService studentService = new StudentServiceImpl();
                    int num = studentService.allStudent().size();

                    Data dataSend = new Data(num,studentService.allStudent(),"查找成功");

                    oos.writeObject(dataSend);
                    for (Student student : dataSend.getStudents()) {
                        System.out.println(student);
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

    }
}
