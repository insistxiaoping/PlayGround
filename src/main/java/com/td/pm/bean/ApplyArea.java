package com.td.pm.bean;

import java.util.Date;

public class ApplyArea {
    private Integer applyId;

    private String applyAreaId;

    private String applyUserId;

    private Date startTime;

    private Date endTime;

    private Integer applyPay;

    private Integer applyPaid;

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getApplyAreaId() {
        return applyAreaId;
    }

    public void setApplyAreaId(String applyAreaId) {
        this.applyAreaId = applyAreaId == null ? null : applyAreaId.trim();
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId == null ? null : applyUserId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getApplyPay() {
        return applyPay;
    }

    public void setApplyPay(Integer applyPay) {
        this.applyPay = applyPay;
    }

    public Integer getApplyPaid() {
        return applyPaid;
    }

    public void setApplyPaid(Integer applyPaid) {
        this.applyPaid = applyPaid;
    }
}