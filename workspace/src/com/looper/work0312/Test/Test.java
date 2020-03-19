package com.looper.work0312.Test;

import com.looper.work0312.dao.impl.ProductDaoImpl;
import com.looper.work0312.domain.Product;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductDaoImpl productDao = new ProductDaoImpl();

        Product product1 = new Product(1,"电视",800,10);
        Product product2 = new Product(2,"杯子",100,20);
        Product product3 = new Product(3,"桌子",400,50);

        if (productDao.addProduct(product1)){
            System.out.println("第1次添加成功");
        }
        if (productDao.addProduct(product2)){
            System.out.println("第2次添加成功");
        }
        if (productDao.addProduct(product3)){
            System.out.println("第3次添加成功");
        }

        productDao.showAllProducts();

        //进库出库
        productDao.inWarehouse(2,50);
        productDao.outWarehouse(3,50);

        productDao.showAllProducts();

        //按 pid 查找

        System.out.println("请输入要查找的商品编号");

        Product product=productDao.findProductByPd(5);
        if ((product instanceof Product)){
            System.out.print("PID为"+product.getPid()+"的商品信息是：");
            product.show();
        }else{
            System.out.println("PID为5的商品信息未找到");
        }


    }

}
