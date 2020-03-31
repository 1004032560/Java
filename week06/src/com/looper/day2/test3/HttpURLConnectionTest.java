package com.looper.day2.test3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        //1.创建 URL对象
        URL url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585642249178&di=6f3bd04fd462f4f3be4ed2e031404304&imgtype=0&src=http%3A%2F%2Fwww.qz123.com%2FUploads%2FImages%2F20180306%2F6365591649582743301517573.jpg");
        //2.url.openConnection()打开连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //3.设置请求方式:GET POST
        connection.setRequestMethod("GET");
        if (connection.getResponseCode()==200) {//4：判断连接正常
            //5.接收 服务端返回的内容
            InputStream in = connection.getInputStream();
            FileOutputStream out = new FileOutputStream("E:/xx.jpg");
            byte[] b=new byte[1024];
            int len;
            while((len=in.read(b))!=-1){
                out.write(b,0,len);
            }
            in.close();
            System.out.println("下载成功！");
        }
    }


}
