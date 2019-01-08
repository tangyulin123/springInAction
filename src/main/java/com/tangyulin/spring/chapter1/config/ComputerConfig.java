package com.tangyulin.spring.chapter1.config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.tangyulin.spring.chapter1.Computer;
import com.tangyulin.spring.chapter1.MacBookComputer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author tangyulin
 * @description
 * @createdate 12/28/2018
 */
@Configuration
@ComponentScan(basePackages = "com.tangyulin.spring.chapter1")
@EnableAspectJAutoProxy
public class ComputerConfig {

    /*@Bean
    public Disk disk() {
        return new SSDDisk();
    }*/

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Computer macBookComputer(){
        return new MacBookComputer();
    }

    @Bean
    @Profile("dev")
    public DataSource mysqlDataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("com.musql.jdbc.Driver");
        dataSource.setURL("jdbc:mysql://localhost:3306/testDB");
        dataSource.setUser("tangyulin");
        dataSource.setPassword("123456");
        return dataSource;
    }
}
