package com.looper.day2.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SC3 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(true){
			Socket s = new Socket("127.0.0.1",10086);
			
			//写
			OutputStream os = s.getOutputStream();
			System.out.print("客户端说：");
			String str2 = input.nextLine();
			os.write(str2.getBytes());
			if(str2.equals("exit")){
				s.close();
				break;
			}
			
			
			//读
			InputStream is = s.getInputStream();
			byte[] buf = new byte[1024];
			int len = is.read(buf);
			String str = new String(buf, 0, len);
			System.out.println("服务器"+s.getRemoteSocketAddress().toString()+"发来消息："+str);
			
			is.close();
			os.close();
			
		}
	}

}
