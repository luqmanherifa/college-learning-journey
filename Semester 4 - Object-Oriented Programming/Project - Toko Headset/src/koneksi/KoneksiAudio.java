/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kyrin
 */
public class KoneksiAudio {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Connect!");
        }catch(ClassNotFoundException ex){
            System.out.println("Gagal Connect! "+ex);
        }
        String url = "jdbc:mysql://localhost/pbo_audio";
        try{
            koneksi = (Connection)DriverManager.getConnection(url,"root","");
        }catch(SQLException ex){
            System.out.println("Gagal Connect Database "+ex);
        }
        return koneksi;
    }
}