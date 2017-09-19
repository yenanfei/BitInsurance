package com.project.service.impl;
import com.project.dao.daointerface.TradeDao;
import com.project.dao.daoop.*;
import com.project.service.TouristService;
import com.project.service.LoginService;
import com.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Service("TouristServiceImpl")
public class TouristServiceImpl implements TouristService{
    private NewsDaoImpl newsDaoImpl;
    private RecordDaoImpl RDao;
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
    @Autowired
    public void setNewsDaoImp1(NewsDaoImpl news) {
        this.newsDaoImpl=news;
    }
    @Autowired
    public void setRecordDaoImpl(RecordDaoImpl RecordDao)
    {
        this.RDao=RecordDao;
    }
    @Override
    public ArrayList<String> SelectNotifiction(String newsid) {
        ArrayList<String> ret=new ArrayList<>();
        News N=newsDaoImpl.findNewsbyTitle(newsid);
        ret.add(N.getText());
        return ret;
    }

    @Override
    public ArrayList<ArrayList<String>> SelectTrade(String tradeid) {
        ArrayList<ArrayList<String>> ret=new ArrayList<>();
        TradeDaoImpl T=new TradeDaoImpl();
        List<News> nsv=newsDaoImpl.findNews();
        ArrayList<String> tmp=new ArrayList<>();
        for(News var:nsv)
        {
            tmp.add(var.getTitle());
        }
        ret.add(T.FindTrade(toInt(tradeid)));
        ret.add(tmp);
        return ret;
    }
    @Override
    public ArrayList<ArrayList<String>> selectalltrade(){
        ArrayList<ArrayList<String>> ret=new ArrayList<>();
        TradeDaoImpl T=new TradeDaoImpl();
        List<Record> sv=RDao.FindRecord();
        for(Record var:sv) {
            ret.add(T.FindTrade(var.getRecordid()));
        }
        List<News> nsv=newsDaoImpl.findNews();
        ArrayList<String> tmp=new ArrayList<>();
        for(News var:nsv)
        {
            tmp.add(var.getTitle());
        }
        ret.add(tmp);
        return ret;
    }
}
