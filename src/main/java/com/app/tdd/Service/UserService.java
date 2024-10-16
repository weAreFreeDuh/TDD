package com.app.tdd.Service;

import com.app.tdd.etc.ClockHolder;
import lombok.RequiredArgsConstructor;

import com.app.tdd.dto.User;



@RequiredArgsConstructor
public class UserService {

    private final ClockHolder clockHolder;

    public void login(User user) {
        user.login(clockHolder);
    }

}
