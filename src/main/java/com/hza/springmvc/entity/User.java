package com.hza.springmvc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Create by hza
 * 2019-11-14 12:54
 */
public class User {
    private String username ;
    private Long password ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", createTime=" + createTime +
                '}';
    }
}
