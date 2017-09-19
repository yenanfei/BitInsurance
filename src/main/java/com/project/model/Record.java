package com.project.model;
import java.sql.Timestamp;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by nanfei on 2017.9.9
 */
public class Record {
    private int recordid;
    private String from1;
    private int productid;
    private  String time1;

    public int getRecordid() {
        return recordid;
    }

    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    public String getFrom() {
        return from1;
    }

    public void setFrom(String from) {
        this.from1 = from;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getTime() {
        return time1;
    }

    public void setTime( String time) {
        this.time1 = time;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordid=" + String.valueOf(recordid) +
                ", from=" + from1 +
                ", productid=" + String.valueOf(productid) +
                ", time=" + time1 + '\'' +
                '}';
    }

    public void setAll(String from1, int productid, String time1)
    {
        setFrom(from1);
        setProductid(productid);
        setTime(time1);
    }
}
