/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duniaprojectuas_update2;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class DuniaProjectUAS_Update2 {

    /**
     * @param args the command line arguments
     */
    
                // PROJECT PROGRAM MENU MINI MARKET
    
        // deklarasi variabel
    
    static Scanner input = new Scanner (System.in);
    static Scanner huruf = new Scanner (System.in);
    
    static int choose, inputharga, inputjumlah, inputbayar, rumustodi, rumusdiskon, rumustotal, rumuskembali;
    
    static String[] nama_snack = {"Hanzel", "Pocky Pocky", "Chitato"};
    static int[] harga_snack = {3000, 5500, 9000};
    static int[] stok_snack = new int[3];
    
    static String[] nama_drink = {"Aqua", "Teh Pucuk", "Pocari Sweat"};
    static int[] harga_drink = {2500, 3500, 6000};
    static int[] stok_drink = new int[3];
    
    static String[] nama_admin = {"DESY HANA", "NANCY DONA", "AHIN LIANA"};
    static String[] kode_admin = {"217-359-001", "217-359-002", "217-359-003"};
    static String[] kota_admin = {"MAGELANG", "CIREBON", "LAMPUNG"};
    static String[] tgl_admin = {"17/12/1995", "19/04/2000", "09/02/1996"};
    static String[] jk_admin = {"LAKI-LAKI", "PEREMPUAN"};
    static String[] alamat_admin = {"JL. DAUN KESUMBA\n\t\t  TUREN MALANG", "JL. SOEKARNO HATTA\n\t\t  LOWOKWARU MALANG", "JL. MELATI BARAT\n\t\t  SINGOSARI MALANG"};
 
    static char reloop = ' ';
    
        // menu utama
    
    static void menu_utama() {
        do {
            System.out.println("----------------------------------------------");
            System.out.println("+============================================+");
            System.out.println("|              MENU MINI MARKET              |");
            System.out.println("+============================================+");
            System.out.println("[01] Data Snack");
            System.out.println("[02] Data Softdrink");
            System.out.println("[03] Data Admin");
            System.out.println("[04] Transaksi");
            System.out.println("[05] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 1:
                    data_snack();
                    break;
                case 2:
                    data_drink();
                    break;
                case 3:
                    data_admin();
                    break;
                case 4:
                    menu_transaksi();
                    break;
                case 5:
                    System.out.println("Anda telah keluar dari program.\nTerima kasih.\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf! Menu tidak tersedia.");
                    break;
            }
            
            System.out.println("----------------------------------------------");
            System.out.print("Tekan (a) kembali ke menu ");
            reloop = input.next().charAt(0);
        
        } while (reloop == 'a' || reloop == 'A');
    }
    
    
        // data snack
    
    static void data_snack() {
            System.out.println("+============================================+");
            System.out.println("|                 DATA SNACK                 |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA BARANG        HARGA          STOK  |");
            System.out.println("==============================================");
            System.out.println("[01] "+nama_snack[0]+"\t\t► Rp"+harga_snack[0]+"\t"+stok_snack[0]);
            System.out.println("[02] "+nama_snack[1]+"\t► Rp"+harga_snack[1]+"\t"+stok_snack[1]);
            System.out.println("[03] "+nama_snack[2]+"\t\t► Rp"+harga_snack[2]+"\t"+stok_snack[2]);
            System.out.println("==============================================");
            System.out.println("[06] Insert Stok");
            System.out.println("[07] Update Harga");
            System.out.println("[08] Delete Data");
            System.out.println("[09] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 6:
                    insert_snack();
                    break;
                case 7:
                    update_snack();
                    break;
                case 8:
                    delete_snack();
                    break;
                case 9:
                    System.out.println("Anda telah keluar dari menu.");
                    break;
                default:
                    System.out.println("Maaf! Menu tidak tersedia.");
                    break;
            }
    }
    
    static void insert_snack() {
            System.out.println("Nama Snack\t: "+nama_snack[0]);
            System.out.print("Input Stok\t: ");
            stok_snack[0] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Snack\t: "+nama_snack[1]);
            System.out.print("Input Stok\t: ");
            stok_snack[1] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Snack\t: "+nama_snack[2]);
            System.out.print("Input Stok\t: ");
            stok_snack[2] = input.nextInt();
    }
    
    static void update_snack() {
            System.out.println("Nama Snack\t: "+nama_snack[0]);
            System.out.println("Harga Snack\t: "+harga_snack[0]);
            System.out.print("Update Harga\t: ");
            harga_snack[0] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Snack\t: "+nama_snack[1]);
            System.out.println("Harga Snack\t: "+harga_snack[1]);
            System.out.print("Update Harga\t: ");
            harga_snack[1] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Snack\t: "+nama_snack[2]);
            System.out.println("Harga Snack\t: "+harga_snack[2]);
            System.out.print("Update Harga\t: ");
            harga_snack[2] = input.nextInt();
    }
    
    static void delete_snack() {
            nama_snack = new String[3];
            harga_snack = new int[3];
            stok_snack = new int[3];
            System.out.println("Data snack telah dihapus!");
    }
    
    
        // data snack
    
    static void data_drink() {
            System.out.println("+============================================+");
            System.out.println("|               DATA SOFTDRINK               |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA BARANG        HARGA          STOK  |");
            System.out.println("==============================================");
            System.out.println("[01] "+nama_drink[0]+"\t\t► Rp"+harga_drink[0]+"\t"+stok_drink[0]);
            System.out.println("[02] "+nama_drink[1]+"\t\t► Rp"+harga_drink[1]+"\t"+stok_drink[1]);
            System.out.println("[03] "+nama_drink[2]+"\t► Rp"+harga_drink[2]+"\t"+stok_drink[2]);
            System.out.println("==============================================");
            System.out.println("[06] Insert Stok");
            System.out.println("[07] Update Harga");
            System.out.println("[08] Delete Data");
            System.out.println("[09] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 6:
                    insert_drink();
                    break;
                case 7:
                    update_drink();
                    break;
                case 8:
                    delete_drink();
                    break;
                case 9:
                    System.out.println("Anda telah keluar dari menu.");
                    break;
                default:
                    System.out.println("Maaf! Menu tidak tersedia.");
                    break;
            }
    }
    
    static void insert_drink() {
            System.out.println("Nama Softdrink\t: "+nama_drink[0]);
            System.out.print("Input Stok\t: ");
            stok_snack[0] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Softdrink\t: "+nama_drink[1]);
            System.out.print("Input Stok\t: ");
            stok_snack[1] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Softdrink\t: "+nama_drink[2]);
            System.out.print("Input Stok\t: ");
            stok_snack[2] = input.nextInt();
    }
    
    static void update_drink() {
            System.out.println("Nama Softdrink\t: "+nama_drink[0]);
            System.out.println("Harga Snack\t: "+harga_drink[0]);
            System.out.print("Update Harga\t: ");
            harga_drink[0] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Softdrink\t: "+nama_drink[1]);
            System.out.println("Harga Softdrink\t: "+harga_drink[1]);
            System.out.print("Update Harga\t: ");
            harga_drink[1] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Softdrink\t: "+nama_drink[2]);
            System.out.println("Harga Softdrink\t: "+harga_drink[2]);
            System.out.print("Update Harga\t: ");
            harga_drink[2] = input.nextInt();
    }
    
    static void delete_drink() {
            nama_drink = new String[3];
            harga_drink = new int[3];
            stok_drink = new int[3];
            System.out.println("Data softdrink telah dihapus!");
    }
    
    
        // data operator
    
    static void data_admin() {
            System.out.println("+============================================+");
            System.out.println("|                 DATA ADMIN                 |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA ADMIN             ID ADMIN         |");
            System.out.println("==============================================");
            System.out.println("[01] "+nama_admin[0]+"\t\t    "+kode_admin[0]);
            System.out.println("[02] "+nama_admin[1]+"\t\t    "+kode_admin[1]);
            System.out.println("[03] "+nama_admin[2]+"\t\t    "+kode_admin[2]);
            System.out.println("==============================================");
            System.out.println("[07] Update Data");
            System.out.println("[08] Delete Data");
            System.out.println("[09] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 001:
                    System.out.println("==============================================");
                    System.out.println("NAMA ADMIN\t: "+nama_admin[0]);
                    System.out.println("ID ADMIN\t: "+kode_admin[0]);
                    System.out.println("KOTA, TGL LAHIR\t: "+kota_admin[0]+", "+tgl_admin[0]);
                    System.out.println("JENIS KELAMIN\t: "+jk_admin[1]);
                    System.out.println("ALAMAT\t\t: "+alamat_admin[0]);
                    System.out.println("==============================================");
                    break;
                case 002:
                    System.out.println("==============================================");
                    System.out.println("NAMA ADMIN\t: "+nama_admin[1]);
                    System.out.println("ID ADMIN\t: "+kode_admin[1]);
                    System.out.println("KOTA, TGL LAHIR\t: "+kota_admin[1]+", "+tgl_admin[1]);
                    System.out.println("JENIS KELAMIN\t: "+jk_admin[1]);
                    System.out.println("ALAMAT\t\t: "+alamat_admin[1]);
                    System.out.println("==============================================");
                    break;
                case 003:
                    System.out.println("==============================================");
                    System.out.println("NAMA ADMIN\t: "+nama_admin[2]);
                    System.out.println("ID ADMIN\t: "+kode_admin[2]);
                    System.out.println("KOTA, TGL LAHIR\t: "+kota_admin[2]+", "+tgl_admin[2]);
                    System.out.println("JENIS KELAMIN\t: "+jk_admin[1]);
                    System.out.println("ALAMAT\t\t: "+alamat_admin[2]);
                    System.out.println("==============================================");
                    break;
                case 7:
                    update_admin();
                    break;
                case 8:
                    delete_admin();
                    break;
                case 9:
                    System.out.println("Anda telah keluar dari menu.");
                    break;
                default:
                    System.out.println("Maaf! Menu tidak tersedia.");
                    break;
            }
    }
    
    static void update_admin() {
            System.out.println("Nama Softdrink\t: "+nama_drink[0]);
            System.out.println("Harga Snack\t: "+harga_drink[0]);
            System.out.print("Update Harga\t: ");
            harga_drink[0] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Softdrink\t: "+nama_drink[1]);
            System.out.println("Harga Softdrink\t: "+harga_drink[1]);
            System.out.print("Update Harga\t: ");
            harga_drink[1] = input.nextInt();
            System.out.println("----------------------------------------------");
            
            System.out.println("Nama Softdrink\t: "+nama_drink[2]);
            System.out.println("Harga Softdrink\t: "+harga_drink[2]);
            System.out.print("Update Harga\t: ");
            harga_drink[2] = input.nextInt();
    }
    
    static void delete_admin() {
            nama_admin = new String[3];
            kode_admin = new String[3];
            kota_admin = new String[3];
            tgl_admin = new String[3];
            jk_admin = new String[2];
            alamat_admin = new String[3];
            System.out.println("Data admin telah dihapus!");
    }
    
    static void menu_transaksi() {
    }

    public static void main(String[] args) {
            System.out.println("               WELCOME TO MARKET");
            menu_utama();
    }
}