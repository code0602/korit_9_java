package com.korit.study.ch16.service;

import com.korit.study.ch16.repository.UserList;
import com.korit.study.ch16.dto.SigninDto;
import com.korit.study.ch16.dto.SignupDto;
import com.korit.study.ch16.entity.User;

public class UserService {

    UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    public boolean isDuplicateUsername(String username) {
        return userList.findByUsername(username) != null;

    }

    //   로그인
    public User signin(SigninDto signinDto) {
        User foundUser = userList.findByUsername(signinDto.getUsername());
        if (foundUser == null) {
            // 사용자이름이 존재하지않습니다.
            return null;
        }
        if (!foundUser.getPassword().equals(signinDto.getPassword())) {
            return null;
        }
        return foundUser;

    }
    //    회원가입
    public void  signup(SignupDto signupDto) {
        User user = signupDto.toUser();
        user.setId(userList.generateUserId());
        userList.add(user);

    }

    public void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회");
        for (User user : userList.getUsers()) {
            System.out.println(user.toString());

        }
    }
}
