/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duniaprojectuas_update3;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class DuniaProjectUAS_Update3 {

    /**
     * @param args the command line arguments
     */
    
            // PROJECT PROGRAM MENU MINI MARKET
    
    
        // deklarasi variabel
    
    static Scanner input = new Scanner (System.in);
    
    static String insertnamas, insertnamad, insertnamaa, insertkodea;
    static int choose, inputharga, inputjumlah, inputbayar, rumustodi, rumusdiskon, rumustotal, rumuskembali;
    static int inputedit, inserthargas, insertstoks, inserthargad, insertstokd, a, zsnack, ydrink, xadmin;
   
    static String nama_snack[] = new String[10]; 
    static int harga_snack[] = new int[10]; 
    static int stok_snack[] = new int[10];
    
    static String nama_drink[] = new String[10]; 
    static int harga_drink[] = new int[10];
    static int stok_drink[] = new int[10];
    
    static String nama_admin[] = new String[10]; 
    static String kode_admin[] = new String[10]; 
 
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
                do {
                    System.out.println("----------------------------------------------");
                    System.out.print("Tekan (a/s) kembali ke menu ");
                    reloop = input.next().charAt(0);
                } while (reloop != 'a' && reloop != 's');
        } while (reloop == 'a');
    }
    
    
        // data snack
    
    static void data_snack() {
            System.out.println("+============================================+");
            System.out.println("|                 DATA SNACK                 |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA BARANG        HARGA          STOK  |");
            System.out.println("==============================================");
            for (a = 1; a <= zsnack; a++) {
                System.out.print("[0"+a+"] "+nama_snack[a-1]+"\t\t► Rp"+harga_snack[a-1]+"\t"+stok_snack[a-1]+"\n");
            }
            System.out.println("==============================================");
            System.out.println("[06] Insert Data");
            System.out.println("[07] Update Data");
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
            System.out.print("Nama Snack\t: ");
            insertnamas = input.next();
            System.out.print("Harga Snack\t: ");
            inserthargas = input.nextInt();
            System.out.print("Stok Snack\t: ");
            insertstoks = input.nextInt();
            
            nama_snack[zsnack] = insertnamas;
            harga_snack[zsnack] = inserthargas;
            stok_snack[zsnack] = insertstoks;
            zsnack++;
    }
    
    static void update_snack() {
            System.out.print("Input Snack\t► ");
            inputedit = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Snack\t: "+nama_snack[inputedit-1]);
            System.out.println("Harga Snack\t: "+harga_snack[inputedit-1]);
            System.out.println("Stok Snack\t: "+stok_snack[inputedit-1]);
            System.out.println("----------------------------------------------");
            System.out.print("Update Harga\t: ");
            harga_snack[inputedit-1] = input.nextInt();
            System.out.print("Update Stok\t: ");
            stok_snack[inputedit-1] = input.nextInt();
    }
    
    static void delete_snack() {
            nama_snack = new String[10];
            harga_snack = new int[10];
            stok_snack = new int[10];
            System.out.println("Data snack telah dihapus!");
    }
    
    
        // data softdrink
    
    static void data_drink() {
            System.out.println("+============================================+");
            System.out.println("|               DATA SOFTDRINK               |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA BARANG        HARGA          STOK  |");
            System.out.println("==============================================");
            for (a = 1; a <= ydrink; a++) {
                System.out.print("[0"+a+"] "+nama_drink[a-1]+"\t\t► Rp"+harga_drink[a-1]+"\t"+stok_drink[a-1]+"\n");
            }
            System.out.println("==============================================");
            System.out.println("[06] Insert Data");
            System.out.println("[07] Update Data");
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
            System.out.print("Nama Softdrink\t: ");
            insertnamad = input.next();
            System.out.print("Harga Softdrink\t: ");
            inserthargad = input.nextInt();
            System.out.print("Stok Softdrink\t: ");
            insertstokd = input.nextInt();
            
            nama_drink[ydrink] = insertnamad;
            harga_drink[ydrink] = inserthargad;
            stok_drink[ydrink] = insertstokd;
            ydrink++;
    }
    
    static void update_drink() {
            System.out.print("Input Softdrink\t► ");
            inputedit = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Softdrink\t: "+nama_drink[inputedit-1]);
            System.out.println("Harga Softdrink\t: "+harga_drink[inputedit-1]);
            System.out.println("Stok Softdrink\t: "+stok_drink[inputedit-1]);
            System.out.println("----------------------------------------------");
            System.out.print("Update Harga\t: ");
            harga_drink[inputedit-1] = input.nextInt();
            System.out.print("Update Stok\t: ");
            stok_drink[inputedit-1] = input.nextInt();
    }
    
    static void delete_drink() {
            nama_drink = new String[10];
            harga_drink = new int[10];
            stok_drink = new int[10];
            System.out.println("Data softdrink telah dihapus!");
    }
    
    
        // data admin
    
    static void data_admin() {
            System.out.println("+============================================+");
            System.out.println("|                 DATA ADMIN                 |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA ADMIN             ID ADMIN         |");
            System.out.println("==============================================");
            for (a = 1; a <= xadmin; a++) {
                System.out.print("[0"+a+"] "+nama_admin[a-1]+"\t\t    "+kode_admin[a-1]+"\n");
            }
            System.out.println("==============================================");
            System.out.println("[06] Insert Admin");
            System.out.println("[07] Update Admin");
            System.out.println("[08] Delete Admin");
            System.out.println("[09] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 6:
                    insert_admin();
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
    
    static void insert_admin() {
            System.out.print("Nama Admin\t: ");
            insertnamaa = input.next();
            System.out.print("ID Admin\t: ");
            insertkodea = input.next();
            
            nama_admin[xadmin] = insertnamaa;
            kode_admin[xadmin] = insertkodea;
            xadmin++;
    }
    
    static void update_admin() {
            System.out.print("Input Admin\t► ");
            inputedit = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Admin\t: "+nama_admin[inputedit-1]);
            System.out.println("ID Admin\t: "+kode_admin[inputedit-1]);
            System.out.println("----------------------------------------------");
            System.out.print("Nama Admin\t: ");
            nama_admin[inputedit-1] = input.next();
            System.out.print("ID Admin\t: ");
            kode_admin[inputedit-1] = input.next();
    }
    
    static void delete_admin() {
            nama_admin = new String[10];
            kode_admin = new String[10];
            System.out.println("Data admin telah dihapus!");
    }
    
    static void menu_transaksi() {
    }
    
    public static void main(String[] args) {
        { 
            zsnack = 3;
            ydrink = 3;
            xadmin = 3;
        
            nama_snack[0] = "Hanzel";
            nama_snack[1] = "Pocky";
            nama_snack[2] = "Chitato";
            harga_snack[0] = 3000;
            harga_snack[1] = 5500;
            harga_snack[2] = 9000;
            stok_snack[0] = 30;
            stok_snack[1] = 20;
            stok_snack[2] = 10;
        
            nama_drink[0] = "Aqua";
            nama_drink[1] = "Teh Pucuk";
            nama_drink[2] = "Pocari";
            harga_drink[0] = 2500;
            harga_drink[1] = 3500;
            harga_drink[2] = 6000;
            stok_drink[0] = 40;
            stok_drink[1] = 30;
            stok_drink[2] = 20;
        
            nama_admin[0] = "DESY HANA";
            nama_admin[1] = "NANCY DONA";
            nama_admin[2] = "AHIN LIANA";
            kode_admin[0] = "217-359-001";
            kode_admin[1] = "217-359-002";
            kode_admin[2] = "217-359-003";
            
            System.out.println("               WELCOME TO MARKET");
            menu_utama();
        }
    }
}