/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poly.sv.dao;
import com.mycompany.poly.sv.helpers.DatabaseHelper;
import com.mycompany.poly.sv.model.SinhVien;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Utech
 */
public class SinhVienDAO {
    public boolean insert(SinhVien sv) throws Exception{
        String sql = "insert into [dbo].[SinhVien]([MaSinhVien],[HoTen],[Email],[SoDT],[GioiTinh],[DiaChi])"
                + " values (?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            pstmt.setString(1, sv.getMaSinhVien());
            pstmt.setString(2, sv.getHoTen());
            pstmt.setString(3, sv.getEmail());
            pstmt.setString(4, sv.getSoDT());
            pstmt.setInt(5, sv.getGioiTinh());
            pstmt.setString(6, sv.getDiaChi());
            
            return pstmt.executeUpdate()>0;
        }
    }
    
    public boolean update(SinhVien sv) throws Exception{
        String sql = "update dbo.[SinhVien]" + " set HoTen = ?, Email = ?, SoDT = ?, "
                + "GioiTinh = ?, DiaChi = ?" + " where MaSinhVien = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            pstmt.setString(1, sv.getHoTen());
            pstmt.setString(2, sv.getEmail());
            pstmt.setString(3, sv.getSoDT());
            pstmt.setInt(4, sv.getGioiTinh());
            pstmt.setString(5, sv.getDiaChi());
            pstmt.setString(6, sv.getMaSinhVien());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(String maSinhVien) throws Exception {
        String sql = "delete from sinhvien where MaSinhVien = ?";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
             ) {
            pstmt.setString(1, maSinhVien);
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public SinhVien findById(String maSinhVien) throws Exception{
        String sql = "select * from sinhvien where MaSinhVien = ?";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
             ){
            pstmt.setString(1, maSinhVien);
            try(ResultSet rs = pstmt.executeQuery();) {
                if(rs.next()) {
                    SinhVien sv = createSinhVien(rs);
                    return sv;
                }
            }
            return null;
        }
    }
    
    public List<SinhVien> findAll() throws Exception {
        String sql = "select * from sinhvien";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            try(ResultSet rs = pstmt.executeQuery();) {
                List<SinhVien> list = new ArrayList<>();
                while(rs.next()) {
                    SinhVien sv = createSinhVien(rs);
                    list.add(sv);
                }
                return list;
            }
        }
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(rs.getString("masinhvien"));
        sv.setHoTen(rs.getString("hoten"));
        sv.setEmail(rs.getString("email"));
        sv.setSoDT(rs.getString("sodt"));
        sv.setGioiTinh(rs.getInt("gioitinh"));
        sv.setDiaChi(rs.getString("diachi"));
        return sv;
    }
}
