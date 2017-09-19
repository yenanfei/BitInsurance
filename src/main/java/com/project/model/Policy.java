package com.project.model;
import java.sql.Date;
/**
 * Created by kangxu on 2017/9/6.
 */
public class Policy {
    private int policyid;
    private int productid;
    private String name;
    private int userrecordid;

    public int getPolicyid() {
        return policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserrecordid() {
        return userrecordid;
    }

    public void setUserrecordid(int userrecordid) {
        this.userrecordid = userrecordid;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyid=" + policyid +
                ", productid=" + productid +
                ", name='" + name + '\'' +
                ", userrecordid='" + userrecordid + '\'' +
                '}';
    }

    public void setAll(int P,int productid,String name,int userrecordid)
    {
        setPolicyid(P);
        setProductid(productid);
        setName(name);
        setUserrecordid(userrecordid);
    }
}
