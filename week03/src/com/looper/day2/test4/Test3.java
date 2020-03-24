package com.looper.day2.test4;

import com.looper.day2.domain.Animal;
import com.looper.day2.domain.Fish;

public class Test3 {

    public static void main(String[] args) {

        Animal fish = new Fish();  //向上造型

        Animal animal = new Animal();

        animal.eat();

        fish.eat();

        fish.run();

        //类型的转换；向下造型
        Fish fish1 = (Fish)fish;
        fish1.swim();

    }


}
