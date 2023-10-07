/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia4_bukukontakgui;

/**
 *
 * @author Kyrin
 */
public class BukuKontak {
    String namaOrang;
    String alamatRumah;
    String noHandphone;
    String emailOrang;
    
    public BukuKontak() {
        System.out.println("Mungkin berhasil.");
    }
    
    public BukuKontak(String dataNama, String dataAlamat, String dataNo, String dataEmail) {
        this.namaOrang = dataNama;
        this.alamatRumah = dataAlamat;
        this.noHandphone = dataNo;
        this.emailOrang = dataEmail;    
    }

    public String getNamaOrang() {
        return namaOrang;
    }

    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }

    public String getAlamatRumah() {
        return alamatRumah;
    }

    public void setAlamatRumah(String alamatRumah) {
        this.alamatRumah = alamatRumah;
    }

    public String getNoHandphone() {
        return noHandphone;
    }

    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    public String getEmailOrang() {
        return emailOrang;
    }

    public void setEmailOrang(String emailOrang) {
        this.emailOrang = emailOrang;
    }


   
    
}
