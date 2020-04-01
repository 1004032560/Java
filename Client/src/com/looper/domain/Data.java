package com.looper.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 专门用于在网络中传输的对象类型
 */
public class Data implements Serializable {
    private String msg;//判断想做什么业务
    private User user;
    private boolean flag;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Data(String msg, User user) {
        this.msg = msg;
        this.user = user;
    }

    public Data(User user, List<User> users) {
        this.user = user;
        this.users = users;
    }

    public Data(User user) {
        this.user = user;
    }

    public Data(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Data{" +
                "msg='" + msg + '\'' +
                ", user=" + user +
                ", flag=" + flag +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
