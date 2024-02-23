package com.example.msa.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "healthy")
public class HealthyEndpoint {
    HealthEndpoint healthEndpoint;

    public HealthyEndpoint(HealthEndpoint healthEndpoint) {
        this.healthEndpoint = healthEndpoint;
    }

    @ReadOperation
    @Bean
    public Health healthy() {
        Status status = healthEndpoint.health().getStatus();
        return new Health(status.equals(Status.UP) ? "OK" : status.toString());
    }

    public record Health(String status) {
    }
}
