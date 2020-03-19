package com.looper.work0312.dao.impl;

import com.looper.work0312.dao.ProductDao;
import com.looper.work0312.domain.Product;

public class ProductDaoImpl implements ProductDao {

    Product[] products = new Product[3];
    int num = 0;

    //添加产品
    @Override
    public boolean addProduct(Product product) {

        if (num<=2){
            products[num] = product;
            num++;
            return true;
        }else{
            System.out.println("商品目录已满！");
            return false;
        }
    }

    //显示所有的商品
    @Override
    public void showAllProducts() {
        double allPrice = 0;
        System.out.println("===================货物管理系统====================");
        System.out.println("编号   名称     价格     数量");
        for (Product product : products) {
            allPrice = allPrice + product.getPrice();
            product.show();
        }
        System.out.println("总计："+allPrice);
        System.out.println("==================================================");
    }

    //查找所有的商品
    @Override
    public void findAllProducts() {

    }

    //商品入库
    @Override
    public boolean inWarehouse(int pid, int num) {

        for (Product product : products) {
            if (product.getPid() == pid){
                product.setCount(product.getCount()+num);
                return true;
            }
        }
        System.out.println("该商品不存在！");
        return false;
    }

    //商品出库
    @Override
    public boolean outWarehouse(int pid, int num) {
        for (Product product : products) {
            if (product.getPid() == pid){
                if (product.getCount()>=num){
                    product.setCount(product.getCount()-num);
                    return true;
                }
            }
        }
        System.out.println("该商品不存在！");
        return false;
    }

    //按显示 pid 商品
    @Override
    public Product findProductByPd(int pid) {
        for (Product product : products) {
            if (product.getPid() == pid){
                return product;
            }
        }
        return null;
    }
}
