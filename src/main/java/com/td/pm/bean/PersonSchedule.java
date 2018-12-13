package com.td.pm.bean;

public class PersonSchedule {
    private Integer personscheduleId;

    private String personscheduleData;

    public Integer getPersonscheduleId() {
        return personscheduleId;
    }

    public void setPersonscheduleId(Integer personscheduleId) {
        this.personscheduleId = personscheduleId;
    }

    public String getPersonscheduleData() {
        return personscheduleData;
    }

    public void setPersonscheduleData(String personscheduleData) {
        this.personscheduleData = personscheduleData == null ? null : personscheduleData.trim();
    }
}