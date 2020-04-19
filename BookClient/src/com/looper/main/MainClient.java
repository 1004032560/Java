package com.looper.main;

import com.looper.domain.Data;
import com.looper.domain.Student;

import java.io.*;
import java.net.Socket;

public class MainClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1",5900);


            while(true){
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);

                Data dataSend = new Data("查找所有学生信息");

                oos.writeObject(dataSend);

                System.out.println("发送成功");

                InputStream is = socket.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                Object object = ois.readObject();

                Data dataRecv = (Data) object;

                System.out.println("123ok");
                System.out.println(dataRecv.getMsg());

                for (Student student : dataRecv.getStudents()) {
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
