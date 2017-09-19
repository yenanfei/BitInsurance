package com.project.service;

import java.util.ArrayList;

/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface TouristService {
    public ArrayList<ArrayList<String>> SelectTrade(String tradeid);
    public ArrayList<String> SelectNotifiction(String newsid);
    ArrayList<ArrayList<String>> selectalltrade();
}
