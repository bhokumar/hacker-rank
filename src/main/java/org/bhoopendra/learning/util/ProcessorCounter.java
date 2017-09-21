package org.bhoopendra.learning.util;

import java.util.logging.Logger;

public class ProcessorCounter {
    private static Logger logger = Logger.getLogger(ProcessorCounter.class.getName());
    private ProcessorCounter(){

    }

    public static void main(String[] args) {
        logger.info(()->Integer.toString(Runtime.getRuntime().availableProcessors()));
    }
}
