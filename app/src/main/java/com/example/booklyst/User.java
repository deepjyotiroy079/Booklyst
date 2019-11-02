package com.example.booklyst;

import android.net.Uri;

public class User {
    private String uid;
    private String fullname;
    private String email;
    public String phone;
    public Uri profile_uri;

    public User() {
    }
    // for login using Google Sign in
    public User(String uid, String fullname, String email, String phone, Uri profile_uri) {
        this.uid = uid;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.profile_uri = profile_uri;
    }

    // getters
    public String getUid() {
        return uid;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Uri getProfile_uri() {
        return profile_uri;
    }

    // setters
    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProfile_uri(Uri profile_uri) {
        this.profile_uri = profile_uri;
    }
}
