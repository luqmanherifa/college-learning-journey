/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_rotiku;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Rotiku {

    String warna;
    String rasa;
    int berat;
    double harga;
    
    void beriwarna(String warnaroti) {
        warna = warnaroti;
    }
    void berirasa(String rasaroti) {
        rasa = rasaroti;
    }
    void timbangberat(int beratroti) {
        berat = beratroti;
    }
    void hargajual(double hargaroti) {
        harga = hargaroti;
    }
    void inforoti(){
        System.out.println("Warna Roti: "+warna+"\n"+"Rasa Roti : "
                +rasa+"\n"+"Berat Roti : "+berat+"gr"+"\n"
                +"Harga Roti : Rp."+harga);
    }
    
    public static void main(String[] args) {
        Dunia3_Rotiku roti = new Dunia3_Rotiku();
        roti.beriwarna("Cokelat");
        roti.berirasa("Pisang Coklat");
        roti.timbangberat(50);
        roti.hargajual(5000);
        roti.inforoti();
    
    }
}