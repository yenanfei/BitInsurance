package com.project.model;
import java.sql.Date;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by Nanfei on 2017.9.9
 */
public class Insurance {
    private int productid;
    private String name;
    private int price;
    private String text;
    private String shortcut;

    @Override
    public String toString() {
        return "Insurance{" +
                "productid=" + productid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", text='" + text + '\'' +
                ", shortcut='" + shortcut + '\'' +
                '}';
    }

//    private String text;

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAll(int price, String name,String text,String shortcut)
    {
        setName(name);
        setPrice(price);
        setText(text);
        setShortcut(shortcut);
    }

}
