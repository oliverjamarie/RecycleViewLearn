package com.example.learnrecylcerview;

public class Cours {
    private int ID;
    private String title;
    private String desc;

    public Cours(int ID, String title, String desc) {
        this.ID = ID;
        this.title = title;
        this.desc = desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
