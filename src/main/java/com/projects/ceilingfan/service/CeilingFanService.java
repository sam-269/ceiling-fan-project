package com.projects.ceilingfan.service;

import org.springframework.stereotype.Service;

@Service
public class CeilingFanService {

    int speed = 0;
    private boolean reverse = false;

    public int changeSpeed(){

        if (reverse== false){
            speed++;
            if (speed > 3 ){
                speed = 0;
            }
        }
        else{
            speed--;
            if (speed < 0){
                speed = 3;
            }
        }
        return speed;
    }

    public String reverseSpeed(){
        if (reverse == true){
            reverse = false;
            return "Fan speed direction is forward";
        }
        else{
            reverse = true;
            return "Fan speed direction is backward";
        }
    }
}
