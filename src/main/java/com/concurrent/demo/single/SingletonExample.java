package com.concurrent.demo.single;

import com.concurrent.demo.annoations.NotThreadSafe;

@NotThreadSafe
public class SingletonExample {
    //私有构造函数
    private SingletonExample(){}

    private static SingletonExample instance=null;

    public static SingletonExample getInstance() {
        if(instance==null){
            instance=new SingletonExample();
        }
        return instance;
    }
}
