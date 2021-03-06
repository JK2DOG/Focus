package com.ihewro.focus.bean;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : hewro
 *     e-mail : ihewro@163.com
 *     time   : 2019/05/06
 *     desc   : 订阅的文件夹
 *     version: 1.0
 * </pre>
 */
public class FeedFolder extends LitePalSupport {

    private int id;//使用int型主键

    @Column(unique = true, defaultValue = "")
    private String name;//文件夹名称,且是唯一的，订阅可以重名，但是文件夹不能重名
    @Column(defaultValue = "1.0")
    private double orderValue;//顺序权限，用来排序的

    private int timeout;//拉取的超时时间
    private String rsshub;//源内容
    private String password;//密码
    private boolean isBadGuy;//是否需要反盗链图片
    private boolean isOnline;//同步的时候是否请求数据


    @Column(ignore = true)
    private int notReadNum;

    @Column(ignore = true)
    private List<Feed> feedList = new ArrayList<>();

    public FeedFolder(String name) {
        this.name = name;
    }


    public FeedFolder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public int getNotReadNum() {
        return notReadNum;
    }

    public void setNotReadNum(int notReadNum) {
        this.notReadNum = notReadNum;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public List<Feed> getFeedList() {
        if (feedList == null){
            feedList = new ArrayList<>();
        }
        return feedList;
    }

    public void setFeedList(List<Feed> feedList) {
        this.feedList = feedList;
    }

    public String getRsshub() {
        return rsshub;
    }

    public void setRsshub(String rsshub) {
        this.rsshub = rsshub;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBadGuy() {
        return isBadGuy;
    }

    public void setBadGuy(boolean badGuy) {
        isBadGuy = badGuy;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
