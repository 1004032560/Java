## Java学习记录

### week02：

### week03：

### week04：

### week05：

1、反射的起点：`Class`类

2、`Class`实例的三种获取方式：

* **类名.`Class`**：适用于知道类名的情况

  `JVM`会在加载任何一个类的时候，都为这个类创建一个`Class`对象，所以用**类名.`class`**的方式就可以得到该类的`Class`对象；

* 使用`Object`类中的`getClass`：适用于已知一个类的对象，通过这个对象获得其`Class`对象的情况

  每个类都继承了`Object`类，所以都拥有`getClass`方法；

* `Class`类中的`forName(String className)`：适用于知道一个类的全名

  `Class`类中定义了静态方法`forName`，可以通过名字获得该类的`Class`对象；，尤其这个名字是一个变量的时候使用；