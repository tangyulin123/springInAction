package com.tangyulin.spring.chapter1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author tangyulin
 * @description
 * @createdate 12/27/2018
 */
@Component
public class HDDDisk implements Disk {

    @Override
    public void read() {
        System.out.println("hdd reading data-----------");
    }

    @Override
    public void write() {
        System.out.println("hdd reading data-----------");
    }
}
