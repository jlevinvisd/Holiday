package com.company;

public class Holiday {
    String month;
    int Day;
    String name;
    String description;
    boolean fedRecognized;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFedRecognized() {
        return fedRecognized;
    }

    public void setFedRecognized(boolean fedRecognized) {
        this.fedRecognized = fedRecognized;
    }




}
