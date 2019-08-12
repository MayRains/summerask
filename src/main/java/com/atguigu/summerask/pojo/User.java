package com.atguigu.summerask.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
* 将配置文件配置的每一个属性的值都映射到该组件中
* @ConfigurationProperties --告诉 springboot 将配置文件中相关的属性值绑定 -- prefix 前缀
*   --必须注册为组件才可以使用此功能
* */
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String username;
    private String password;
    private String email;
    private boolean money;
    private Date birth;

    private Map<String ,Object> maps;
    private List<String> lists;
    private Car car;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", money=" + money +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", car=" + car +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isMoney() {
        return money;
    }

    public void setMoney(boolean money) {
        this.money = money;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
