package com.longxl.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//Commons Logging定义了6个日志级别(默认级别是INFO)：
//        FATAL
//        ERROR
//        WARNING
//        INFO
//        DEBUG
//        TRACE
public class CommonLogDemo {

    private static Log logger = LogFactory.getLog(CommonLogDemo.class);

    public static void main(String[] args) {
        //使用logger输出日志
        logger.trace("TRACE...");
        logger.debug("DEBUG ...");
        logger.info("INFO ...");
        logger.error("ERROR ...");
        logger.warn("WARN...");
    }
}
