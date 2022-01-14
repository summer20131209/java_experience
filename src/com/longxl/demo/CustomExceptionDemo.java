package com.longxl.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException ex) {
            System.out.println("错误码：" + ex.getErrorCode() + ",error msg:" + ex.getMessage());
        } catch (IntegerRangeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void test() throws MyException, IntegerRangeException {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        try {
            age = input.nextInt();    // 获取年龄
            if (age < 0) {
                throw new MyException(100, "您输入的年龄为负数！输入有误！");
            } else if (age > 100) {
                throw new IntegerRangeException("您输入的年龄大于100！输入有误！");
            } else {
                System.out.println("您的年龄为：" + age);
            }
        } catch (InputMismatchException e1) {
            System.out.println("输入的年龄不是数字！" + e1.getMessage());
        }

// 如果不在方法名后面throws 异常，则该方法得try catch       catch(com.longxl.demo.com.longxl.demo.MyException e2) {
//            System.out.println(e2.getMessage());
//        }
    }
}
