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
public class MenuKucing extends MenuBinatang {
    private String namaKucing;
    private String tahunLahir;
    
    public void rawat(String namaPerawat){
        System.out.println("Binatang itu sedang dirawat oleh "+namaPerawat);
    }

    public String getNamaKucing() {
        return namaKucing;
    }

    public void setNamaKucing(String namaKucing) {
        this.namaKucing = namaKucing;
    }

    public String getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(String tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    
}
