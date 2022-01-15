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
// 举例，如使用info,则只有info及以上级别的日志打印
// 详细使用参考：https://www.jianshu.com/p/258d3bd72005
//            https://www.liaoxuefeng.com/wiki/1252599548343744/1264738932870688
public class ApacheCommonLogDemo {

    private static Log logger = LogFactory.getLog(ApacheCommonLogDemo.class);

    public static void main(String[] args) {
        //使用logger输出日志
        logger.trace("TRACE...");
        logger.debug("DEBUG ...");
        logger.info("INFO ...");
        logger.error("ERROR ...");
        logger.warn("WARN...");
        try{
            int ab = 7/0;
            logger.info("INFO ...");
        }catch (Exception e){
            logger.error("除数不能为0",e);
        }
    }
}
