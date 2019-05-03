package com.concurrent.demo.single;

import com.concurrent.demo.annoations.ThreadSafe;

@ThreadSafe
public class HungrySingleExample {
    private  HungrySingleExample(){}
    private static  HungrySingleExample hungrySingleExample=new HungrySingleExample();

    public static HungrySingleExample getHungrySingleExample() {
        return hungrySingleExample;
    }
}
