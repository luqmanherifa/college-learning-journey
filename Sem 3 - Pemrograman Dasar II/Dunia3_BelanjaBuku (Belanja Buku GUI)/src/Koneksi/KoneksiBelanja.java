package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiBelanja {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil konek!");
        }catch(ClassNotFoundException ex){
            System.out.println("Gagal konek!"+ex);
        }
        String url = "jdbc:mysql://localhost/Belanja";
        try{
            koneksi = (Connection)DriverManager.getConnection(url,"root","");
        }catch(SQLException ex){
            System.out.println("Gagal konek db "+ex);
        }
        return koneksi;
    }
}