# Java学习记录

## week02：

## week03：

## week04：

* ### 多线程

1、程序，进程和线程

2、多线程的优势

3、多线程实现的两种方式

* 继承`Thread`类；缺点：只能是单一继承
* 实现`Runnable`接口；可以多实现
* 都需要重写`run()`方法

4、线程的生命周期

* 新线程（`new`新对象）
* 就绪状态
* 运行状态
* 等待/阻塞状态
* 死亡状态

5、线程使用的四个步骤

1. 定义线程
2. 创建线程对象
3. 启动线程
4. 终止线程

6、启动时调用`start()`方法

7、`sleep()`与`yield()`的区别

|                        sleep()                         |                      yield()                       |
| :----------------------------------------------------: | :------------------------------------------------: |
|               使当前线程进入被阻塞的状态               |            将当前线程转入暂停执行的状态            |
| 即使没有其他等待运行的线程，当前线程也会等待指定的时间 | 如果没有其他等待执行的线程，当前线程会马上恢复执行 |
|            其他等待执行的线程的机会是均等的            |           会将优先级相同或更高的线程运行           |

 8、内部类实现`Runnable`接口的方法

9、匿名内部类的方式转换为`Lambda`表达式方式

10、线程的停止

* 正常执行结束；
* 标志位，如果有休眠状态，无法立刻满足；
* `interrupt()`可以立刻停止，但是无法让IO等待立刻停止；
* `IO`底层对象的关闭，`close()`。

11、线程不同状态之间的转换

12、线程的分类：用户线程和后台线程

13、设置后台线程的方法：`Thread`类的`steDaemon(boolean on)`

14、获取和设置线程名：`Thread.currentThread().getName()`和`setName()`

15、线程优先级获取和设置：`getPriority()`和`setPriority()`

16、默认初始化的线程优先级为：5；取值范围为：1-10；

16、线程组

17、`join()`方法：阻塞调用此方法的线程

18、线程同步的两种方式：同步块和同步方法；都使用`Synchronized`

19、线程通讯：`wait()`、`notify()`和`notifyAll()`

20、线程池：主要解决线程生命周期开销问题和资源不足问题

21、信号量：是计数的信号量，维持一个许可集

22、生产者-消费者模式

23、Runnable与Callable两接口的区别

* `Callable`接口的`call()`方法，可以返回任务执行后的结果

* `Runnable`接口的`run()`方法，则不能返回任何结果

24、`Lock`锁：与`synchronized`用法相似；

* `lock()`：上锁
* `unlock()`：释放锁

25、线程池调度器

26、`ThreadLocal`的作用：为每个线程对象创建自己独立的的副本

27、任务分类

* 定时任务：某个时间点执行一次

* 重复任务：循环执行任务，时间间隔可以设定好的



## week05：

* ### 反射

1、反射的起点：`Class`类

2、`Class`实例的三种获取方式

3、使用反射动态的创建对象的两种方式

4、`Method`类动态调用方法

* ### 内省

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

* ### 泛型

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

* ### 枚举

Enum



* ### 注解

1、注解的定义和作用

1.1、元数据，是一种代码级别的说明

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



* ### 数据结构

1、单链表

2、队列

3、哈希表（散列表）

4、二叉树

* 前序遍历
* 中序遍历
* 后序遍历

5、 二叉排序树（Binary Sort Tree），又称二叉查找树（Binary Search Tree） 



* ### 集合

1、Collection接口

* List子接口：有顺序不可重复
  * ArrayList
  * LinkedList
  * Vector

ArrayList和LinkedList的区别

* Set子接口：无序可重复
  * HashSet
  * TreeSet
  * EnumSet

2、Map









* ### GC垃圾回收机制



## week06：

* ### `IO`流

1、`java.io.File`类的对象可以表示文件和目录

`File`类帮助访问`File`对象的属性、大小、是否存在等

2、输出流

* 字节输出流`OutputStream`（二进制文件）
* 字符输出流`Writer`（文本文件）

3、输入流

* 字节输入流`InputStream`（二进制文件）

* 字符输入流`Reader`（文本文件）

4、操作文件的三步

1. 判断文件类型

2. 读操作还是写操作

3. 是否要求高效操作

5、字节流与字符流的适配器

* `InputStreamReader`：字节流通向字符流的桥梁

* `OutputStreamWriter`：字符流通向字节流的桥梁

6、`System`三个都是被`static final`修饰的静态常量

* `System.in`：标准“输入流”，对应`InputStream`

* `System.out`：标准”输出流“，对应`PrintStream`
* `System.err`：标准”错误输出流“

7、序列化和返序列化

1. 实例对象实现`Serializable`接口

* 去除实例对象敏感信息的两种方式
  * 对敏感属性添加`transient`
  * 添加`readObject`和`writeObject`的方法

2. 实例对象实现`Externalizable`接口

* 去除实例对象敏感信息
  * 重写`writeExternal(ObjectOutput out)`和`readExternal(ObjectInput in)`

8、`IO`与`NIO`的区别

* ### 网络编程

1、`TCP/IP`协议

2、`TCP`（传输控制协议）与`UDP`（用户数据报协议）的区别

* `TCP`面向连接传输速度慢，`UDP`面向无连接传输速度快

* `TCP`是数据的可靠传输，`UDP`是数据的不可靠传输

* `TCP`使用字节流模式发送数据，`UDP`使用数据报模式发送数据

* `TCP`适用于可靠性要求高的应用环境，`UDP`适用于一次只传送**少量数据、对可靠要求不高**的应用环境

3、`IP`（网络协议）：位于网络层

4、`IP`地址：是`IP`协议提供的一种统一的地址格式，它为互联网上的每一个网络和每一台主机分配一个逻辑地址

5、端口号：是用来区分各种服务。一台计算机上有65536个端口号，已经被操作系统占用的0-1024；例如：`http:80`，使用前需要获得管理员权限，尽量不用

6、网络号的标识就是子网

7、`Java`语言对`TCP`协议网络通信使用`java.net`包中的`Socket`和`ServerSocket`进行支持；`Socket`被称为“套接字”，用来描述`IP`地址和端口

8、`TCP`通讯

* 服务器端
  1. 创建`ServerSocket`和`Socket`对象
  2. 监听客户端请求`accept`
  3. 操作
  4. 关闭资源
* 客户端
  1. 创建`Socket`对象
  2. 操作
  3. 关闭资源