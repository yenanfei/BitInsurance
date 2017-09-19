package com.project.model;
import java.sql.Timestamp;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by nanfei on 2017.9.9
 */
public class User {
    private String name;
    private String password;
    private int level=-1;
    private String time;
    private String ip;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "User{"  +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", level=" + level +
                ", time=" + time +
                ", ip='" + ip + '\'' +
                '}';
    }
    public void setAll(String name,String password,int level,String time,String ip)
    {
        setName(name);
        setPassword(password);
        setLevel(level);
        setTime(time);
        setIp(ip);
    }
}
