package com.example.travelslog.boundedContext.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private static int lastId = 0;
    private final long id;
    private final String username;
    private final String password;
    private final String nickname;
    private final String description;
    // 프로필 사진, email 추후 추가

    public User(String username, String password, String nickname, String description) {
        this(++lastId, username, password, nickname, description); 
    }
}