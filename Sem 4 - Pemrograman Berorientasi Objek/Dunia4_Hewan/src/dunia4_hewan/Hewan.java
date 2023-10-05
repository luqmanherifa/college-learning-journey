/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia4_hewan;

/**
 *
 * @author Kyrin
 */
public abstract class Hewan implements HewanPeliharaan {
    private String jenis;
    private String makanan;
    private String habitat;
    private int usiaHidup;
    
    void makan(){
        System.out.println("Hewan ini sedang makan.");
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        if(makanan.equals("Nasi")||makanan.equals("Daging")||makanan.equals("Jagung")){
            this.makanan = makanan;
        } else {
            System.out.println("ERROR: Makanan tidak sehat lur!");
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getUsiaHidup() {
        return usiaHidup;
    }

    public void setUsiaHidup(int usiaHidup) {
        this.usiaHidup = usiaHidup;
    }
    
}