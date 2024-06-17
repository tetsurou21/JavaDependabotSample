package org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.error("Hello, Log4j2");
        System.out.println("Hello world!");
    }
}