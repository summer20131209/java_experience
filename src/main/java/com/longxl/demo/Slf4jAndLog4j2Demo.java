package com.longxl.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Log4j2例子
 * log4j1和log4j2的对比：https://www.icode9.com/content-4-904577.html
 * 
 * @author longxl2020@163.com
 * @version 1.0
 * @date 2022/1/15 23:29 
 * @className Log4j2SimpleDemo
 */
public class Slf4jAndLog4j2Demo {

    public static void main(String [] args){
        new Slf4jAndLog4j2Demo().test(35,"dsgsdg");
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
        //logger.info() 要高于log4j.properties文件的rootLogger设置日志级别才会正常显示
        Logger logger = LoggerFactory.getLogger(Slf4jAndLog4j2Demo.class);
        logger.info("slf4j+log4j2 记录info日志 ");
        logger.debug("slf4j+log4j2 记录debug日志 ");
        logger.warn("slf4j+log4j2 记录warn日志 ");
        logger.error("slf4j+log4j2 记录error日志 ");
    }
}
