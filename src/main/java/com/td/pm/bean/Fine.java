package com.td.pm.bean;

public class Fine {
    private Integer fineId;

    private String fineUserId;

    private Integer finePay;

    private Integer finePaid;

    private String fineDescripe;

    public Integer getFineId() {
        return fineId;
    }

    public void setFineId(Integer fineId) {
        this.fineId = fineId;
    }

    public String getFineUserId() {
        return fineUserId;
    }

    public void setFineUserId(String fineUserId) {
        this.fineUserId = fineUserId == null ? null : fineUserId.trim();
    }

    public Integer getFinePay() {
        return finePay;
    }

    public void setFinePay(Integer finePay) {
        this.finePay = finePay;
    }

    public Integer getFinePaid() {
        return finePaid;
    }

    public void setFinePaid(Integer finePaid) {
        this.finePaid = finePaid;
    }

    public String getFineDescripe() {
        return fineDescripe;
    }

    public void setFineDescripe(String fineDescripe) {
        this.fineDescripe = fineDescripe == null ? null : fineDescripe.trim();
    }
}