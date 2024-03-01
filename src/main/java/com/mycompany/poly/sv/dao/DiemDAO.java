/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poly.sv.dao;

import com.mycompany.poly.sv.helpers.DatabaseHelper;
import com.mycompany.poly.sv.model.BangDiem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utech
 */
public class DiemDAO {
    public boolean insert(BangDiem diem) throws Exception{
        String sql = "insert into [dbo].[KQMonHoc]([MaLop],[MSSV],[TiengAnh],[XSTK],[GDTC])"
                + " values (?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            pstmt.setString(1, diem.getMaLop());
            pstmt.setString(2, diem.getMSSV());
            pstmt.setFloat(3, diem.getTiengAnh());
            pstmt.setFloat(4, diem.getXSTK());
            pstmt.setFloat(5, diem.getGDTC());
            
            return pstmt.executeUpdate()>0;
        }
    }
    
    public boolean update(BangDiem diem) throws Exception{
        String sql = "update dbo.[KQMonHoc]" + "set [TiengAnh] = ?, [XSTK] = ?, [GDTC] = ? " + " where MSSV = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            pstmt.setFloat(1, diem.getTiengAnh());
            pstmt.setFloat(2, diem.getXSTK());
            pstmt.setFloat(3, diem.getGDTC());
            pstmt.setString(4, diem.getMSSV());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean deleteByMSV(String MSV) throws Exception {
        String sql = " delete from KQMonHoc where [MSSV] = ?";
        
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            pstmt.setString(1, MSV);
            
            return pstmt.executeUpdate()> 0;
        }
    }
    
    public BangDiem findByMSV(String MSV) throws Exception {
        String sql = "select * from KQMonHoc where [MSSV] = ?";
        
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            pstmt.setString(1, MSV);
            
            try(ResultSet rs = pstmt.executeQuery();) {
                if(rs.next()) {
                    BangDiem bd = createGPA(rs);
                    
                    return bd;
                }
            }
            return null;
        }
    }
    
    public List<BangDiem> findAll() throws Exception {
        String sql = "select * from KQMonHoc";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            try(ResultSet rs = pstmt.executeQuery();) {
                List<BangDiem> list = new ArrayList<>();
                while(rs.next()) {
                    BangDiem bd = createGPA(rs);
                    
                    list.add(bd);
                }
                return list;
            }
        }
    }

    private BangDiem createGPA(final ResultSet rs) throws SQLException {
        BangDiem bd = new BangDiem();
        bd.setMaLop(rs.getString("MaLop"));
        bd.setMSSV(rs.getString("MSSV"));
        bd.setTiengAnh(rs.getFloat("TiengAnh"));
        bd.setXSTK(rs.getFloat("XSTK"));
        bd.setGDTC(rs.getFloat("GDTC"));
        return bd;
    }
}
