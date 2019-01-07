package com.tangyulin.spring.chapter1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author tangyulin
 * @description
 * @createdate 12/27/2018
 */
@Component
@Primary
public class SSDDisk implements Disk {

    @Override
    public void read() {
        System.out.println("ssd fast reading data-----------");
    }

    @Override
    public void write() {
        System.out.println("ssd fast writting data-----------");
    }
}
