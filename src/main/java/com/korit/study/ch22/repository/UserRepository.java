package com.korit.study.ch22.repository;


import com.korit.study.ch17.PrincipalAuthentication;
import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository {
    private static UserRepository instance;
    private User[] users;
    private int autoIncrementId;

    private UserRepository() {
        users = new User[0];
        autoIncrementId = 1;
    }


    public static UserRepository getInstance() {
        if(Objects.isNull(instance)) {
            instance = new UserRepository();
        }
        return instance;
    }
    // 빈공간 만들고 추가했던 작업을 copyof로 간단하게한 작업
    public void  insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        user.setId(autoIncrementId++);
        temp[temp.length - 1] = user;
        users = temp;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User 배열: [");
        for (int i = 0; i < users.length; i++) {
            stringBuilder.append(users[i]);
            if (i != users.length - 1) {
                stringBuilder.append(" , ");
            }
        }
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}
