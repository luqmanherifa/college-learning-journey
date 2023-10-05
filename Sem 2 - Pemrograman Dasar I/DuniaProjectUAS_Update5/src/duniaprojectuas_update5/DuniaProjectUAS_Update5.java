package duniaprojectuas_update5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class DuniaProjectUAS_Update5 {

    
                // PROJECT PROGRAM MENU MINI MARKET
  
    
        // deklarasi variabel
    
        //input
    static Scanner input = new Scanner (System.in);
    
        //deklarasi variabel
    static String insertnamas, insertnamad, insertnamaa, insertkodea, tandadiskon;
    static int choose, inputjumlah, inputharga, inputadmin, inputbayar, rumusdiskon, rumustotal, rumuskembali;
    static int cekstok, tojumsnack, totaljumlahdiskon, tojumdrink, deletesda, tambahstoksnack, tambahstokdrink;
    static int inputarray, inserthargas, insertstoks, inserthargad, insertstokd, a, b, c;
    
        //deklarasi snackdrink
    static String namasnackdrink[] = new String[10];
    static int totalsnackdrink[] = new int[10];
    static int jumlahsnackdrink[] = new int[10];
    
        //deklarasi snack
    static String nama_snack[] = new String[10]; 
    static int harga_snack[] = new int[10]; 
    static int stok_snack[] = new int[10];
    
        //deklarasi softdrink
    static String nama_drink[] = new String[10]; 
    static int harga_drink[] = new int[10];
    static int stok_drink[] = new int[10];
    
        //deklarasi admin
    static String nama_admin[] = new String[10]; 
    static String kode_admin[] = new String[10]; 
    
        //deklarasi nilai
    static int varsnack = 3;
    static int vardrink = 3;
    static int varadmin = 3;
    static int vartrans, varbeli;
    static int totaltotal = 0;
    
        //deklarasi perulangan
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
            for (a = 1; a <= varsnack; a++) {
                System.out.print("[0"+a+"] "+nama_snack[a-1]+"\t\t► Rp"+harga_snack[a-1]+"\t"+stok_snack[a-1]+"\n");
            }
            System.out.println("==============================================");
            System.out.println("[01] Insert Data");
            System.out.println("[02] Update Data");
            System.out.println("[03] Delete Data");
            System.out.println("[09] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 1:
                    insert_snack();
                    break;
                case 2:
                    update_snack();
                    break;
                case 3:
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
            
            nama_snack[varsnack] = insertnamas;
            harga_snack[varsnack] = inserthargas;
            stok_snack[varsnack] = insertstoks;
            varsnack++;
    }
    
    static void update_snack() {
            System.out.print("Update Snack\t► ");
            inputarray = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Snack\t: "+nama_snack[inputarray-1]);
            System.out.println("Harga Snack\t: "+harga_snack[inputarray-1]);
            System.out.println("Stok Snack\t: "+stok_snack[inputarray-1]);
            System.out.println("----------------------------------------------");
            System.out.print("Update Nama\t: ");
            nama_snack[inputarray-1] = input.next();
            System.out.print("Update Harga\t: ");
            harga_snack[inputarray-1] = input.nextInt();
            System.out.print("Update Stok\t: ");
            tambahstoksnack = input.nextInt();
            stok_snack[inputarray-1] = stok_snack[inputarray-1]+tambahstoksnack; 
    }
    
    static void delete_snack() {
            System.out.print("Delete Snack\t► ");
            deletesda = input.nextInt();
        
                for (int d = deletesda; d <= varsnack; d++) {
            nama_snack[d-1] = nama_snack[d];
            harga_snack[d-1] = harga_snack[d];
            stok_snack[d-1] = stok_snack[d];
                }
            varsnack--;
            System.out.println("----------------------------------------------");
            System.out.println("Data snack telah dihapus!");
    }
    
    
        // data softdrink
    
    static void data_drink() {
            System.out.println("+============================================+");
            System.out.println("|               DATA SOFTDRINK               |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA BARANG        HARGA          STOK  |");
            System.out.println("==============================================");
            for (a = 1; a <= vardrink; a++) {
                System.out.print("[0"+a+"] "+nama_drink[a-1]+"\t\t► Rp"+harga_drink[a-1]+"\t"+stok_drink[a-1]+"\n");
            }
            System.out.println("==============================================");
            System.out.println("[01] Insert Data");
            System.out.println("[02] Update Data");
            System.out.println("[03] Delete Data");
            System.out.println("[09] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 1:
                    insert_drink();
                    break;
                case 2:
                    update_drink();
                    break;
                case 3:
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
            
            nama_drink[vardrink] = insertnamad;
            harga_drink[vardrink] = inserthargad;
            stok_drink[vardrink] = insertstokd;
            vardrink++;
    }
    
    static void update_drink() {
            System.out.print("Update Softdrink\t► ");
            inputarray = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Softdrink\t: "+nama_drink[inputarray-1]);
            System.out.println("Harga Softdrink\t: "+harga_drink[inputarray-1]);
            System.out.println("Stok Softdrink\t: "+stok_drink[inputarray-1]);
            System.out.println("----------------------------------------------");
            System.out.print("Update Nama\t: ");
            nama_drink[inputarray-1] = input.next();
            System.out.print("Update Harga\t: ");
            harga_drink[inputarray-1] = input.nextInt();
            System.out.print("Update Stok\t: ");
            tambahstokdrink = input.nextInt();
            stok_drink[inputarray-1] = stok_drink[inputarray-1]+tambahstokdrink; 
    }
    
    static void delete_drink() {
            System.out.print("Delete Softdrink\t► ");
            deletesda = input.nextInt();
        
                for (int d = deletesda; d <= vardrink; d++) {
            nama_drink[d-1] = nama_drink[d];
            harga_drink[d-1] = harga_drink[d];
            stok_drink[d-1] = stok_drink[d];
                }
            vardrink--;
            System.out.println("----------------------------------------------");
            System.out.println("Data drink telah dihapus!");
    }
    
    
        // data admin
    
    static void data_admin() {
            System.out.println("+============================================+");
            System.out.println("|                 DATA ADMIN                 |");
            System.out.println("+============================================+");
            System.out.println("|    NAMA ADMIN             ID ADMIN         |");
            System.out.println("==============================================");
            for (a = 1; a <= varadmin; a++) {
                System.out.print("[0"+a+"] "+nama_admin[a-1]+"\t\t    "+kode_admin[a-1]+"\n");
            }
            System.out.println("==============================================");
            System.out.println("[01] Insert Admin");
            System.out.println("[02] Update Admin");
            System.out.println("[03] Delete Admin");
            System.out.println("[09] Exit");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 1:
                    insert_admin();
                    break;
                case 2:
                    update_admin();
                    break;
                case 3:
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
            
            nama_admin[varadmin] = insertnamaa;
            kode_admin[varadmin] = insertkodea;
            varadmin++;
    }
    
    static void update_admin() {
            System.out.print("Input Admin\t► ");
            inputarray = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Admin\t: "+nama_admin[inputarray-1]);
            System.out.println("ID Admin\t: "+kode_admin[inputarray-1]);
            System.out.println("----------------------------------------------");
            System.out.print("Nama Admin\t: ");
            nama_admin[inputarray-1] = input.next();
    }
    
    static void delete_admin() {
            System.out.print("Delete Admin\t► ");
            deletesda = input.nextInt();
        
                for (int d = deletesda; d <= varadmin; d++) {
            nama_admin[d-1] = nama_admin[d];
            kode_admin[d-1] = kode_admin[d];
                }
            varadmin--;
            System.out.println("----------------------------------------------");
            System.out.println("Data admin telah dihapus!");
    }
    
    
        // menu transaksi
    
    static void menu_transaksi() {
            System.out.println("==============================================");
            System.out.println("|               MENU TRANSAKSI               |");
            System.out.println("==============================================");
            System.out.println("|    SNACK                                   |");
            System.out.println("==============================================");
            System.out.println("|    NAMA BARANG        HARGA          STOK  |");
            System.out.println("==============================================");
            for (a = 1; a <= varsnack; a++) {
                System.out.print("[0"+a+"] "+nama_snack[a-1]+"\t\t► Rp"+harga_snack[a-1]+"\t"+stok_snack[a-1]+"   |\n");
            }
            System.out.println("+=============================================");
            System.out.println("|    SOFTDRINK                               |");
            System.out.println("+=============================================");
            System.out.println("|    NAMA BARANG        HARGA          STOK  |");
            System.out.println("==============================================");
            for (a = 1; a <= vardrink; a++) {
                System.out.print("[0"+a+"] "+nama_drink[a-1]+"\t\t► Rp"+harga_drink[a-1]+"\t"+stok_drink[a-1]+"   |\n");
            }
            System.out.println("==============================================");
            System.out.println("[01] Beli                                    |");
            System.out.println("[09] Exit                                    |");
            System.out.println("==============================================");
            
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            
            switch (choose) {
                case 1:
                    vartrans = 0;
                    varbeli = 1;
                    totaltotal = 0;
                    beli_lagi();
                    break;
                case 9:
                    System.out.println("----------------------------------------------");
                    System.out.println("Anda telah keluar dari menu.");
                    break;
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("Maaf! Menu tidak tersedia.");
                    break;
            }
    }
    
    static void beli_snack() {
            System.out.print("Beli Snack\t► ");
            inputarray = input.nextInt();
            
            if (inputarray <= varsnack) { 
            }
            else {
                System.out.println("----------------------------------------------");  
                System.out.println("Snack tidak tersedia!");
                beli_lagi();
            }
            
            System.out.println("----------------------------------------------");   
            System.out.println("Nama Snack\t: "+nama_snack[inputarray-1]);
            System.out.println("Harga Snack\t: "+harga_snack[inputarray-1]);
            System.out.println("Stok Snack\t: "+stok_snack[inputarray-1]);      
            stok_snack();
    }
    
    static void stok_snack() {
            System.out.println("----------------------------------------------");
            System.out.print("Input Jumlah\t► ");
            inputjumlah = input.nextInt();
            System.out.println("----------------------------------------------");
        
            cekstok = stok_snack[inputarray-1]-inputjumlah;
        
            if (cekstok < 0) {
                    System.out.println("Maaf! Stok kurang.");
                    stok_snack();
            }
            else {
                stok_snack[inputarray-1] = cekstok;
                total_snack();
            }
    }
            
    static void total_snack() {
                if (inputjumlah < 5) {
                    rumusdiskon = harga_snack[inputarray-1]*inputjumlah*0/100;
                    tandadiskon = "0%";
            }
            else if (inputjumlah >= 5) {
                rumusdiskon = harga_snack[inputarray-1]*inputjumlah*10/100;
                tandadiskon = "10%";
            }
            else if (inputjumlah >= 10) {
                rumusdiskon = harga_snack[inputarray-1]*inputjumlah*20/100;
                tandadiskon = "20%";
            }
            
            tojumsnack = (inputjumlah*harga_snack[inputarray-1]);
            System.out.println("==============================================");
            System.out.println("Harga\t\t: Rp"+tojumsnack+" ("+harga_snack[inputarray-1]+" x "+inputjumlah+") - "+tandadiskon);
            
            totaljumlahdiskon = (inputjumlah*harga_snack[inputarray-1])-rumusdiskon;
            System.out.println("Total\t\t: Rp"+totaljumlahdiskon);
            
            namasnackdrink[vartrans] = nama_snack[inputarray-1];
            jumlahsnackdrink[vartrans] = inputjumlah;
            totalsnackdrink[vartrans] = totaljumlahdiskon;
            vartrans++;
            varbeli++;
            
            System.out.println("==============================================");
            System.out.println("[01] Beli Lagi                                ");
            System.out.println("[02] Bayar                                    ");
            System.out.println("[09] Batal                                    ");
            System.out.println("==============================================");
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            
            switch (choose) {
                case 1:
                    beli_lagi();
                    break;
                case 2:
                    bayar_transaksi();
                    break;
                case 9:
                    menu_transaksi();
                    break;
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("Maaf! Menu tidak tersedia.");
                    beli_lagi();
                    break;
            }    
    }
    
    static void beli_drink() {
            System.out.print("Beli Softdrink\t► ");
            inputarray = input.nextInt();
            
            if (inputarray <= vardrink) { 
            }
            else {
                System.out.println("----------------------------------------------");  
                System.out.println("Softdrink tidak tersedia!");
                beli_lagi();
            }
            
            System.out.println("----------------------------------------------");   
            System.out.println("Nama Softdrink\t: "+nama_drink[inputarray-1]);
            System.out.println("Harga Softdrink\t: "+harga_drink[inputarray-1]);
            System.out.println("Stok Softdrink\t: "+stok_drink[inputarray-1]);      
            stok_drink();
    }
    
    static void stok_drink() {
            System.out.println("----------------------------------------------");
            System.out.print("Input Jumlah\t► ");
            inputjumlah = input.nextInt();
            System.out.println("----------------------------------------------");
        
            cekstok = stok_drink[inputarray-1]-inputjumlah;
        
            if (cekstok < 0) {
                    System.out.println("Maaf! Stok kurang.");
                    stok_drink();
            }
            else {
                stok_drink[inputarray-1] = cekstok;
                total_drink();
            }
    }
            
    static void total_drink() {
                if (inputjumlah < 5) {
                    rumusdiskon = harga_drink[inputarray-1]*inputjumlah*0/100;
                    tandadiskon = "0%";
            }
            else if (inputjumlah >= 5) {
                rumusdiskon = harga_drink[inputarray-1]*inputjumlah*10/100;
                tandadiskon = "10%";
            }
            else if (inputjumlah >= 10) {
                rumusdiskon = harga_drink[inputarray-1]*inputjumlah*20/100;
                tandadiskon = "20%";
            }
            
            tojumdrink = (inputjumlah*harga_drink[inputarray-1]);
            System.out.println("==============================================");
            System.out.println("Harga\t\t: Rp"+tojumdrink+" ("+harga_drink[inputarray-1]+" x "+inputjumlah+") - "+tandadiskon);
            
            totaljumlahdiskon = (inputjumlah*harga_drink[inputarray-1])-rumusdiskon;
            System.out.println("Total\t\t: Rp"+totaljumlahdiskon);
            
            namasnackdrink[vartrans] = nama_drink[inputarray-1];
            jumlahsnackdrink[vartrans] = inputjumlah;
            totalsnackdrink[vartrans] = totaljumlahdiskon;
            vartrans++;
            varbeli++;
            
            System.out.println("==============================================");
            System.out.println("[01] Beli Lagi                                ");
            System.out.println("[02] Bayar                                    ");
            System.out.println("[09] Batal                                    ");
            System.out.println("==============================================");
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            
            switch (choose) {
                case 1:
                    beli_lagi();
                    break;
                case 2:
                    bayar_transaksi();
                    break;
                case 9:
                    menu_transaksi();
                    break;
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("Maaf! Menu tidak tersedia.");
                    beli_lagi();
                    break;
            }    
    }
    
    static void beli_lagi() {
            System.out.println("----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("[01] Beli Snack                               ");
            System.out.println("[02] Beli Softdrink                           ");
            System.out.println("==============================================");
            System.out.println("----------------------------------------------");
            System.out.print("Input Menu\t► ");
            choose = input.nextInt();
            System.out.println("----------------------------------------------");
            
            switch (choose) {
                case 1:
                    beli_snack();
                    break;
                case 2:
                    beli_drink();
                    break;
                default:
                    System.out.println("Maaf! Menu tidak tersedia.");
                    beli_lagi();
                    break;
            }    
    }
        
    
        // bayar transaksi
    
    static void bayar_transaksi() {        
            System.out.println("----------------------------------------------");
            System.out.print("Input Admin\t► ");
            inputadmin = input.nextInt();
        
            for (b = 0; b < vartrans; b++) {
                totaltotal = totaltotal+totalsnackdrink[b];
            } 
            System.out.println("----------------------------------------------");
            System.out.println("Total Harga\t: "+totaltotal);
            
            if_uang();
    }
    
        static void if_uang() {        
            System.out.print("Uang Pembayaran\t: ");
            inputbayar = input.nextInt();
            rumuskembali = inputbayar-totaltotal;
            
            if (rumuskembali < 0) {
                System.out.println("----------------------------------------------");
                System.out.println("Uang tidak cukup!");
                System.out.println("----------------------------------------------");
                if_uang();
            }
            else {
                System.out.println("Kembalian\t: "+rumuskembali);
                System.out.println("----------------------------------------------");
                nota_transaksi();
            }
    }
             
    static String tanggal_trans() {  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            Date date = new Date();  
            return dateFormat.format(date);  
    }
    
    static String waktu_trans() {  
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
            Date date = new Date();  
            return dateFormat.format(date);  
    } 
 
    
        // nota transaksi
    
    static void nota_transaksi() {
            System.out.println("==============================================");
            System.out.println("              LIMA SEMBILAN MART              ");
            System.out.println("                 085236919696                 ");
            System.out.println("                                              ");
            System.out.println("               CV. KST REMUJUNG               ");
            System.out.println("       JL. SOEKARNO HATTA NO. 59 MALANG       ");
            System.out.println("==============================================");
            System.out.println("\t\t\tKasir : "+nama_admin[inputadmin-1]);
            System.out.println("==============================================");
            for (c = 0; c < vartrans; c++) {
                System.out.print("  "+namasnackdrink[c]+"\t\t"+jumlahsnackdrink[c]+"\t"+totalsnackdrink[c]+"\n");
            }
            System.out.println("==============================================");
            System.out.println("  Total Belanja\t\t\t"+totaltotal);
            System.out.println("  Tunai\t\t\t\t"+inputbayar);
            System.out.println("  Kembalian\t\t\t"+rumuskembali);
            System.out.println("==============================================");
            System.out.println("  Tgl. "+tanggal_trans()+"   "+waktu_trans());
            System.out.println("==============================================");
            System.out.println("       Kritik & Saran Hub Telp. 663619        ");
            System.out.println("                www.59mart.com                ");
            System.out.println("==============================================");
    }
    
    
    public static void main(String[] args) {
        { 
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
            nama_drink[1] = "Pucuk";
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
            
            System.out.println("        WELCOME TO LIMA SEMBILAN MART         ");

            menu_utama();
        }
    }
}