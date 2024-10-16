package com.app.tdd;

import com.app.tdd.Service.UserService;
import com.app.tdd.dto.User;
import com.app.tdd.test.TestClockHolder;
import org.junit.jupiter.api.Test;


import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

class TDDTest {

    @Test
    public void login_test() {
        //given
        Clock clock = Clock.fixed(Instant.parse("2000-01-01T00:00:00.00Z"), ZoneId.of("UTC"));
        User user = new User();
        UserService userService = new UserService(new TestClockHolder(clock));

        //when
        userService.login(user);

        //then
        assertThat(user.getLastLoginTimeStamp()).isEqualTo(946684800000L);
    }

}