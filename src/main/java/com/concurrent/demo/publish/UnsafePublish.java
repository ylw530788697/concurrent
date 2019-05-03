package com.concurrent.demo.publish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnsafePublish {
    static Logger logger = LoggerFactory.getLogger(UnsafePublish.class);
    private String[] states={"a","b","c"};

    public String[] getStates() {
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        //logger.info("{}"+Jsob);

    }
}
