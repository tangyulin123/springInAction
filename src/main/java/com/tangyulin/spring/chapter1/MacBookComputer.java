package com.tangyulin.spring.chapter1;

import com.tangyulin.spring.chapter1.aop.Performance;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author tangyulin
 * @description
 * @createdate 12/27/2018
 */
public class MacBookComputer implements Computer {


    @Autowired
    Disk disk;

    @Autowired
    Performance performance;

    @Override
    public void calculate() {
        disk.read();
    }

    @Override
    public void storage() {
        disk.write();
    }

    @Override
    public void play() {
        performance.performance();
    }
}
