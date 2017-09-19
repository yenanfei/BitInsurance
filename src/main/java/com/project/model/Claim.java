package com.project.model;
import java.sql.Date;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by Nanfei on 2017.9.9
 */
public class Claim {

    private int claimid;
    private int policyid;
    private String reason;
    private String allowed;
    private String denyreason;

    public int getClaimid() {
        return claimid;
    }

    public int getPolicyid() {
        return policyid;
    }

    public String getReason() {
        return reason;
    }

    public String getAllowed() {
        return allowed;
    }

    public String getDenyreason() {
        return denyreason;
    }

    public void setClaimid(int claimid) {
        this.claimid = claimid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setAllowed(String allowed) {
        this.allowed = allowed;
    }

    public void setDenyreason(String denyreason) {
        this.denyreason = denyreason;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimid=" + claimid +
                ", policyid=" + policyid +
                ", reason='" + reason + '\'' +
                ", allowed='" + allowed + '\'' +
                ", denyreason='" + denyreason + '\'' +
                '}';
    }

    public void setAll(int policyid,String reason,String a,String b)
    {
        setPolicyid(policyid);
        setReason(reason);
        setAllowed(a);
        setDenyreason(b);
    }

}
