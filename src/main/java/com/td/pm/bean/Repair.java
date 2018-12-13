package com.td.pm.bean;

public class Repair {
    private Integer repairId;

    private String repairData;

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public String getRepairData() {
        return repairData;
    }

    public void setRepairData(String repairData) {
        this.repairData = repairData == null ? null : repairData.trim();
    }
}