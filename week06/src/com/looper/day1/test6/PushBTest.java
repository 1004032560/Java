package com.looper.day1.test6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 *
 */

public class PushBTest {

    public static void main(String[] args) {

        String str = "abc";

        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());

        PushbackInputStream pis = new PushbackInputStream(bis);

        try {
            int num = pis.read();
            while (true){
                if (num==-1){
                    break;
                }
                if (num=='b'){
                    pis.unread('N');
                }
                System.out.println((char)num);
                num = pis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
