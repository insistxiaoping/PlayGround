package com.td.pm.bean;

public class Areas {
    private String areaId;

    private String areaName;

    private Integer areaTotal;

    private Integer areaRest;

    private Integer areaConst;

    private String areaPhoto;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Integer areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Integer getAreaRest() {
        return areaRest;
    }

    public void setAreaRest(Integer areaRest) {
        this.areaRest = areaRest;
    }

    public Integer getAreaConst() {
        return areaConst;
    }

    public void setAreaConst(Integer areaConst) {
        this.areaConst = areaConst;
    }

    public String getAreaPhoto() {
        return areaPhoto;
    }

    public void setAreaPhoto(String areaPhoto) {
        this.areaPhoto = areaPhoto == null ? null : areaPhoto.trim();
    }
}