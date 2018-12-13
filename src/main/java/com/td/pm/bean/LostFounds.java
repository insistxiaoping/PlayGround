package com.td.pm.bean;

import java.util.Date;

public class LostFounds {
    private Integer ladId;

    private Date ladDate;

    private String ladDescripe;

    private String loserName;

    private String founderName;

    private String losePhone;

    private String founderPhone;

    public Integer getLadId() {
        return ladId;
    }

    public void setLadId(Integer ladId) {
        this.ladId = ladId;
    }

    public Date getLadDate() {
        return ladDate;
    }

    public void setLadDate(Date ladDate) {
        this.ladDate = ladDate;
    }

    public String getLadDescripe() {
        return ladDescripe;
    }

    public void setLadDescripe(String ladDescripe) {
        this.ladDescripe = ladDescripe == null ? null : ladDescripe.trim();
    }

    public String getLoserName() {
        return loserName;
    }

    public void setLoserName(String loserName) {
        this.loserName = loserName == null ? null : loserName.trim();
    }

    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName == null ? null : founderName.trim();
    }

    public String getLosePhone() {
        return losePhone;
    }

    public void setLosePhone(String losePhone) {
        this.losePhone = losePhone == null ? null : losePhone.trim();
    }

    public String getFounderPhone() {
        return founderPhone;
    }

    public void setFounderPhone(String founderPhone) {
        this.founderPhone = founderPhone == null ? null : founderPhone.trim();
    }
}