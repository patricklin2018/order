package com.imooc.order;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
public class LoggerTest {
     private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name = "imooc";
        String password = "123456";

        logger.debug("debug...");
        logger.info("name = " + name + ", password = " + password);
        logger.info("name : {}, password : {}", name, password);
        logger.error("error...");

        // 使用 Slf4j 注释后，可简便写成
//        log.debug("debug...");
//        log.info("info...");
//        log.error("error...");
    }

}
