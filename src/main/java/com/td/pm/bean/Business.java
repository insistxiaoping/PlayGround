package com.td.pm.bean;

public class Business {
    private Integer businessId;

    private String businessData;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessData() {
        return businessData;
    }

    public void setBusinessData(String businessData) {
        this.businessData = businessData == null ? null : businessData.trim();
    }
}