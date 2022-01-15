package com.longxl.demo;

import java.util.logging.Logger;

/**
 *JDK的Logging定义了7个日志级别，从严重到普通：
 *
 * SEVERE
 * WARNING
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST
 *
 * 举例，如使用info,则只有info及以上级别的日志打印
 */
public class JDKLoggingDemo {

    public static void main(String [] args) {
        System.out.println("使用JDK Logging例子");
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }

}
