package com.app.tdd.test;

import com.app.tdd.etc.ClockHolder;
import lombok.AllArgsConstructor;

import java.time.Clock;

@AllArgsConstructor
public class TestClockHolder implements ClockHolder {

    private Clock clock;

    @Override
    public long getMillis() {
        return clock.millis();
    }
}
