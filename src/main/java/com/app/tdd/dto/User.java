package com.app.tdd.dto;

import com.app.tdd.etc.ClockHolder;
import lombok.Getter;


@Getter
public class User {

    private long lastLoginTimeStamp;

    public void login(ClockHolder clockHolder){
        this.lastLoginTimeStamp = clockHolder.getMillis();
    }

}