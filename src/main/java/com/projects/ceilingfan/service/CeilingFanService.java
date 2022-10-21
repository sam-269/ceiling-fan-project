package com.projects.ceilingfan.service;

import com.projects.ceilingfan.model.Fan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CeilingFanService {

    @Autowired
    private Fan fan;

    public int changeSpeed(){

        int speed = fan.getSpeed();

        if (fan.getSpeedChangeDirection().equals("forward")){
            speed++;
            if (speed > fan.getMaxSpeed() ){
                speed = 0;
            }
        }
        else{
            speed--;
            if (speed < 0){
                speed = fan.getMaxSpeed();
            }
        }
        fan.setSpeed(speed);
        return speed;
    }

    public String reverseSpeed(){
        if (fan.getSpeedChangeDirection().equals("forward")){
            fan.setSpeedChangeDirection("backward");
            return "Fan speed direction is now backward";
        }
        else{
            fan.setSpeedChangeDirection("forward");
            return "Fan speed direction is now forward";
        }
    }
}
