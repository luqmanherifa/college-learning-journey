/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_constructorbuku;

/**
 *
 * @author Kyrin
 */
public class Dunia3_ConstructorBuku {
    String pengarang;
    String judul;
    int tahun;
    int cetakan;
    double harga;
    
    void berinama(String namapengarang) {
        pengarang = namapengarang;
    }
    void berijudul(String judulbuku) {
        judul = judulbuku;
    }
    void beritahun(int tahunterbit) {
        tahun = tahunterbit;
    }
    void bericetakan(int cetakanke) {
        cetakan = cetakanke;
    }
    void beriharga(int hargajual) {
        harga = hargajual;
    }
    
    void infobuku() {
        System.out.println(
                "Nama Pengarang\t: "+pengarang+"\n"+
                "Judul Buku\t: "+judul+"\n"+
                "Tahun Terbit\t: "+tahun+"\n"+
                "Cetakan ke\t: "+cetakan+"\n"+
                "Harga Jual\t: "+harga+"\n");
    }
    
    public static void main(String[] args) {
        Dunia3_ConstructorBuku buku = new Dunia3_ConstructorBuku();
        
        buku.berinama("Tere Liye");
        buku.berijudul("Bumi");
        buku.beritahun(2016);
        buku.bericetakan(1);
        buku.beriharga(75000);
        buku.infobuku();
        
        buku.berinama("Penulis 2");
        buku.berijudul("Kamu");
        buku.beritahun(2017);
        buku.bericetakan(2);
        buku.beriharga(50000);
        buku.infobuku();
        
        buku.berinama("Penulis 3");
        buku.berijudul("Dia");
        buku.beritahun(2012);
        buku.bericetakan(3);
        buku.beriharga(30000);
        buku.infobuku();
        
        buku.berinama("Penulis 4");
        buku.berijudul("You");
        buku.beritahun(2015);
        buku.bericetakan(4);
        buku.beriharga(65000);
        buku.infobuku();
        
        buku.berinama("Penulis 5");
        buku.berijudul("Mereka");
        buku.beritahun(2015);
        buku.bericetakan(5);
        buku.beriharga(99000);
        buku.infobuku();
        
        buku.berinama("Penulis 6");
        buku.berijudul("Siapa");
        buku.beritahun(2010);
        buku.bericetakan(6);
        buku.beriharga(35000);
        buku.infobuku();
        
        buku.berinama("Penulis 7");
        buku.berijudul("Aku, Kamu, Dia dan Mereka");
        buku.beritahun(2018);
        buku.bericetakan(7);
        buku.beriharga(150000);
        buku.infobuku();
        
        buku.berinama("Penulis 8");
        buku.berijudul("Dunia");
        buku.beritahun(2018);
        buku.bericetakan(8);
        buku.beriharga(120000);
        buku.infobuku();
        
        buku.berinama("Penulis 9");
        buku.berijudul("Hitam");
        buku.beritahun(2017);
        buku.bericetakan(9);
        buku.beriharga(50000);
        buku.infobuku();
    
        buku.berinama("Penulis 10");
        buku.berijudul("Kucing");
        buku.beritahun(2016);
        buku.bericetakan(10);
        buku.beriharga(45000);
        buku.infobuku();
    }
}
