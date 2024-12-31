package com.mustafazengin.handler;

import lombok.Data;

import java.util.Date;


public class Exception<E> {

    private String hostName;

    private String path;

    private Date createTime;

    private E message;

    public String getHostName() {
        return hostName;
    }

    public String getPath() {
        return path;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public E getMessage() {
        return message;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setMessage(E message) {
        this.message = message;
    }
}
