package com.lyn.bean;

import java.util.Date;

/**
 * @author lyn
 * @create 2020-04-28 16:09
 */
public class User {
    private String uName;
    private int age;
    private Date birthday;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + uName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
