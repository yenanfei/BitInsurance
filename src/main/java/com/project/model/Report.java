package com.project.model;
import java.sql.Date;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by Nanfei on 2017.9.9
 */
public class Report {
    private int recordid;
    private int reportid;
    private String from1;
    private String to1;
    private String reason;
    private int agree=-1;
    private String agreeperson;

    public String getAgreeperson() {
        return agreeperson;
    }

    public void setAgreeperson(String agreeperson) {
        this.agreeperson = agreeperson;
    }

    public int getRecordid() {
        return recordid;
    }
    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }

    public String getFrom() {
        return from1;
    }

    public void setFrom(String from) {
        this.from1 = from;
    }

    public String getTo() {
        return to1;
    }

    public void setTo(String to) {
        this.to1 = to;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getAgree() {
        return agree;
    }

    public void setAgree(int agree) {
        this.agree = agree;
    }
    public String toString() {
        return "Report{" +
                "recordid=" + recordid +
                ", reportid=" + reportid +
                ", from='" + from1 + '\'' +
                ", to='" + to1 + '\'' +
                ", reason='" + reason + '\'' +
                ", agree=" + agree +
                ", agreeperson='" + agreeperson + '\'' +
                '}';
    }

    public void setAll(String from1, String to1, String reason, int agree, int recordid,String agreeperson)
    {
        setFrom(from1);
        setAgree(agree);
        setReason(reason);
        setTo(to1);
        setRecordid(recordid);
        setAgreeperson(agreeperson);
    }
}
