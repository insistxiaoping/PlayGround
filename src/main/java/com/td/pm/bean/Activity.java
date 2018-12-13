package com.td.pm.bean;

import java.util.Date;

public class Activity {
    private Integer activityId;

    private Date activityDate;

    private String activityType;

    private String activityTitle;

    private String activityDescripe;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    public String getActivityDescripe() {
        return activityDescripe;
    }

    public void setActivityDescripe(String activityDescripe) {
        this.activityDescripe = activityDescripe == null ? null : activityDescripe.trim();
    }
}