## Java学习记录

### week02：

### week03：

### week04：

### week05：

#### Ⅰ 反射

1、反射的起点：`Class`类

2、`Class`实例的三种获取方式

3、使用反射动态的创建对象的两种方式

4、`Method`类动态调用方法

#### Ⅱ 内省

1、满足类`JavaBean`类的条件

2、内省`(Inspector)`机制基于反射的基础

3、内省机制：通过`get`或者`set`判断一个属性是否属于这个类的方式

4、`API`中与内省有关的内容

* `java.beans.Introspector`类
* `Java.beans.BeanInfo`接口
* `Java.beans.PropertyDescriptor`类

5、内省机制，`PropertyDescriptor`类中用于获取或者设置属性值

* `Method getReadMethod()`
* `Method getWriteMethod()`

6、内省机制获取一个类的属性的三个步骤

#### Ⅲ 泛型

1、泛型是参数化类型

2、泛型方法、泛型类、泛型接口

3、泛型的优势：安全简单，在编译期就可以检查数据类型，提高代码的重用

4、泛型主要用于属性不确定

5、泛型的两种方式

* 传统方式采用方式`Object`
* 采用泛型的方式：*类名<泛型类名> 对象名 = new 类名<泛型类名>();*

6、编译器处理泛型有两种方式

* `Codespecialization`
* `Codesharing`：`Java`处理采用的是方式

7、**类型擦除**`(typeerasue)`：多种泛型类形实例映射到唯一的字节码表示

8、泛型类的静态变量是共享主要因为类型擦除的存在

9、`Java`中的数组是**协变**的

10、在泛型类中使用泛型的方法无需再声明泛型

11、泛型通配符：`<? extends Fruit>,<? super T>,<?>`

#### Ⅳ 枚举





#### Ⅴ 注解

1、注解的定义和作用

2、注解的形式

3、@Target

- 类或接口：`ElementType.TYPE`
- 字段：`ElementType.FIELD`
- 方法：`ElementType.METHOD`
- 构造方法：`ElementType.CONSTRUCTOR`
- 方法参数：`ElementType.PARAMETER`

4、@Retention

- 仅编译期：`RetentionPolicy.SOURCE`
- 仅`class`文件：`RetentionPolicy.CLASS`
- 运行期：`RetentionPolicy.RUNTIME`

5、@Override

6、@FunctionInterface



#### Ⅵ 数据结构

1、单链表

2、队列

3、哈希表（散列表）

4、二叉树

* 前序遍历
* 中序遍历
* 后序遍历

5、 二叉排序树（Binary Sort Tree），又称二叉查找树（Binary Search Tree） 



#### Ⅶ 集合



ArrayList和LinkedList的区别





Ⅷ