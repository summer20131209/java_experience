package com.longxl.sort;

import java.util.Arrays;

/**
 * 将数组从小到大排列
 * 见：冒泡排序执行过程.png
 * 过程：
 * 1、内循环中当前索引值与索引+1值比较，如果索引+1值大于当前索引值 ，则替换这两个值，一轮循环后会把最大值扔至最后。
 * 2、第1步将最大值扔至最后后，数组已缩小一个元素，再次执行第一步操作
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{15, 63, 97, 12, 235, 66};
        System.out.println("排序前:"+Arrays.toString(arrays));
        System.out.println("开始排序：");
        for (int i = 0; i < arrays.length - 1; i++) {
            //控制比较次数,三者交换，实现排序
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = 0;//类似空桶
                    temp = arrays[j]; //A桶中水倒入空桶C中
                    arrays[j] = arrays[j + 1];//把B桶的水倒入A桶中
                    arrays[j + 1] = temp;//把C桶的水倒入B桶中


                }

                System.out.println("外循环i:"+i+",内循环j:"+j+",内循环j的值:"+arrays[j]+",数组："+Arrays.toString(arrays));
            }
        }
        System.out.println("");
        System.out.println("完成排序后的结果:");
        System.out.println(Arrays.toString(arrays));

//        "C:\Program Files\Java\jdk-11.0.13\bin\java.exe" "-javaagent:F:\DEV\IntelliJ IDEA 2021.3.1\lib\idea_rt.jar=4768:F:\DEV\IntelliJ IDEA 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath E:\GLOBALE_WORK\java_experience\target\classes;C:\Users\21498\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\21498\.m2\repository\log4j\log4j\1.2.17\log4j-1.2.17.jar;C:\Users\21498\.m2\repository\org\apache\logging\log4j\log4j-api\2.14.1\log4j-api-2.14.1.jar;C:\Users\21498\.m2\repository\org\apache\logging\log4j\log4j-core\2.14.1\log4j-core-2.14.1.jar;C:\Users\21498\.m2\repository\ch\qos\logback\logback-classic\1.2.10\logback-classic-1.2.10.jar;C:\Users\21498\.m2\repository\ch\qos\logback\logback-core\1.2.10\logback-core-1.2.10.jar;C:\Users\21498\.m2\repository\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;C:\Users\21498\.m2\repository\org\apache\logging\log4j\log4j-slf4j-impl\2.9.1\log4j-slf4j-impl-2.9.1.jar;C:\Users\21498\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar com.longxl.sort.BubbleSort
//        外循环i:0,内循环j:0,内循环j的值:15,数组：[15, 63, 97, 12, 235, 66]
//        外循环i:0,内循环j:1,内循环j的值:63,数组：[15, 63, 97, 12, 235, 66]
//        外循环i:0,内循环j:2,内循环j的值:12,数组：[15, 63, 12, 97, 235, 66]
//        外循环i:0,内循环j:3,内循环j的值:97,数组：[15, 63, 12, 97, 235, 66]
//        外循环i:0,内循环j:4,内循环j的值:66,数组：[15, 63, 12, 97, 66, 235]
//        外循环i:1,内循环j:0,内循环j的值:15,数组：[15, 63, 12, 97, 66, 235]
//        外循环i:1,内循环j:1,内循环j的值:12,数组：[15, 12, 63, 97, 66, 235]
//        外循环i:1,内循环j:2,内循环j的值:63,数组：[15, 12, 63, 97, 66, 235]
//        外循环i:1,内循环j:3,内循环j的值:66,数组：[15, 12, 63, 66, 97, 235]
//        外循环i:2,内循环j:0,内循环j的值:12,数组：[12, 15, 63, 66, 97, 235]
//        外循环i:2,内循环j:1,内循环j的值:15,数组：[12, 15, 63, 66, 97, 235]
//        外循环i:2,内循环j:2,内循环j的值:63,数组：[12, 15, 63, 66, 97, 235]
//        外循环i:3,内循环j:0,内循环j的值:12,数组：[12, 15, 63, 66, 97, 235]
//        外循环i:3,内循环j:1,内循环j的值:15,数组：[12, 15, 63, 66, 97, 235]
//        外循环i:4,内循环j:0,内循环j的值:12,数组：[12, 15, 63, 66, 97, 235]
//
//        完成排序后的结果:
//[12, 15, 63, 66, 97, 235]
    }
}
