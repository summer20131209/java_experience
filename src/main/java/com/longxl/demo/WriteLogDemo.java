package com.longxl.demo;


import org.apache.log4j.Logger;

public class WriteLogDemo {
    private static Logger logger = Logger.getLogger(WriteLogDemo.class);

    public static void main(String [] args){
        new WriteLogDemo().test();

    }

    public void test(){
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }
}
