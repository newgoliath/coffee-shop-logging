package com.sebastian_daschner.barista;

import javax.enterprise.context.ApplicationScoped;

import java.util.logging.Level;

@ApplicationScoped
public class OrderStatusProcessor {

    java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

    public String process(final String status) {
        switch (status) {
            case "PREPARING":
                logger.info("FINISHED order");
                return "FINISHED";
            case "FINISHED":
                logger.info("COLLECTED order");
                return "COLLECTED";
            case "COLLECTED":
                logger.info("COLLECTED order");
                return "COLLECTED";
            default:
                logger.info("Unknown status order" + status);
                throw new IllegalArgumentException("Unknown status " + status);
        }
    }

}


