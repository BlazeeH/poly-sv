/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poly.sv.model;

/**
 *
 * @author Utech
 */
public class BangDiem {
    private String MaLop, MSSV;
    private float TiengAnh, XSTK, GDTC;

    public BangDiem() {
    }

    public BangDiem(String MaLop, String MSSV, float TiengAnh, float XSTK, float GDTC) {
        this.MaLop = MaLop;
        this.MSSV = MSSV;
        this.TiengAnh = TiengAnh;
        this.XSTK = XSTK;
        this.GDTC = GDTC;
    }

    public String getMaLop() {
        return MaLop;
    }

    public String getMSSV() {
        return MSSV;
    }

    public float getTiengAnh() {
        return TiengAnh;
    }

    public float getXSTK() {
        return XSTK;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void setTiengAnh(float TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public void setXSTK(float XSTK) {
        this.XSTK = XSTK;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
}
