package com.td.pm.bean;

import java.util.Date;

public class Notice {
    private Integer noticeId;

    private Date noticeDate;

    private String noticeTitle;

    private String noticeDescripe;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeDescripe() {
        return noticeDescripe;
    }

    public void setNoticeDescripe(String noticeDescripe) {
        this.noticeDescripe = noticeDescripe == null ? null : noticeDescripe.trim();
    }
}