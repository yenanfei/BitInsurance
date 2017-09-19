package com.project.service.impl;
import com.project.dao.daoop.*;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
    UserInfoDaoImpl Uinfo;
    ReportDaoImpl RImpl;
    InsuranceInfoDaoImpl IImpl;
    RecordDaoImpl ReImpl;
    PolicyDaoImpl PoDao;
    ClaimDaoImpl CDao;
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
    long ToInt(String x)
    {
        long ret=0;
        for(int i=0;i<x.length();i++)
        {
            ret*=10;
            ret+=(x.charAt(i)-'0');
        }
        return ret;
    }
    @Autowired
    public void setUserInfoDaoImp1(UserInfoDaoImpl userInfo) {
        this.Uinfo=userInfo;
    }
    @Autowired
    public void setReportDaoImpl(ReportDaoImpl ReportDao) {
        this.RImpl=ReportDao;
    }
    @Autowired
    public void setInsuranceDaoImpl(InsuranceInfoDaoImpl InsuranceDao) {
        this.IImpl=InsuranceDao;
    }
    @Autowired
    public void setRecordDaoImol(RecordDaoImpl RecordD)
    {
        this.ReImpl=RecordD;
    }
    @Autowired
    public void setPolciyDaoImpl(PolicyDaoImpl PolicyDao)
    {
        this.PoDao=PolicyDao;
    }
    @Autowired
    public void setClaimDaoImpl(ClaimDaoImpl C)
    {
        this.CDao=C;
    }
    @Override
    public void Claim() {

    }

    //todo
    //根据传入参数修改数据库内属性
    @Override
    public void InfoManagement(String username,String password,String age,String mail,String sex,String phone,String IDcard,String illness,String addressr,String realname){
        UserInfo U=new UserInfo();
        U.setAll(realname,username,age,sex,phone,mail,addressr,illness,IDcard,0);
        Uinfo.UpdateUserInfobyusername(U);
    }

    //todo
    //传入用户id，返回用户信息表
    @Override
    public  UserInfo SelectInfo(String username)
    {
        return Uinfo.FindUserInfobyusername(username);
    }

    @Override
    public void InsuranceManagement() {

    }

    //todo
    //根据传入信息修改report表
    @Override
    public void Report(String tradeId,String name,String username,String reason) {
        Report re=new Report();
        int tmp=toInt(tradeId);
        re.setAll(username,name,reason,0,tmp,"");
        RImpl.InsertReportbyreportid(re);
    }
    //todo
    //传入用户ID，返回该用户名下的举报ID和状态，例如[[12,0],[13,1],[14,0]]
    @Override
    public ArrayList<ArrayList<String>> SelectReportID(String ID){
        try {
            List<Report> L = RImpl.FindReportbyto(ID);
            ArrayList<ArrayList<String>> ret = new ArrayList<>();
            for (Report var : L) {
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(String.valueOf(var.getReportid()));
                if (var.getAgree() == 0) {
                    tmp.add("No");
                } else {
                    tmp.add("Yes");
                }
                ret.add(tmp);
            }
            return ret;
        }
        catch (Exception e)
        {
            System.out.print(e);
            return null;
        }
    }

    //todo
    //传入举报ID，输出举报内容和交易号
    @Override
    public Report SelectReportById(String reportId){
        return RImpl.FindReportbyreportid(toInt(reportId));
    }

    //todo
    //返回保险ID，保险名,简述，有多少返回多少 格式：[[1,断腿保险，这是断腿保险]，[2，艾滋保险，这是**保险]]
    @Override
    public ArrayList<ArrayList<String>> SelectInsurance(){
        ArrayList<ArrayList<String>> ret = new ArrayList<>();
        List<Insurance> L=IImpl.FindInsurance();
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

    //todo
    //根据传入的保险ID返回保险名称和内容
    @Override
    public ArrayList<String> SelectInsuranceById(String InsuranceId){
        ArrayList<String> strList = new ArrayList<>();
        int ID=toInt(InsuranceId);
        Insurance tmp=IImpl.FindInsurancebyproductid(ID);
        strList.add(tmp.getName());
        strList.add(tmp.getText());
        return strList;
    }
    //todo
    //传入保险ID和开始时间，返回保险名，投保者姓名，保险价格，结束时间和积分
    @Override
    public ArrayList<String> Insuranced(String username,String starttime) {
        ArrayList<String> ret=new ArrayList<>();
        String sttime="";
        int tmp;
        for(int i=0;i<4;i++)
        {
            sttime+=starttime.charAt(i);
        }
        tmp=toInt(sttime);
        tmp+=1;
        sttime=String.valueOf(tmp);
        for(int i=4;i<starttime.length();i++)
        {
            sttime+=starttime.charAt(i);
        }
        Insurance In=IImpl.FindInsurancebyproductid(toInt(username));
        ret.add(In.getName());
        ret.add(String.valueOf(In.getPrice()));
        ret.add(sttime);
        return ret;
    }

    //todo
    //传入投保人姓名，保险ID，使用的积分数，传出boolen以判断是否成功
    @Override
    public boolean  pay(String fromrealname,String insuranceId,String scorepay,String time,String username) {
        try {
            TradeDaoImpl TIml = new TradeDaoImpl();
            Record re = new Record();
            Policy Po = new Policy();
            re.setAll(username, toInt(insuranceId), time);
            ReImpl.InsertRecord(re);
            re = ReImpl.FindRecordfortop();
            TIml.InsertTrade(re);
            Po.setAll(re.getRecordid(), toInt(insuranceId), username, re.getRecordid());
            PoDao.InsertPolicy(Po);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    //todo
    //传入用户名，返回保险名,开始时间，交易号,有多少返回多少 格式：[[断腿保险，08年，1]，[艾滋保险，12年，22]]
    @Override
    public ArrayList<ArrayList<String>> SelectInsuranceManage(String username)
    {
        TradeDaoImpl T=new TradeDaoImpl();
        ArrayList<ArrayList<String>> ret=new ArrayList<>();
        List<Policy> sv=PoDao.FindPolicy(username);
        for(Policy var:sv)
        {
            ArrayList<String> tmp=new ArrayList<>();
            ArrayList<String> D=new ArrayList<>();
            Insurance t=IImpl.FindInsurancebyproductid(var.getProductid());
            tmp.add(String.valueOf(var.getUserrecordid()));
            tmp.add(t.getName());
            D=T.FindTrade(var.getUserrecordid());
            tmp.add(D.get(3));
            ret.add(tmp);
        }
        return ret;
    }

    //todo
    //传入投保人姓名，保险ID，使用的积分数，传出boolen以判断是否成功
    @Override
    public boolean sureClaim(String tradeId,String claimreason) {
        try {
            Claim Cl = new Claim();
            Cl.setAll(toInt(tradeId), claimreason,"","");
            CDao.InsertClaim(Cl);
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }
}
