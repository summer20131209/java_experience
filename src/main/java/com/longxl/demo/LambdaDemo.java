package com.longxl.demo;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * lambda使用例子
 *
 * 具体参考1：https://www.zhihu.com/question/37872003/answer/1009015660
 * 具体参考2：https://www.runoob.com/java/java8-lambda-expressions.html
 */
public class LambdaDemo {
    public static void main(String[] args) {
        // 用匿名内部类的方式来创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("公众号：Java3y---关注我！");
            }
        }).start();

        // 使用Lambda来创建线程
        new Thread(() -> System.out.println("使用Lambda来创建线程 公众号：Java3y---关注我！")).start();

        // Consumer 一个入参，无返回值
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Java3yabc");

        // Supplier 无入参，有返回值
        Supplier<String> supplier = () -> "Java4y";
        String s = supplier.get();
        System.out.println(s);

        Test test = content ->
        {
            return "llksdglk:" + content;
        };

        LambdaDemo tester = new LambdaDemo();
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    interface Test {
        String getMessage(String content);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
