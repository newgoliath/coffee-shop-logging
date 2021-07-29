package com.sebastian_daschner.barista;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import java.util.logging.Level;

@Path("health")
public class HealthCheckResource {

    java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

    @GET
    public String healthCheck() {
        logger.info("HealthCheck from Barista");
        return "OK";
    }

}

