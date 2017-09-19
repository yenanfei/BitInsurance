package com.project.model;
import java.sql.Timestamp;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by Nanfei on 2017/9/9
 */
public class UserInfo {
    private String realname;
    private String name;
    private String age;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String idcard;
    private String disease;
    private int score=0;

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public int getScore() {
        return score;
    }


    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }



    public void setDisease(String disease) {
        this.disease = disease;
    }



    public void setScore(int score) {
        this.score = score;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "realname='" + realname + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", idcard='" + idcard + '\'' +
                ", disease='" + disease + '\'' +
                ", score=" + score +
                '}';
    }

    public void setAll(String realname, String name, String age, String gender, String phone, String email, String address,
                       String disease,String idcard,int score)
    {
        setRealname(realname);
        setName(name);
        setAge(age);
        setGender(gender);
        setPhone(phone);
        setEmail(email);
        setAddress(address);
        setDisease(disease);
        setIdcard(idcard);
        setScore(score);
    }

}
