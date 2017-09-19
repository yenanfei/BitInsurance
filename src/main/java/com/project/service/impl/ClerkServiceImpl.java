package com.project.service.impl;
import com.project.dao.daointerface.InsuranceInfoDao;
import com.project.dao.daoop.ClaimDaoImpl;
import com.project.dao.daoop.InsuranceInfoDaoImpl;
import com.project.dao.daoop.PolicyDaoImpl;
import com.project.dao.daoop.ReportDaoImpl;
import com.project.model.Claim;
import com.project.model.Insurance;
import com.project.model.Policy;
import com.project.model.Report;
import com.project.service.ClerkService;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Service("clerkServiceImpl")
public class ClerkServiceImpl implements ClerkService{
    InsuranceInfoDaoImpl InDao;
    ReportDaoImpl ReDao;
    ClaimDaoImpl CDao;
    PolicyDaoImpl PDao;
    @Autowired
    public void setInsuranceInfoDaoImpl(InsuranceInfoDaoImpl Ins)
    {
        this.InDao=Ins;
    }
    @Autowired
    public void setReportDaoImpl(ReportDaoImpl re)
    {
        this.ReDao=re;
    }
    @Autowired
    public void setClaimDaoImpl(ClaimDaoImpl ClDao)
    {
        this.CDao=ClDao;
    }
    @Autowired
    public void setPolicyDaoImpl(PolicyDaoImpl PolicyDao)
    {
        this.PDao=PolicyDao;
    }
    int toInt(String x)
    {
        int ret=0;
        for(int i=0;i<x.length();i++)
        {
            ret*=10;
            ret+=(x.charAt(i)-'0');
        }
        return ret;
    }
    @Override
    public  ArrayList<ArrayList<String>> SelectClaimList(){
        ArrayList<ArrayList<String>> ret=new ArrayList<>();
        List<Claim> sv=CDao.findClaim();
        for(Claim var:sv)
        {
            ArrayList<String> tmp=new ArrayList<>();
            Policy P=PDao.FindPolicybypolicyid(var.getPolicyid());
            Insurance In=InDao.FindInsurancebyproductid(P.getProductid());
            tmp.add(String.valueOf(var.getClaimid()));
            tmp.add(String.valueOf(P.getUserrecordid()));
            tmp.add(In.getName());
            tmp.add(P.getName());
            tmp.add(var.getAllowed());
            ret.add(tmp);
        }
        return ret;
    }
    @Override
    public boolean  claimaccept( String id){
        try
        {
            Claim C=CDao.findClaimByClaimid(toInt(id));
            C.setAllowed("同意");
            CDao.UpdateClaimbyClaimId(C);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    @Override
    public ArrayList<String> SelectReportById( String reportId){
        return null;
    }

    @Override
    public boolean  reportaccept( String tradeId){
        return true;
    }

    @Override
    public ArrayList<ArrayList<String>>SelectinsuranceList()
    {
        ArrayList<ArrayList<String>> ret=new ArrayList<>();
        List<Insurance> L=InDao.FindInsurance();
        for(Insurance var:L)
        {
            ArrayList<String> tmp=new ArrayList<>();
            tmp.add(String.valueOf(var.getProductid()));
            tmp.add(var.getName());
            tmp.add(var.getShortcut());
            ret.add(tmp);
        }
        return ret;
    }
    @Override
    public boolean AddInsurance(String insurancename,String gaishu,String content,String price)
    {
        try{
            Insurance I=new Insurance();
            I.setAll(toInt(price),insurancename,content,gaishu);
            InDao.InsertInsurance(I);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }


    @Override
    public void Award() {

    }

    @Override
    public void Ban() {

    }

    @Override
    public boolean DeleteInsurance(String insuranceId) {
        try
        {
            InDao.DeleteInsurancebyproductid(toInt(insuranceId));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
        //InDao.DeleteInsurancebyproductid(id);
    }

    @Override
    public void ReviewClaim() {

    }

    @Override
    public ArrayList<String> SelectClaim(String id) {
        Claim C=CDao.findClaimByClaimid(toInt(id));
        ArrayList<String> ret=new ArrayList<>();
        ret.add(id);
        ret.add(C.getReason());
        return ret;
    }

    @Override
    public void SelectInsurance() {
        //InDao.FindInsurance();
    }

    @Override
    public ArrayList<ArrayList<String>> SelectReport() {
        //ReDao.FindReport();
        ArrayList<ArrayList<String>> ret=new ArrayList<>();
        List<Report> R=ReDao.FindReport();
        for(Report var:R)
        {
            ArrayList<String> tmp=new ArrayList<>();
            tmp.add(String.valueOf(var.getReportid()));
            tmp.add(String.valueOf(var.getRecordid()));
            tmp.add(var.getFrom());
            tmp.add(var.getTo());
            ret.add(tmp);
        }
        return ret;
    }

    @Override
    public void UpdateInsurance() {

    }
}
