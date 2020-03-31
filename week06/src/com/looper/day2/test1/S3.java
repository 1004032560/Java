package com.looper.day2.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class S3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(10086);
		
		System.out.println("服务器启动。。。。。。。。");
		while(true){
			//监听客户端请求监听
			Socket s = ss.accept();
			
			 Runnable r1 = new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
				//	while(true){//不再加一层循环
						try {
							//读
							InputStream is = s.getInputStream();
							byte[] buf = new byte[1024];
							int len = is.read(buf);
							String str = new String(buf, 0, len);
							System.out.println("客户端"+s.getRemoteSocketAddress().toString()+"发来消息："+str);
							if(str.equals("exit")){
								s.close();
								//break;//???不让使用break
							}
							//写
							OutputStream os = s.getOutputStream();
							System.out.print("服务器说：");
							String str2 = input.nextLine();
							os.write(str2.getBytes());
							
							is.close();
							os.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				//s}
			};
			Thread th1 = new Thread(r1);
			//启动线程
			th1.start();
			
		}
		
		
		
		
	}

}
