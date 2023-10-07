/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

/**
 *
 * @author Kyrin
 */
public abstract class ClassAlatAudio {
    String merkAlat;
    String tipeAlat;
    String warnaAlat;
    int hargaAlat;
    int stokAlat;

    /*public ClassAlatAudio(String merkA, String tipeA, String warnaA, int hargaA, int stokA) {
        this.merkAlat = merkA;
        this.tipeAlat = tipeA;
        this.warnaAlat = warnaA;
        this.hargaAlat = hargaA;
        this.stokAlat = stokA;
    }*/

    public String getMerkAlat() {
        return merkAlat;
    }

    public void setMerkAlat(String merkAlat) {
        this.merkAlat = merkAlat;
    }

    public String getTipeAlat() {
        return tipeAlat;
    }

    public void setTipeAlat(String tipeAlat) {
        this.tipeAlat = tipeAlat;
    }

    public String getWarnaAlat() {
        return warnaAlat;
    }

    public void setWarnaAlat(String warnaAlat) {
        this.warnaAlat = warnaAlat;
    }

    public int getHargaAlat() {
        return hargaAlat;
    }

    public void setHargaAlat(int hargaAlat) {
        this.hargaAlat = hargaAlat;
    }

    public int getStokAlat() {
        return stokAlat;
    }

    public void setStokAlat(int stokAlat) {
        this.stokAlat = stokAlat;
    }

}