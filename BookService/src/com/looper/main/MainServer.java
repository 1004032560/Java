package com.looper.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {


    public static void main(String[] args) {

        ServerSocket serverSocket = null;

        try {

            serverSocket = new ServerSocket(5900);
            System.out.println("服务器启动......");
            while(true){

                Socket socket = serverSocket.accept();

                Thread thread = new Thread(new ServerRunnable(socket));

                thread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
