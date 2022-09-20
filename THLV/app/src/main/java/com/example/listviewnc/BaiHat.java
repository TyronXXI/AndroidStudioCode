package com.example.listviewnc;

import java.lang.reflect.Constructor;

public class BaiHat {
    private String Ten;
    private String MoTa;
    private int Hinh;
    private String Gia;




    public BaiHat(String ten, String moTa, int hinh, String gia) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
        Gia = gia;


    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {Ten = ten;}

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {Gia = gia;}



}
