package com.seleni.Diary.logic.api;

public class Condition {

    private String main;
    private String description;

    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "main='" + main + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
