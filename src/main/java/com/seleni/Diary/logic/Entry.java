package com.seleni.Diary.logic;

import com.seleni.Diary.logic.security.User;

import java.util.Date;

public class Entry {

    private int id;

    private Date date;
    private String thoughtsOfTDay;
    private String specialWords;
  //  private byte foto;
    private String iconName;
    private byte iconImg;
    private String backgroundImgName;
    private byte backgroundImg;
    private String favouriteSong;
    private String location;

    private User user;
    private String userName;


    public Entry() {
    }

    //all possible constructors necessary?


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getThoughtsOfTDay() {
        return thoughtsOfTDay;
    }

    public void setThoughtsOfTDay(String thoughtsOfTDay) {
        this.thoughtsOfTDay = thoughtsOfTDay;
    }

    public String getSpecialWords() {
        return specialWords;
    }

    public void setSpecialWords(String specialWords) {
        this.specialWords = specialWords;
    }

/*    public byte getFoto() {
        return foto;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }*/

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public byte getIconImg() {
        return iconImg;
    }

    public void setIconImg(byte iconImg) {
        this.iconImg = iconImg;
    }

    public String getBackgroundImgName() {
        return backgroundImgName;
    }

    public void setBackgroundImgName(String backgroundImgName) {
        this.backgroundImgName = backgroundImgName;
    }

    public byte getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(byte backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getFavouriteSong() {
        return favouriteSong;
    }

    public void setFavouriteSong(String favouriteSong) {
        this.favouriteSong = favouriteSong;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}



