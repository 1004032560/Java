package com.looper.day3;
public class Test10 {
    public static void main(String[] args) {

        loop1:for (int i=0;i<5;i++){
            loop2:for(int j=0;j<5;j++){
                if (i==1){
                    //break默认跳出本层循环。当前里层循环
                    break loop1;
                }
            }
        }

    }
}
