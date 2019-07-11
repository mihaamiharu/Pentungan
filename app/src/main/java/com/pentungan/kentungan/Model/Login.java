package com.pentungan.kentungan.Model;

import com.google.gson.annotations.SerializedName;

public class Login {
    @SerializedName("nama_user")
    private String nama;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
