package com.tangyulin.spring;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.tangyulin.spring.chapter1.MacBookComputer;
import com.tangyulin.spring.chapter1.config.ComputerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author tangyulin
 * @description
 * @createdate 12/28/2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComputerConfig.class)
@ActiveProfiles("dev")
public class ComputerTest {

    @Resource
    MacBookComputer macBookComputer;

    @Autowired
    DataSource dataSource;

    @Test
    public void computerTest(){
        macBookComputer.calculate();
        System.out.println(macBookComputer);
        Class<? extends DataSource> aClass = dataSource.getClass();
    }

    @Test
    public void computerTest2(){
        macBookComputer.calculate();
        System.out.println(macBookComputer);
        Class<? extends DataSource> aClass = dataSource.getClass();

    }

    /*public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComputerConfig.class);
        MysqlDataSource mysqlDataSource = (MysqlDataSource) applicationContext.getBean("mysqlDataSource");
        System.out.println(mysqlDataSource.getServerName());
    }*/
}
