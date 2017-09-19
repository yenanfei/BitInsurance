package com.project.model;
import java.sql.Date;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by nanfei on 2017.9.9
 */
public class SalesmanInfo {
    private int salesmanid;
    private String name;
    private String realname;
    private String gender;
    private String age;
    private String phone;
    private String post;
    private String idcard;

    public int getSalesmanid() {
        return salesmanid;
    }

    public void setSalesmanid(int salesmanid) {
        this.salesmanid = salesmanid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "SalemanInfo{" +
                "salesmanid=" + salesmanid +
                ", name='" + name + '\'' +
                ", realname='" + realname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", post='" + post + '\'' +
                ", idcard='" + idcard + '\'' +
                '}';
    }
    public void setAll(int salesmanid,String name,String realname,String gender,String age,String phone,String post,String idcard)
    {
        setSalesmanid(salesmanid);
        setName(name);
        setRealname(realname);
        setGender(gender);
        setAge(age);
        setPhone(phone);
        setPost(post);
        setIdcard(idcard);
    }
}
