/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokohewan;

/**
 *
 * @author Kyrin
 */
public class MenuIkan extends MenuBinatang {
    private String jenisAir;
    private String jumlahTelur;
    
    public void gantiAir(String pemilikAkuarium){
        System.out.println("Akuarium diganti airnya oleh "+pemilikAkuarium);
    }
    
    public void aturSuhuAir(String suhuAir){
        System.out.println("Suhu air akuarium itu di atur ke "+suhuAir);
    }

    public String getJenisAir() {
        return jenisAir;
    }

    public void setJenisAir(String jenisAir) {
        this.jenisAir = jenisAir;
    }

    public String getJumlahTelur() {
        return jumlahTelur;
    }

    public void setJumlahTelur(String jumlahTelur) {
        this.jumlahTelur = jumlahTelur;
    }

}