package com.example.firebasedatabase29072019;

import android.content.Intent;

public class Thongtin {
    private String vitri;
    private Integer sodienthoai;

    public Thongtin() {
    }

    public Thongtin(String vitri, Integer sodienthoai) {
        this.vitri = vitri;
        this.sodienthoai = sodienthoai;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public Integer getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(Integer sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
}
