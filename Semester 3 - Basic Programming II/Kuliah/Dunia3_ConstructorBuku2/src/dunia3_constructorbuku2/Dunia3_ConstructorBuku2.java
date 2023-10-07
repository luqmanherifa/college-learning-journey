/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_constructorbuku2;

public class Dunia3_ConstructorBuku2 {
    String pengarang;
    String judul;
    int tahun;
    int cetakan;
    double harga;
    
    Dunia3_ConstructorBuku2(String p, String j, int t, int c, double h) {
        pengarang = p;
        judul = j;
        tahun = t;
        cetakan = c;
        harga = h;
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
        
        Dunia3_ConstructorBuku2 buku1 = new Dunia3_ConstructorBuku2("Penulis 1", "Buku 1", 2011, 1, 10000);
        buku1.infobuku();
        
        Dunia3_ConstructorBuku2 buku2 = new Dunia3_ConstructorBuku2("Penulis 2", "Buku 2", 2011, 1, 10000);
        buku2.infobuku();
        
        Dunia3_ConstructorBuku2 buku3 = new Dunia3_ConstructorBuku2("Penulis 3", "Buku 3", 2011, 1, 10000);
        buku3.infobuku();
        
        Dunia3_ConstructorBuku2 buku4 = new Dunia3_ConstructorBuku2("Penulis 4", "Buku 4", 2011, 1, 10000);
        buku4.infobuku();
        
        Dunia3_ConstructorBuku2 buku5 = new Dunia3_ConstructorBuku2("Penulis 5", "Buku 5", 2011, 1, 10000);
        buku5.infobuku();
        
        Dunia3_ConstructorBuku2 buku6 = new Dunia3_ConstructorBuku2("Penulis 6", "Buku 6", 2011, 1, 10000);
        buku6.infobuku();
        
        Dunia3_ConstructorBuku2 buku7 = new Dunia3_ConstructorBuku2("Penulis 7", "Buku 7", 2011, 1, 10000);
        buku7.infobuku();
        
        Dunia3_ConstructorBuku2 buku8 = new Dunia3_ConstructorBuku2("Penulis 8", "Buku 8", 2011, 1, 10000);
        buku8.infobuku();
        
        Dunia3_ConstructorBuku2 buku9 = new Dunia3_ConstructorBuku2("Penulis 9", "Buku 9", 2011, 1, 10000);
        buku9.infobuku();
        
        Dunia3_ConstructorBuku2 buku10 = new Dunia3_ConstructorBuku2("Penulis 10", "Buku 10", 2011, 1, 10000);
        buku10.infobuku();
        
    }
}