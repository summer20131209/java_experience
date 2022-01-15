package com.longxl.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4j与Logback实现记录日志,参考：
 * https://juejin.cn/post/6844904184492326926
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1264739155914176
 *
 * @author longxl2020@163.com
 * @version 1.0
 * @date 2022/1/16 0:07
 * @className Slf4jAndLogbackDemo
 */
public class Slf4jAndLogbackDemo {
    private static final String TAG = "Slf4jAndLogbackDemo";

    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(TAG);

        //trace,debug不会打印，因为默认级别为info，比info级别低的不会打印出来
        logger.trace("test_trace");
        logger.debug("test_debug");

        logger.info("test_info");
        logger.warn("test_warn");
        logger.error("test_error");
    }
}
