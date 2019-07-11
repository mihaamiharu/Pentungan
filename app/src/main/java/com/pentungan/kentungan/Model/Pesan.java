package com.pentungan.kentungan.Model;

import com.google.gson.annotations.SerializedName;

public class Pesan {
    @SerializedName("status")
    private String status; // status dari request 200/400
    @SerializedName("message")
    private String message; // pesan berhasil / gagal

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
