package com.project.model;
import java.sql.Timestamp;
/**
 * Created by kangxu on 2017/9/6.
 * Edit by Nanfei on 2017.9.9
 */
public class News {
    private int newsid;
    private String text;
    private String time;
    private String from;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsid=" + newsid +
                ", text='" + text + '\'' +
                ", time='" + time + '\'' +
                ", from=" + from +
                ", title='" + title + '\'' +
                '}';
    }

    public void setAll(int newsid,String text,String time,String from,String title)
    {
        setFrom(from);
        setNewsid(newsid);
        setText(text);
        setTime(time);
        setTitle(title);
    }
}
