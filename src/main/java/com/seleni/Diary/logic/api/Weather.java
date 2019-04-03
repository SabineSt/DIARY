package com.seleni.Diary.logic.api;

import java.util.List;

public class Weather {

    private String name;
    private Country country;
    private Coordinates coords;
    private List<Condition> sunnyOrRainy;



    public void setWeather(List<Condition> sunnyOrRainy) {
        this.sunnyOrRainy = sunnyOrRainy;
    }










}
