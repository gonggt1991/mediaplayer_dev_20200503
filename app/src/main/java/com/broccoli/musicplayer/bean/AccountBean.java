package com.broccoli.musicplayer.bean;

public class AccountBean {
    private String mName;
    private int mId;
    public AccountBean() {
        super();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }
}
