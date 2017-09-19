package com.project.dao.daoop;

/*
  Created by Nanfei on 2017/9/3.
 */
import com.project.dao.daointerface.NewsDAO;
import com.project.db.ConnectDB;
import com.project.model.News;
import com.project.model.User;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component("NewsDAOImpl")
public class NewsDaoImpl implements NewsDAO {
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }
    private NewsDAO newsDAO = null;
    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        newsDAO = sqlSession.getMapper(NewsDAO.class);
    }
    @Override
    public void InsertNews(News news) {
        if(sqlSession==null)
        {
            setSession();
        }
        newsDAO.InsertNews(news);
        sqlSession.commit();
    }

    @Override
    public List<News> findNews() {
        if(sqlSession==null)
        {
            setSession();
        }
        List<News> news=newsDAO.findNews();
        return news;
    }

    @Override
    public void updateNews(News news) {
        if(sqlSession==null)
        {
            setSession();
        }
        newsDAO.updateNews(news);
        sqlSession.commit();
    }

    @Override
    public News findNewsbyTitle(String title) {
        if (sqlSession == null)
        {
            setSession();
        }
        News news=null;
        news=newsDAO.findNewsbyTitle(title);
        return news;
    }

    @Override
    public void DeleteNewsByTitle(String title) {
        if (sqlSession == null)
        {
            setSession();
        }
        newsDAO.DeleteNewsByTitle(title);
        sqlSession.commit();
    }
}
