package com.td.pm.bean;

public class Equipments {
    private String equipId;

    private String equipName;

    private Integer equipTotal;

    private Integer equipRest;

    private Integer equipConst;

    private String equipPhoto;

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId == null ? null : equipId.trim();
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName == null ? null : equipName.trim();
    }

    public Integer getEquipTotal() {
        return equipTotal;
    }

    public void setEquipTotal(Integer equipTotal) {
        this.equipTotal = equipTotal;
    }

    public Integer getEquipRest() {
        return equipRest;
    }

    public void setEquipRest(Integer equipRest) {
        this.equipRest = equipRest;
    }

    public Integer getEquipConst() {
        return equipConst;
    }

    public void setEquipConst(Integer equipConst) {
        this.equipConst = equipConst;
    }

    public String getEquipPhoto() {
        return equipPhoto;
    }

    public void setEquipPhoto(String equipPhoto) {
        this.equipPhoto = equipPhoto == null ? null : equipPhoto.trim();
    }
}