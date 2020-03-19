package com.looper.work0312.dao;

import com.looper.work0312.domain.Product;

public interface ProductDao {

    boolean addProduct (Product product) ;
    void showAllProducts();
    void findAllProducts();
    boolean inWarehouse(int pid,int num);
    boolean outWarehouse(int pid,int num);
    Product findProductByPd(int pid);


}
