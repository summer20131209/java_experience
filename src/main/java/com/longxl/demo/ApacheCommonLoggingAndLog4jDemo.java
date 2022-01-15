package com.longxl.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 参考：https://blog.csdn.net/geekun/article/details/51398621
 * log4j.rootLogger配置参考：https://www.cnblogs.com/renjiaqi/p/12192921.html
 */
public class ApacheCommonLoggingAndLog4jDemo {
    private static Log logger = LogFactory.getLog(ApacheCommonLoggingAndLog4jDemo.class);

    public static void main(String[] args) {
        logger.trace("我是trace信息");
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
        logger.error("我是error信息");
        logger.fatal("我是fatal信息");
    }
}
