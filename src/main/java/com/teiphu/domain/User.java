package com.teiphu.domain;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Lifu.Zheng
 * @data 2018.04.20 14:53
 */
public class User {

    private Long userId;

    private String userName;

    private String userNickname;

    private String userPassword;

    private String userSex;

    private String userEmail;

    private String userAvatar;

//    private Date userRegTime;

    private Timestamp userRegTime;

    private Long userStatus;

    public User() {
    }

    public User(Long userId, String userName, String userNickname,
                String userPassword, String userSex, String userEmail,
                String userAvatar, Timestamp userRegTime, Long userStatus) {
        this.userId = userId;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.userSex = userSex;
        this.userEmail = userEmail;
        this.userAvatar = userAvatar;
        this.userRegTime = userRegTime;
        this.userStatus = userStatus;
    }

    public User(String userName, String userNickname, String userPassword,
                String userSex, String userEmail, String userAvatar,
                Timestamp userRegTime) {
        this.userName = userName;
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.userSex = userSex;
        this.userEmail = userEmail;
        this.userAvatar = userAvatar;
        this.userRegTime = userRegTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public Timestamp getUserRegTime() {
        return userRegTime;
    }

    public void setUserRegTime(Timestamp userRegTime) {
        this.userRegTime = userRegTime;
    }

    public Long getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Long userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", userRegTime=" + userRegTime +
                ", userStatus=" + userStatus +
                '}';
    }
}
