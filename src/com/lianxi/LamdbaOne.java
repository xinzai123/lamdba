package com.lianxi;


public class LamdbaOne {

    public static void main(String[] args) {
        System.out.println("...................");
        System.out.println("wrtysdfg");
        System.out.println("[][][]");
        System.out.println("aaa");
    }

   /* 基础题
练习一：线程池概念
    问题：
    请描述什么是线程池。


    答：
    线程池：其实就是一个容纳多个线程的容器，其中的线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。


            练习二：线程池优点
    问题：
    请描述合理利用线程池能够带来的三个好处。


    答：
            1. 降低资源消耗。减少了创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
            2. 提高响应速度。当任务到达时，任务可以不需要的等到线程创建就能立即执行。
            3. 提高线程的可管理性。可以根据系统的承受能力，调整线程池中工作线线程的数目，防止因为消耗过多的内存，而把服务器累趴下(每个线程需要大约1MB内存，线程开的越多，消耗的内存也就越大，最后死机)。



            练习三：Lambda表达式
    问题：
    请列举Lambda语法的省略规则


    答：
    在Lambda标准格式的基础上，使用省略写法的规则为：
            1.小括号内参数的类型可以省略；
            2.如果小括号内有且仅有一个参，则小括号可以省略；
            3.如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。



            练习四：Lambda表达式
    问题：
    请列举Lambda表达式的3个组成部分，并解释说明。


    答：
    Lambda标准格式 Lambda省去面向对象的条条框框，格式由3个部分组成：一些参数，一个箭头，一段代码。
    Lambda表达式的标准格式为：格式说明：
            1.小括号内的语法与传统方法参数列表一致：无参数则留空；多个参数则用逗号分隔。
            2.->是新引入的语法格式，代表指向动作。
            3.大括号内的语法与传统方法体要求基本一致。




            练习五：Lambda表达式
    问题：
    请描述Lambda的使用前提


    答：
    Lambda的语法非常简洁，完全没有面向对象复杂的束缚。但是使用时有几个问题需要特别注意：
            1. 使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法。无论是JDK内置的 Runnable 、 Comparator 接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用Lambda。
            2. 使用Lambda必须具有上下文推断。也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
*/


/*            练习六：多线程
    问题：
    请在指定位置插入代码实现打印输出1-99。*/
/*    public class Test06 {
        public int start = 1;
        public int end = 99;
        public static void main (String[] args) {
            new Test06().method();
        }
        public void method() {
//请在此处插入代码，实现功能
            Thread t = new Thread( a );
            t.start();
        }
    }*/



  /*  答：
    public class Test06 {
        public int start = 1;
        public int end = 99;

        public static void main(String[] args) {
            new Test06().method();
        }

        public void method() {
        //插入代码处
            Runnable a = () -> {
                for (int i = start; i <end; i++) {
                    System.out.println(i);
                }
            };
            Thread t = new Thread(a);
            t.start();
        }
    }
*/






    /*
     *2.线程池测试类：
     */

/*
    public class ThreadPoolDemo {
        public static void main(String[] args) {
 创建线程池对象
            ExecutorService service = Executors.newFixedThreadPool(2);//包含2个线程对象
 创建Runnable实例对象
            MyRunnable r = new MyRunnable();
自己创建线程对象的方式
 Thread t = new Thread(r);
 t.start(); ‐‐‐>调用MyRunnable中的run()
 从线程池中获取线程对象,然后调用MyRunnable中的run()
            service.submit(r);
 再获取个线程对象，调用MyRunnable中的run()
            service.submit(r);
            service.submit(r);
 注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
 将使用完的线程又归还到了线程池中
 关闭线程池
service.shutdown();

        }
    }
*/
}