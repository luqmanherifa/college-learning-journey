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
public class MenuBinatang {
    private String jenisKelamin;
    private String spesiesBinatang;
    private String makananBinatang;
    private String warnaBinatang;
    
    public void makan(String namaMakanan){
        System.out.println("Binatang itu sedang makan "+namaMakanan);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getSpesiesBinatang() {
        return spesiesBinatang;
    }

    public void setSpesiesBinatang(String spesiesBinatang) {
        this.spesiesBinatang = spesiesBinatang;
    }

    public String getMakananBinatang() {
        return makananBinatang;
    }

    public void setMakananBinatang(String makananBinatang) {
        this.makananBinatang = makananBinatang;
    }

    public String getWarnaBinatang() {
        return warnaBinatang;
    }

    public void setWarnaBinatang(String warnaBinatang) {
        this.warnaBinatang = warnaBinatang;
    }
    
}
