/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lukman;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Koneksi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/Kampus";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static void main(String[] args) {
        //koneksi db harus dalam blok try catch
        try{
            //register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            //buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            //buat objek statement
            stat = conn.createStatement();
            
            //buat query ke database
            String sql = "SELECT * FROM dosen";
            
            //eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stat.executeQuery(sql);
            
            //tampilkan hasil query
            while(rs.next()){
                System.out.println("NIP\t: "+rs.getInt("NIP"));
                System.out.println("Nama\t: "+rs.getString("Nama"));
                System.out.println("Alamat\t: "+rs.getString("Alamat"));
                System.out.println("Email\t: "+rs.getString("Email"));
            }
           
            //mencoba insert
            String insertdosen = "INSERT INTO dosen (NIP, Nama, Alamat, Email) VALUES (?, ?, ?, ?)";
            
            PreparedStatement insert = conn.prepareStatement(insertdosen);
            
            insert.setInt(1, 006);
            insert.setString(2, "Aka");
            insert.setString(3, "Jakarta");
            insert.setString(4, "aka@gmail.com");
            
            int rowInserted = insert.executeUpdate();
            if (rowInserted > 0){
                System.out.println("Data dosen baru telah di insert!");
            }
            
            //mencoba delete
            String deletedosen = "DELETE FROM dosen WHERE NIP = ?";
            
            PreparedStatement delete = conn.prepareStatement(deletedosen);
            delete.setInt(1, 001);
            
            int rowsDeleted = delete.executeUpdate();
            if (rowsDeleted > 0){
                System.out.println("Sebuah data dosen telah di delete!");
            }
            
            //mencoba update
            
            
            stat.close();
            conn.close();
            
        } catch(Exception a){
            a.printStackTrace();
        }
    }
}
