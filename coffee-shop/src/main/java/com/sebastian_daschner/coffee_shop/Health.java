package com.sebastian_daschner.coffee_shop;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

import java.util.logging.Level;

@Readiness
@ApplicationScoped
public class Health implements HealthCheck {

    java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

    @Override
    public HealthCheckResponse call() {
        logger.info("Calling HealthCheckResponse");
        return HealthCheckResponse.up("coffee-shop");
    }

}
