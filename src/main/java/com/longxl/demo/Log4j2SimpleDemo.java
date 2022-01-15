package com.longxl.demo;

/**
 * Log4j2例子
 * log4j1和log4j2的对比：https://www.icode9.com/content-4-904577.html
 * 
 * @author longxl2020@163.com
 * @version 1.0
 * @date 2022/1/15 23:29 
 * @className Log4j2SimpleDemo
 */
public class Log4j2SimpleDemo {

    public static void main(String [] args){
        new Log4j2SimpleDemo().test(35,"dsgsdg");
    }

    /**
     * 测试方法
     *
     * @param  a 1
     * @param  b 2
     * @return
     * @date 2022/1/15 23:28
     * @author longxl2020@163.com
     */
    void test(int a,String b){
        //log4j1.info() 要高于log4j.properties文件的rootLogger设置日志级别才会正常显示
        org.apache.log4j.Logger log4j1 = org.apache.log4j.LogManager.getLogger(Log4j2SimpleDemo.class);
        log4j1.info("log4j1日志" + log4j1.getClass().getName());

        org.apache.logging.log4j.Logger log4j2 = org.apache.logging.log4j.LogManager.getLogger(Log4j2SimpleDemo.class);
        log4j2.info("log4j2日志 " + log4j2.getClass().getName());
    }
}
