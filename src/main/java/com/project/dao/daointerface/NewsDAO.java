package com.project.dao.daointerface;

import com.project.model.News;
import org.springframework.data.repository.query.Param;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Nanfei on 2017/9/3.
 */
public interface NewsDAO {
    void InsertNews(News user);
    List<News> findNews();
    News findNewsbyTitle(@Param("title") String title);
    void updateNews(@Param("news") News news);
    void DeleteNewsByTitle(@Param("title") String title);
}
