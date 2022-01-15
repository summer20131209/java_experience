package com.longxl.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Java使用Log日志系统（common-logging和log4j）参考：https://blog.csdn.net/geekun/article/details/51398621
 * log4j.rootLogger配置参考：https://www.cnblogs.com/renjiaqi/p/12192921.html
 */
public class ApacheCommonLoggingAndLog4jDemo {
    private static Log logger = LogFactory.getLog(ApacheCommonLoggingAndLog4jDemo.class);

    public static void main(String[] args) {
        logger.trace("我是trace信息,我是trace信息,我是trace信息,我是trace信息,我是trace信息,我是trace信息,,我是trace信息,我是trace信息,我是trace信息,我是t");
        logger.debug("我是debug信息,我是debug信息,我是debug信息,我是debug信息,我是debug信息,我是debug信息,我是debug信息,我是debug信息,我是debug信");
        logger.info("我是info信息,我是info信息,我是info信息,我是info信息,我是info信息,我是info信息,我是info信息info信息,我是info信息,我是info信息,我是info信息,我是info信息,我是info");
        logger.warn("我是warn信息,我是warn信息,我是warn信息,我是warn信息,我是warn信息,我是warn信息,我是warn信息,我是warn信息,我是warn信息");
        logger.error("我是error信息,我是error信息,我是error信息,我是error信息,我是error信息,我是error信息,我是error信息,我是error信息,我是erro");
        logger.fatal("我是fatal信息，我是fatal信息，我是fatal信息，我是fatal信息，我是fatal信息，我是fatal信息，我是fatal信息，我是fatal信息，我");
    }
}
