/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia4_kucing;

/**
 *
 * @author Kyrin
 */
public class Kucing {
        
    String namaKucing;
    String jenisKucing;
    String jenisBulu;
    private String warnaBulu;
    String warnaMata;
    String modelKuping;
    int beratKucing;
    int umurKucing;
    
    public Kucing() {
        namaKucing = "Thanos";
        warnaBulu = "Ungu";
        System.out.println("Kucing itu bernama "+namaKucing+" dan berwarna "+warnaBulu+".");
    }
    
    public Kucing(String jenis) {
        namaKucing = "Thonos";
        jenisKucing = jenis;
        System.out.println("Kucing "+namaKucing+" memiliki jenis "+jenis+".");
    }
    
    public void mainBersama(String namaPemilik) {
        System.out.println("Si "+namaKucing+" sedang bermain bersama "+namaPemilik);
    }    
    
    public void mainBersama(String namaPemilik, int usiaPemilik, boolean sudahMain) {
        System.out.println(namaKucing+" sedang bermain bersama "+namaPemilik+" ("+usiaPemilik+").");
        if(sudahMain==false) {
            System.out.println("Si kucing belum puas bermain loh.");
        }
    }
    
    public void beriMakan(String namaMakanan) {
        System.out.println(namaKucing+" sedang makan "+namaMakanan+".");
    }    
    
    public void beriMakan(String namaMakanan, int jumlahPorsi) {
        System.out.println(namaKucing+" sedang makan "+namaMakanan+" "+jumlahPorsi+" piring.");
    }    
    
    public void beriMakan(String namaMakanan, int jumlahPorsi, boolean sudahKenyang) {
        System.out.println(namaKucing+" sedang makan "+namaMakanan+" "+jumlahPorsi+" piring.");
        if(sudahKenyang==false) {
            System.out.println("Si kucing masih belum kenyang loh.");
        }
    }
    
    public void beriMinum(String namaMinuman) {
        System.out.println(namaKucing+" sedang minum "+namaMinuman+".");
    }    
    
    public void beriMinum(String namaMinuman, int literAir) {
        System.out.println(namaKucing+" sedang minum "+namaMinuman+" "+literAir+" liter.");
    }    
    
    public void beriMinum(String namaMinuman, int literAir, boolean sudahMinum) {
        System.out.println(namaKucing+" sedang minum "+namaMinuman+" "+literAir+" liter.");
        if(sudahMinum==false) {
            System.out.println("Si kucing masih haus loh.");
        }
    }
    
    public void elusKucing(String namaOrang) {
        System.out.println(namaKucing+" sedang dielus oleh "+namaOrang+".");
    }
    
    public void elusKucing(String namaOrang, int berapaLama) {
        System.out.println(namaKucing+" sedang dielus oleh "+namaOrang+" "+berapaLama+" menit.");
    }    
       
    public void menggendongKucing(String namaOrang) {
        System.out.println(namaKucing+" sedang digendong oleh "+namaOrang+".");
    }
    
    public void menggendongKucing(String namaOrang, int berapaLama) {
        System.out.println(namaKucing+" sedang digendong oleh "+namaOrang+" "+berapaLama+" menit.");
    }

    public void memandikanKucing(String namaOrang, int berapaKali) {
        System.out.println(namaKucing+" dimandikan oleh "+namaOrang+" "+berapaKali+" kali sehari.");
    }
    
    public void memandikanKucing(String namaOrang, boolean sudahMandi) {
        System.out.println(namaKucing+" sedang dimandikan oleh "+namaOrang+".");
        if(sudahMandi==false) {
            System.out.println("Si "+namaKucing+" belum mandi loh.");
        }
    }

    public void menguburKucing(String namaOrang) {
        System.out.println("Si "+namaKucing+" dikubur oleh "+namaOrang+" karena ditemukan mati kemarin.");
    }
    
    public void menguburKucing(String yangDimakan, int berapaHari) {
        System.out.println("Si "+namaKucing+" harus dikubur, karena mati setelah makan "+yangDimakan+" "+berapaHari+" hari yang lalu.");
    }
    
    public void temanKucing(Kucing temanTeman) {
        System.out.println(namaKucing+" lagi deket sama "+temanTeman.namaKucing+" si Kucing "+temanTeman.jenisKucing+".");
    }

    public void isiWarnaBulu(String hanyaWarna) {
        if(hanyaWarna=="Pink" || hanyaWarna=="Putih") {
            warnaBulu = hanyaWarna;
        } else {
            System.out.println("WARNA SALAH!");
        }
    }
    
    public String ambilWarna() {
        return warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
   
}