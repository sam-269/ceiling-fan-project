package com.projects.ceilingfan.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Fan {

    private int speed;
    private final int maxSpeed;
    private String speedChangeDirection;

    public Fan() {
        this.maxSpeed = 3;
        this.speed = 0;
        this.speedChangeDirection = "forward";
    }
}
