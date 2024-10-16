package com.app.tdd.etc;

import java.time.Clock;

public class SystemClockHolder implements ClockHolder {
    @Override
    public long getMillis() {
        return Clock.systemUTC().millis();
    }
}
