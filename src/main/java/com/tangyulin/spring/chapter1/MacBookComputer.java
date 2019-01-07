package com.tangyulin.spring.chapter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author tangyulin
 * @description
 * @createdate 12/27/2018
 */
public class MacBookComputer implements Computer {


    @Autowired
    Disk disk;

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

    }
}
