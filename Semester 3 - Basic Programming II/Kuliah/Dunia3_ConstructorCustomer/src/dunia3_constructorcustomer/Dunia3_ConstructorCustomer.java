/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_constructorcustomer;

/**
 *
 * @author Kyrin
 */
    public class Dunia3_ConstructorCustomer {
        String nama;
        String alamat;
        String tanggallahir;
        String pekerjaan;
        double gaji;
    
    Dunia3_ConstructorCustomer(String n, String a, String t, String p, double g) {
        nama = n;
        alamat = a;
        tanggallahir = t;
        pekerjaan = p;
        gaji = g;
    }
    
    void infocustomer() {
        System.out.println(
                "Nama\t\t: "+nama+"\n"+
                "Alamat\t\t: "+alamat+"\n"+
                "Tanggal Lahir\t: "+tanggallahir+"\n"+
                "Pekerjaan\t: "+pekerjaan+"\n"+
                "Gaji\t\t: "+gaji+"\n");
    }
    
    public static void main(String[] args) {
        
        Dunia3_ConstructorCustomer customer = new Dunia3_ConstructorCustomer("Chelsea Olivia", "Jl. Soekarno Hatta", "16 Agustus 2000", "Administrasi Perkantoran", 3000000);
        customer.infocustomer();
     
    }
}