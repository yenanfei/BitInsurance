package com.project.dao.daoop;

import com.project.dao.daointerface.TradeDao;
import com.project.model.Record;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import net.sf.json.JSONObject;
/**
 * Created by xiaodata on 2017/9/11.
 */
public class TradeDaoImpl implements TradeDao{
    public ArrayList<String> Solve(String json)
    {
        ArrayList<String> ret=new ArrayList<>();

        for(int i=0;i<json.length();i++)
       {
           String tmp = "";
           for (int j = 0; j < 8; j++) {
                tmp += json.charAt(i + j);
           }
           if (tmp.equals("recordid")) {
               boolean flag=false;
               String sv="";
               for(int j=i;j<json.length();j++)
               {
                    if(j=='\'')
                    {
                        if(flag)
                            break;
                        else
                        {
                            flag=true;
                            continue;
                        }
                    }
                    sv+=json.charAt(j);
               }
               ret.add(sv);
           }
        }

        for(int i=0;i<json.length();i++)
        {
            String tmp = "";
            for (int j = 0; j < 4; j++) {
                tmp += json.charAt(i + j);
            }
            if (tmp.equals("from")) {
                boolean flag=false;
                String sv="";
                for(int j=i;j<json.length();j++)
                {
                    if(j=='\'')
                    {
                        if(flag)
                            break;
                        else
                        {
                            flag=true;
                            continue;
                        }
                    }
                    sv+=json.charAt(j);
                }
                ret.add(sv);
            }
        }

        for(int i=0;i<json.length();i++)
        {
            String tmp = "";
            for (int j = 0; j < 9; j++) {
                tmp += json.charAt(i + j);
            }
            if (tmp.equals("productid")) {
                boolean flag=false;
                String sv="";
                for(int j=i;j<json.length();j++)
                {
                    if(j=='\'')
                    {
                        if(flag)
                            break;
                        else
                        {
                            flag=true;
                            continue;
                        }
                    }
                    sv+=json.charAt(j);
                }
                ret.add(sv);
            }
        }

        for(int i=0;i<json.length();i++)
        {
            String tmp = "";
            for (int j = 0; j < 4; j++) {
                tmp += json.charAt(i + j);
            }
            if (tmp.equals("time")) {
                boolean flag=false;
                String sv="";
                for(int j=i;j<json.length();j++)
                {
                    if(j=='\'')
                    {
                        if(flag)
                            break;
                        else
                        {
                            flag=true;
                            continue;
                        }
                    }
                    sv+=json.charAt(j);
                }
                ret.add(sv);
            }
        }
        return ret;
    }
    @Override
    public ArrayList<String> FindTrade(int id) {
        String url ="http://192.168.99.100:7050/chaincode";
        String json = getHttpResponse(url,id);
        return Solve(json);
    }

    @Override
    public void InsertTrade(Record a) {
        String url ="http://192.168.99.100:7050/chaincode";
        String json = getHttpResponseinvoke(url,a);
    }

    public static String getHttpResponse(String allConfigUrl,int id) {
        BufferedReader in = null;
        StringBuffer result = null;
        try {
            URI uri = new URI(allConfigUrl);
            URL url = uri.toURL();
            URLConnection connection =  url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
            connection.setDoOutput(true);
            connection.connect();

            JSONObject obj1 = new JSONObject();
            JSONObject obj2 = new JSONObject();
            JSONObject obj3 = new JSONObject();
            JSONObject obj4 = new JSONObject();

            //POST请求
            DataOutputStream out = new DataOutputStream(
                    connection.getOutputStream());

            obj3.element("name", "hh");

            obj4.element("function", "query");
            obj4.element("args",new String[]{String.valueOf(id)});

            obj2.element("type",1);
            obj2.element("chaincodeID", obj3);
            obj2.element("ctorMsg", obj4);
            obj2.element("secureContext","jim");

            obj1.element("jsonrpc", "2.0");
            obj1.element("method", "query");
            obj1.element("params", obj2);
            obj1.element("id", "5");

            out.writeBytes(obj1.toString());
            out.flush();
            out.close();

            result = new StringBuffer();
            //读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }

            return result.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static String getHttpResponseinvoke(String allConfigUrl,Record a) {
        BufferedReader in = null;
        StringBuffer result = null;
        try {
            URI uri = new URI(allConfigUrl);
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
            connection.setDoOutput(true);
            connection.connect();
            JSONObject obj1 = new JSONObject();
            JSONObject obj2 = new JSONObject();
            JSONObject obj3 = new JSONObject();
            JSONObject obj4 = new JSONObject();

            //POST请求
            DataOutputStream out = new DataOutputStream(
                    connection.getOutputStream());

            obj3.element("name", "hh");

            obj4.element("function", "invoke");
            obj4.element("args",new String[]{String.valueOf(a.getRecordid()),a.toString()});
            System.out.print(obj4.toString());
            obj2.element("type",1);
            obj2.element("chaincodeID", obj3);
            obj2.element("ctorMsg", obj4);
            obj2.element("secureContext","jim");

            obj1.element("jsonrpc", "2.0");
            obj1.element("method", "invoke");
            obj1.element("params", obj2);
            obj1.element("id", "3");

            out.writeBytes(obj1.toString());
            out.flush();
            out.close();

            result = new StringBuffer();
            //读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }

            return result.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

}
