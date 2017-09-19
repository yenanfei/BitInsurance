package com.project.model;
import java.sql.Date;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by Nanfei on 2017.9.9
 */
public class Frozen {
    private int frozenid;
    private String from;
    private String to;
    private String reason;

    public int getFrozenid() {
        return frozenid;
    }

    public void setFrozenid(int frozenid) {
        this.frozenid = frozenid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Frozen{" +
                "frozenid=" + frozenid +
                ", from=" + from +
                ", to=" + to +
                ", reason='" + reason + '\'' +
                '}';
    }
    public void setAll(int frozenid,String from,String to,String reason)
    {
        setReason(reason);
        setFrom(from);
        setFrozenid(frozenid);
        setTo(to);
    }
}
