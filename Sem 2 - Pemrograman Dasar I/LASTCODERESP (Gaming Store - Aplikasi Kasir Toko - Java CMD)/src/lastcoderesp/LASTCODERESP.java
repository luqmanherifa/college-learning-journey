/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastcoderesp;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class LASTCODERESP {

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner (System.in);
    static Scanner huruf = new Scanner (System.in);
    static int pilihan, inputharga, inputjumlah, totaldiskon, diskon, total, inputbayar, kembalian;
    static String inputkeyb, inputmouse;
    static String[] jenis_keyboard = {"Razer BlackWidow Chroma", "Steelseries Apex RGB", "Corsair K70 LUX RGB", "Rexus Battlefire K9 RGB", "Digital Alliance K1 Meca"};
    static String[] jenis_mouse = {"Razer Basilisk", "Steelseries Rival 700", "Corsair Glaive RGB", "Rexus RXM-X7", "Digital Alliance G Premium"};
    static int[] harga_keyboard = {1800000, 1750000, 2050000, 250000, 550000};
    static int[] harga_mouse = {1100000, 1200000, 1100000, 180000, 440000};
    static char reloop = ' ';
    
    static void menumenu() {
        do {
            System.out.println("+=========================================+");
            System.out.println("|          MENU KEYBOARD & MOUSE          |");
            System.out.println("+=========================================+");
            System.out.println("[1] Keyboard");
            System.out.println("[2] Mouse");
            System.out.println("[3] Transaksi");
            System.out.println("[4] Exit");
            System.out.println("+=========================================+");

            System.out.print("Input Menu\t: ");
            pilihan = input.nextInt();
            System.out.println("+=========================================+");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
            
            switch (pilihan) {
                case 1:
                    datakeyboard();
                    break;
                case 2:
                    datamouse();
                    break;
                case 3:
                    transaksi();
                    break;
                case 4:
                    System.out.println("+=========================================+");
                    System.out.println("           [Keluar dari program]           ");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan menu salah.");
                    }
            
                System.out.print("Tekan (m) untuk kembali ke Menu\t: ");
                reloop = input.next().charAt(0);
                System.out.print("- - - - - - - - - - - - - - - - - - - - - -\n\n\n");
                } 
            
            while (reloop == 'm');
            }
    
    static void datakeyboard() {
            System.out.println("+=========================================+");
            System.out.println("[01] "+jenis_keyboard[0]+"\t: Rp"+harga_keyboard[0]);
            System.out.println("[02] "+jenis_keyboard[1]+"\t: Rp"+harga_keyboard[1]);
            System.out.println("[03] "+jenis_keyboard[2]+"\t: Rp"+harga_keyboard[2]);
            System.out.println("[04] "+jenis_keyboard[3]+"\t: Rp"+harga_keyboard[3]);
            System.out.println("[05] "+jenis_keyboard[4]+"\t: Rp"+harga_keyboard[4]);
            System.out.println("+=========================================+");            
            }
    
    static void datamouse() {
            System.out.println("+=========================================+");
            System.out.println("[01] "+jenis_mouse[0]+"\t\t: Rp"+harga_mouse[0]);
            System.out.println("[02] "+jenis_mouse[1]+"\t: Rp"+harga_mouse[1]);
            System.out.println("[03] "+jenis_mouse[2]+"\t\t: Rp"+harga_mouse[2]);
            System.out.println("[04] "+jenis_mouse[3]+"\t\t: Rp"+harga_mouse[3]);
            System.out.println("[05] "+jenis_mouse[4]+"\t: Rp"+harga_mouse[4]);
            System.out.println("+=========================================+");
            }
    
    static void transaksi() {
            System.out.println("+=========================================+");
            System.out.println("     01 - 05 untuk Keyboard");
            System.out.println("     06 - 10 untuk Mouse");
            System.out.println("+=========================================+");
            System.out.println("[01] "+jenis_keyboard[0]+"\t: Rp"+harga_keyboard[0]);
            System.out.println("[02] "+jenis_keyboard[1]+"\t: Rp"+harga_keyboard[1]);
            System.out.println("[03] "+jenis_keyboard[2]+"\t: Rp"+harga_keyboard[2]);
            System.out.println("[04] "+jenis_keyboard[3]+"\t: Rp"+harga_keyboard[3]);
            System.out.println("[05] "+jenis_keyboard[4]+"\t: Rp"+harga_keyboard[4]);
            System.out.println("[06] "+jenis_mouse[0]+"\t\t: Rp"+harga_mouse[0]);
            System.out.println("[07] "+jenis_mouse[1]+"\t: Rp"+harga_mouse[1]);
            System.out.println("[08] "+jenis_mouse[2]+"\t\t: Rp"+harga_mouse[2]);
            System.out.println("[09] "+jenis_mouse[3]+"\t\t: Rp"+harga_mouse[3]);
            System.out.println("[10] "+jenis_mouse[4]+"\t: Rp"+harga_mouse[4]);
            System.out.println("[99] Kembali ke Menu");
            System.out.println("+=========================================+");  

            System.out.print("Kode Barang\t: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Keyboard\t: "+jenis_keyboard[0]);
                    System.out.println("Harga\t\t: "+harga_keyboard[0]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_keyboard[0]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_keyboard[0]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_keyboard[0]);
                    System.out.println("Harga\t\t: Rp"+harga_keyboard[0]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 2:
                    System.out.println("Keyboard\t: "+jenis_keyboard[1]);
                    System.out.println("Harga\t\t: "+harga_keyboard[1]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_keyboard[1]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_keyboard[1]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_keyboard[1]);
                    System.out.println("Harga\t\t: Rp"+harga_keyboard[1]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 3:
                    System.out.println("Keyboard\t: "+jenis_keyboard[2]);
                    System.out.println("Harga\t\t: "+harga_keyboard[2]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_keyboard[2]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_keyboard[2]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_keyboard[2]);
                    System.out.println("Harga\t\t: Rp"+harga_keyboard[2]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 4:
                    System.out.println("Keyboard\t: "+jenis_keyboard[3]);
                    System.out.println("Harga\t\t: "+harga_keyboard[3]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_keyboard[3]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_keyboard[3]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_keyboard[3]);
                    System.out.println("Harga\t\t: Rp"+harga_keyboard[3]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 5:
                    System.out.println("Keyboard\t: "+jenis_keyboard[4]);
                    System.out.println("Harga\t\t: "+harga_keyboard[4]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_keyboard[4]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_keyboard[4]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_keyboard[4]);
                    System.out.println("Harga\t\t: Rp"+harga_keyboard[4]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 6:
                    System.out.println("Mouse\t\t: "+jenis_mouse[0]);
                    System.out.println("Harga\t\t: "+harga_mouse[0]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_mouse[0]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_mouse[0]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_mouse[0]);
                    System.out.println("Harga\t\t: Rp"+harga_mouse[0]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 7:
                    System.out.println("Mouse\t\t: "+jenis_mouse[1]);
                    System.out.println("Harga\t\t: "+harga_mouse[1]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_mouse[1]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_mouse[1]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_mouse[1]);
                    System.out.println("Harga\t\t: Rp"+harga_mouse[1]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 8:
                    System.out.println("Mouse\t\t: "+jenis_mouse[2]);
                    System.out.println("Harga\t\t: "+harga_mouse[2]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_mouse[2]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_mouse[2]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_mouse[2]);
                    System.out.println("Harga\t\t: Rp"+harga_mouse[2]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 9:
                    System.out.println("Mouse\t\t: "+jenis_mouse[3]);
                    System.out.println("Harga\t\t: "+harga_mouse[3]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_mouse[3]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_mouse[3]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_mouse[3]);
                    System.out.println("Harga\t\t: Rp"+harga_mouse[3]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 10:
                    System.out.println("Mouse\t\t: "+jenis_mouse[4]);
                    System.out.println("Harga\t\t: "+harga_mouse[4]);
                    
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
                    
                    totaldiskon = harga_mouse[4]*inputjumlah;
                        
                    if (inputjumlah > 2) {
                    diskon = (totaldiskon*20)/100; }
                            
                    total = (harga_mouse[4]*inputjumlah)-diskon;   
                                
                    System.out.println("Total Harga\t: "+total);
                                    
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
                                        
                    kembalian = (inputbayar-total);
                                
                    System.out.println("+=========================================+");
                    System.out.println("Keyboard\t: "+jenis_mouse[4]);
                    System.out.println("Harga\t\t: Rp"+harga_mouse[4]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+totaldiskon);
                    System.out.println("Diskon (20%)\t: Rp"+diskon);
                    System.out.println("Total\t\t: Rp"+total);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+kembalian);
                    System.out.println("+=========================================+");
                    break;
                case 99:
                    menumenu();
                    break;
                default :
                    System.out.println("+=========================================+");
                    System.out.println("Barang tidak tersedia. Silahkan input.");
                    
                    System.out.print("Input Keyboard\t: ");
                    inputkeyb = huruf.nextLine();
            
                    System.out.print("Input Harga\t: ");
                    inputharga = input.nextInt();
            
                    System.out.print("Jumlah Barang\t: ");
                    inputjumlah = input.nextInt();
            
                    total = (inputharga*inputjumlah);
                    System.out.println("Total Pembelian\t: "+total+" (Rp"+inputharga+" x "+inputjumlah+")");
            
                    System.out.print("Uang Pembayaran\t: ");
                    inputbayar = input.nextInt();
            
                    kembalian = (inputbayar-total);
                    System.out.println("Kembali\t\t: "+kembalian+" (Rp"+inputbayar+" - Rp"+total+")"); 
                    System.out.println("+=========================================+");
                        }
                    }
    
    public static void main(String[] args) {
        
            System.out.println("+=========================================+");
            System.out.println("|         -- GAMING GEAR STORE --         |");
            System.out.println("+=========================================+");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||");

            menumenu();
        
        }   
}