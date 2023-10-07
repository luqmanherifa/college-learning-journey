/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duniaprojectuas;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class DuniaProjectUAS {

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner (System.in);
    static Scanner huruf = new Scanner (System.in);
    
    static int choose, inputharga, inputjumlah, rumustodi, rumusdiskon, rumustotal, inputbayar, rumuskembali;
    static String inputsnack, inputdrink;
    
    static String[] nama_snack = {"Beng Beng", "Good Time", "Trenz", "Koko", "Pocky"};
    static String[] nama_drink = {"Teh Pucuk", "Aqua", "Frestea", "Pocari", "Kiranti"};
    static int[] harga_snack = {1000, 2000, 3000, 4000, 5000};
    static int[] harga_drink = {2000, 3000, 4000, 5000, 8000};
 
    static char reloop = ' ';
    
    /*  !NOTE
        todi = total-diskon
    */
    
    static void menu_utama() {
        do {
            System.out.println("+================================+");
            System.out.println("|        MENU MINI MARKET        |");
            System.out.println("+================================+");
            System.out.println("[1] Data Snack");
            System.out.println("[2] Data Softdrink");
            System.out.println("[3] Data Operator");
            System.out.println("[4] Transaksi");
            System.out.println("[5] Exit");
            System.out.println("[6] Update");
            System.out.println("==================================");
            
            System.out.println("--------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("--------------------------");
            
            switch (choose) {
                case 1:
                    data_snack();
                    break;
                case 2:
                    data_softdrink();
                    break;
                case 3:
                    data_operator();
                    break;
                case 4:
                    menu_transaksi();
                    break;
                case 5:
                    System.out.println("Anda telah keluar dari program Menu. Terima kasih.");
                    System.exit(0);
                    break;
                case 6:
                    cobaupdate();
                    break;
                default :
                    System.out.println("Maaf! Menu tidak tersedia.");
            }
            
            System.out.print("Kembali ke Menu? (a) ► ");
            reloop = input.next().charAt(0);
        
        } while (reloop == 'a');
    }
    
    static void data_snack() {
            System.out.println("==================================");
            System.out.println("[01] "+nama_snack[0]+"\t► Rp"+harga_snack[0]);
            System.out.println("[02] "+nama_snack[1]+"\t► Rp"+harga_snack[1]);
            System.out.println("[03] "+nama_snack[2]+"\t► Rp"+harga_snack[2]);
            System.out.println("[04] "+nama_snack[3]+"\t► Rp"+harga_snack[3]);
            System.out.println("[05] "+nama_snack[4]+"\t► Rp"+harga_snack[4]);
            System.out.println("==================================");            
    }
    
    static void data_softdrink() {
            System.out.println("==================================");
            System.out.println("[01] "+nama_drink[0]+"\t► Rp"+harga_drink[0]);
            System.out.println("[02] "+nama_drink[1]+"\t► Rp"+harga_drink[1]);
            System.out.println("[03] "+nama_drink[2]+"\t► Rp"+harga_drink[2]);
            System.out.println("[04] "+nama_drink[3]+"\t► Rp"+harga_drink[3]);
            System.out.println("[05] "+nama_drink[4]+"\t► Rp"+harga_drink[4]);
            System.out.println("==================================");
    }
    
    static void data_operator() {
        
    }
    
    static void menu_transaksi() {
            System.out.println("==================================");
            System.out.println("[01] "+nama_snack[0]+"\t► Rp"+harga_snack[0]);
            System.out.println("[02] "+nama_snack[1]+"\t► Rp"+harga_snack[1]);
            System.out.println("[03] "+nama_snack[2]+"\t► Rp"+harga_snack[2]);
            System.out.println("[04] "+nama_snack[3]+"\t► Rp"+harga_snack[3]);
            System.out.println("[05] "+nama_snack[4]+"\t► Rp"+harga_snack[4]);
            System.out.println("[06] "+nama_drink[0]+"\t► Rp"+harga_drink[0]);
            System.out.println("[07] "+nama_drink[1]+"\t► Rp"+harga_drink[1]);
            System.out.println("[08] "+nama_drink[2]+"\t► Rp"+harga_drink[2]);
            System.out.println("[09] "+nama_drink[3]+"\t► Rp"+harga_drink[3]);
            System.out.println("[10] "+nama_drink[4]+"\t► Rp"+harga_drink[4]);
            System.out.println("[44] Kembali ke Menu Utama.");
            System.out.println("==================================");  
            
            System.out.println("--------------------------");
            System.out.print("Input Kode\t► ");
            choose = input.nextInt();
            
            switch (choose) {
                case 1:
                    System.out.println("Snack\t\t► "+nama_snack[0]);
                    System.out.println("Harga\t\t► "+harga_snack[0]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_snack[0]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_snack[0]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Snack\t\t: "+nama_snack[0]);
                    System.out.println("Harga\t\t: Rp"+harga_snack[0]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 2:
                    System.out.println("Snack\t\t► "+nama_snack[1]);
                    System.out.println("Harga\t\t► "+harga_snack[1]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_snack[1]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_snack[1]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Snack\t\t: "+nama_snack[1]);
                    System.out.println("Harga\t\t: Rp"+harga_snack[1]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 3:
                    System.out.println("Snack\t\t► "+nama_snack[2]);
                    System.out.println("Harga\t\t► "+harga_snack[2]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_snack[2]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_snack[2]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Snack\t\t: "+nama_snack[2]);
                    System.out.println("Harga\t\t: Rp"+harga_snack[2]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 4:
                    System.out.println("Snack\t\t► "+nama_snack[3]);
                    System.out.println("Harga\t\t► "+harga_snack[3]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_snack[3]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_snack[3]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Snack\t\t: "+nama_snack[3]);
                    System.out.println("Harga\t\t: Rp"+harga_snack[3]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 5:
                    System.out.println("Snack\t\t► "+nama_snack[4]);
                    System.out.println("Harga\t\t► "+harga_snack[4]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_snack[4]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_snack[4]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Snack\t\t: "+nama_snack[4]);
                    System.out.println("Harga\t\t: Rp"+harga_snack[4]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 6:
                    System.out.println("Softdrink\t► "+nama_drink[0]);
                    System.out.println("Harga\t\t► "+harga_drink[0]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_drink[0]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_drink[0]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Softdrink\t: "+nama_drink[0]);
                    System.out.println("Harga\t\t: Rp"+harga_drink[0]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 7:
                    System.out.println("Softdrink\t► "+nama_drink[1]);
                    System.out.println("Harga\t\t► "+harga_drink[1]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_drink[1]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_drink[1]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Softdrink\t: "+nama_drink[1]);
                    System.out.println("Harga\t\t: Rp"+harga_drink[1]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 8:
                    System.out.println("Softdrink\t► "+nama_drink[2]);
                    System.out.println("Harga\t\t► "+harga_drink[2]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_drink[2]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_drink[2]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Softdrink\t: "+nama_drink[2]);
                    System.out.println("Harga\t\t: Rp"+harga_drink[2]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 9:
                    System.out.println("Softdrink\t► "+nama_drink[3]);
                    System.out.println("Harga\t\t► "+harga_drink[3]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_drink[3]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_drink[3]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Softdrink\t: "+nama_drink[3]);
                    System.out.println("Harga\t\t: Rp"+harga_drink[3]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 10:
                    System.out.println("Softdrink\t► "+nama_drink[4]);
                    System.out.println("Harga\t\t► "+harga_drink[4]);
                    
                    System.out.print("Input Jumlah\t► ");
                    inputjumlah = input.nextInt();
                    
                      rumustodi = harga_drink[4]*inputjumlah;
                        
                        if (inputjumlah > 5) {
                        rumusdiskon = (rumustodi*10)/100; }
                            
                          rumustotal = (harga_drink[4]*inputjumlah)-rumusdiskon;   
                                
                            System.out.println("Total\t\t► "+rumustotal);
                                    
                              System.out.print("Input Bayar\t► ");
                              inputbayar = input.nextInt();
                              System.out.println("--------------------------");
                                        
                                rumuskembali = (inputbayar-rumustotal);
                                
                    System.out.println("==================================");
                    System.out.println("Softdrink\t: "+nama_drink[4]);
                    System.out.println("Harga\t\t: Rp"+harga_drink[4]+" x "+inputjumlah);
                    System.out.println("Jumlah\t\t: Rp"+rumustodi);
                    System.out.println("Diskon 10%\t: Rp"+rumusdiskon);
                    System.out.println("Total\t\t: Rp"+rumustotal);
                    System.out.println("Bayar\t\t: Rp"+inputbayar);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali);
                    System.out.println("==================================");
                    break;
                case 44:
                    System.out.println("Anda telah kembali ke Menu.");
                    break;
                default :
                    System.out.println("Snack atau Softdrink tidak tersedia di Menu.\nSilahkan input secara manual.\n");
                    
                    System.out.print("Input Snack\t: ");
                    inputsnack = huruf.nextLine();
            
                    System.out.print("Input Harga\t: Rp");
                    inputharga = input.nextInt();
            
                    System.out.print("Input Jumlah\t: ");
                    inputjumlah = input.nextInt();
            
                    rumustotal = (inputharga*inputjumlah);
                    System.out.println("Total Pembelian\t: Rp"+rumustotal+" (Rp"+inputharga+" x "+inputjumlah+")");
            
                    System.out.print("Input Bayar\t: Rp");
                    inputbayar = input.nextInt();
            
                    rumuskembali = (inputbayar-rumustotal);
                    System.out.println("Kembali\t\t: Rp"+rumuskembali+" (Rp"+inputbayar+" - Rp"+rumustotal+")"); 
            }
    }
    
    static void cobaupdate() {
                System.out.println("[01] "+nama_snack[0]+"\t► Rp"+harga_snack[0]);
                System.out.println("[02] "+nama_snack[1]+"\t► Rp"+harga_snack[1]);
                System.out.println("[03] "+nama_snack[2]+"\t► Rp"+harga_snack[2]);
                System.out.println("[04] "+nama_snack[3]+"\t► Rp"+harga_snack[3]);
                System.out.println("[05] "+nama_snack[4]+"\t► Rp"+harga_snack[4]);
                System.out.println("[06] "+nama_drink[0]+"\t► Rp"+harga_drink[0]);
                System.out.println("[07] "+nama_drink[1]+"\t► Rp"+harga_drink[1]);
                System.out.println("[08] "+nama_drink[2]+"\t► Rp"+harga_drink[2]);
                System.out.println("[09] "+nama_drink[3]+"\t► Rp"+harga_drink[3]);
                System.out.println("[10] "+nama_drink[4]+"\t► Rp"+harga_drink[4]);
                System.out.print("Input Kode\t► ");
                choose = input.nextInt();
                
                switch (choose) {
                    case 1:
                        System.out.print("Input Update Snack 1: ");
                        harga_snack[0] = input.nextInt();
                        break;
                    case 2:
                        System.out.print("Input Update Snack 1: ");
                        harga_snack[1] = input.nextInt();
                        break;
                    case 3:
                        System.out.print("Input Update Snack 1: ");
                        harga_snack[2] = input.nextInt();
                        break;
                }
    }
                    
    
    public static void main(String[] args) {
        
            System.out.println("     WELCOME TO MARKET     ");

            menu_utama();
        
    }
}