package com.looper.work0306;

public class W6_Customer {

    private String username;
    private String password;
    private int integral;
    private String card;

    public W6_Customer(String username, String password, int integral, String card) {
        this.username = username;
        this.password = password;
        this.integral = integral;
        this.card = card;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void show(){
        System.out.println("************欢迎进入用户页面*************");
        System.out.println("   姓名；"+username);
        System.out.println("   会员卡积分："+integral);
        System.out.println("   会员卡类型："+card);
    }

}
