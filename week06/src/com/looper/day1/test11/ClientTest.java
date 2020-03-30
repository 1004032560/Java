package com.looper.day1.test11;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1",5900);

        OutputStream os = s.getOutputStream();


        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(os);

        User user= new User("looper","123456");
        System.out.println("准备发送的对象"+user);
        oos.writeObject(user);

        oos.close();
        os.close();
        s.close();

    }

}
