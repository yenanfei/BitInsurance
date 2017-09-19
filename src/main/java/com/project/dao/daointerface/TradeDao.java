package com.project.dao.daointerface;

import com.project.model.Record;

import java.util.ArrayList;

/**
 * Created by xiaodata on 2017/9/11.
 */
public interface TradeDao {
    public ArrayList<String> FindTrade(int id);
    public void InsertTrade(Record a);
}
