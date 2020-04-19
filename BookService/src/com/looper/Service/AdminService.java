package com.looper.Service;

import com.looper.domain.Admin;

import java.util.List;

public interface AdminService {

    //查看所有管理员
    List<Admin> allAdmin();

    //通过ID查找管理员
    Admin findAdminById(Admin admin);

    //通过Name查找管理员
    Admin findAdminByName(Admin admin);

    //通过Name查找管理员
    Admin findAdminByNameAndPassword(Admin admin);

    //添加Admin
    boolean addAdmin(Admin admin);

    //删除Admin
    boolean deleteAdmin();

    //修改Admin信息
    boolean modifyAdmin(Admin admin);
    
}
