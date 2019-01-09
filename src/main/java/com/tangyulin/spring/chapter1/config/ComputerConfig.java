package com.tangyulin.spring.chapter1.config;

import com.tangyulin.spring.chapter1.Computer;
import com.tangyulin.spring.chapter1.MacBookComputer;
import org.apache.commons.dbcp.BasicDataSource;
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
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3309/sampledb");
        return dataSource;
    }

}
