package com.example.booklyst;

import android.net.Uri;

public class User {
    private String uid;
    private String fullname;
    private String email;
    private String profileUrl;

    public User(String uid, String fullname, String email, String profileUrl) {
        this.uid = uid;
        this.fullname = fullname;
        this.email = email;
        this.profileUrl = profileUrl;
    }

    public User() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
