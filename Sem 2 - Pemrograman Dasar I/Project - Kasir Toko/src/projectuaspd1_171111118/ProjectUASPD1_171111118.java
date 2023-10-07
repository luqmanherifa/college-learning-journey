package projectuaspd1_171111118;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LUQMAN AL HAKIM - 171 111 118
 */

public class ProjectUASPD1_171111118 {
    
                // PROJECT PROGRAM MENU MINI MARKET
    
   
        // DEKLARASI VARIABEL
    
        // deklarasi sistem iinput
    static Scanner input = new Scanner (System.in);
    
        // deklarasi variabel
    static String insertnamas, insertnamad, insertnamaa, insertkodea, tandadiskon;
    static int choose, inputjumlah, inputharga, inputadmin, inputbayar, rumusdiskon, rumustotal, rumuskembali;
    static int inputarray, inserthargas, insertstoks, inserthargad, insertstokd, a, b, c;
    static int cekstok, tojumsnack, totaljumlahdiskon, tojumdrink, deletesda, tambahstoksnack, tambahstokdrink;
    
        // deklarasi snack drink
    static String namasnackdrink[] = new String[10];
    static int totalsnackdrink[] = new int[10];
    static int jumlahsnackdrink[] = new int[10];
    
        // deklarasi snack
    static String nama_snack[] = new String[10]; 
    static int harga_snack[] = new int[10]; 
    static int stok_snack[] = new int[10];
    
        // deklarasi softdrink
    static String nama_drink[] = new String[10]; 
    static int harga_drink[] = new int[10];
    static int stok_drink[] = new int[10];
    
        // deklarasi admin
    static String nama_admin[] = new String[10]; 
    static String kode_admin[] = new String[10];
    
        // deklarasi laporan
    static int lapkode[] = new int[10];
    static String lapadmin[] = new String[10];
    static String laptanggal[] = new String[10];
    static String lapwaktu[] = new String[10];
    static int laptotal[] = new int[10];
    
        // deklarasi nilai
    static int varsnack = 3;
    static int vardrink = 3;
    static int varadmin = 3;
    static int varlap = 0;
    static int vartrans, varbeli;
    static int totaltotal = 0;
    
        // deklarasi cek index sama
    static int cekindex;
    static String ceknamas, ceknamad, ceknamaa, cekkodea;
    static boolean ceksama;
    
        //deklarasi perulangan
    static char reloop = ' ';
    
        // MENU UTAMA
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
                    System.out.println("Tekan s untuk keluar.");
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

        // DATA SNACK
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
    
        // insert snack
    static void insert_snack() {
            do {
                ceksama = false;
                System.out.print("Nama Snack\t: ");
                ceknamas = input.next();

                for (cekindex = 0; cekindex <= varsnack; cekindex++) {
                    if (nama_snack[cekindex] != null) {
                        if (ceknamas.equals(nama_snack[cekindex])) {
                            ceksama = true;
                            break;
                        } else {
                            ceksama = false;
                        }
                    }
                }
            } while (ceksama);
            insertnamas = ceknamas;
            hargastok_snack();
    }

    static void hargastok_snack() {
            do {
                System.out.print("Harga Snack\t: ");
                inserthargas = input.nextInt();
            } while (inserthargas <= 0);

            do {
                System.out.print("Stok Snack\t: ");
                insertstoks = input.nextInt();
            } while (insertstoks <= 0);

            nama_snack[varsnack] = insertnamas;
            harga_snack[varsnack] = inserthargas;
            stok_snack[varsnack] = insertstoks;
            varsnack++;
    }
    
        // update snack
    static void update_snack() {
            System.out.print("Update Snack\t► ");
            inputarray = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Snack\t: "+nama_snack[inputarray-1]);
            System.out.println("Harga Snack\t: "+harga_snack[inputarray-1]);
            System.out.println("Stok Snack\t: "+stok_snack[inputarray-1]);
            System.out.println("----------------------------------------------");
            
            do {
                System.out.print("Update Harga\t: ");
                harga_snack[inputarray-1] = input.nextInt();
            } while (harga_snack[inputarray-1] <= 0);
            
            do {
                System.out.print("Update Stok\t: ");
                tambahstoksnack = input.nextInt();
            } while (tambahstoksnack <= 0);
            stok_snack[inputarray-1] = stok_snack[inputarray-1]+tambahstoksnack; 
    }
    
        // delete snack
    static void delete_snack() {
            do{
                System.out.print("Delete Snack\t► ");
                deletesda = input.nextInt();
            } while (deletesda > varsnack || deletesda <= 0);
            
                for (int d = deletesda; d <= varsnack; d++) {
            nama_snack[d-1] = nama_snack[d];
            harga_snack[d-1] = harga_snack[d];
            stok_snack[d-1] = stok_snack[d];
                }
            varsnack--;
            System.out.println("----------------------------------------------");
            System.out.println("Data snack telah dihapus!");
    }
    
        // DATA SOFTDRINK
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
    
        // insert softdrink
    static void insert_drink() {
            do {
                ceksama = false;
                System.out.print("Nama Drink\t: ");
                ceknamad = input.next();

                for (cekindex = 0; cekindex <= vardrink; cekindex++) {
                    if (nama_drink[cekindex] != null) {
                        if (ceknamad.equals(nama_drink[cekindex])) {
                            ceksama = true;
                            break;
                        } else {
                            ceksama = false;
                        }
                    }
                }
            } while (ceksama);
            insertnamad = ceknamad;
            hargastok_drink();
    }

    static void hargastok_drink() {
            do {
                System.out.print("Harga Softdrink\t: ");
                inserthargad = input.nextInt();
            } while (inserthargad <= 0);

            do {
                System.out.print("Stok Softdrink\t: ");
                insertstokd = input.nextInt();
            } while (insertstokd <= 0);

            nama_drink[vardrink] = insertnamad;
            harga_drink[vardrink] = inserthargad;
            stok_drink[vardrink] = insertstokd;
            vardrink++;
    }
    
        // update softdrink
    static void update_drink() {
            System.out.print("Update Drink\t► ");
            inputarray = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("Nama Softdrink\t: "+nama_drink[inputarray-1]);
            System.out.println("Harga Softdrink\t: "+harga_drink[inputarray-1]);
            System.out.println("Stok Softdrink\t: "+stok_drink[inputarray-1]);
            System.out.println("----------------------------------------------");
            
            do {
                System.out.print("Update Harga\t: ");
                harga_drink[inputarray-1] = input.nextInt();
            } while (harga_drink[inputarray-1] <= 0);
            
            do {
                System.out.print("Update Stok\t: ");
                tambahstokdrink = input.nextInt();
            } while (tambahstokdrink <= 0);
            stok_drink[inputarray-1] = stok_drink[inputarray-1]+tambahstokdrink; 
    }
    
        // delete softdrink
    static void delete_drink() {
            do {
                System.out.print("Delete Softdrink\t► ");
                deletesda = input.nextInt();
            } while (deletesda > vardrink || deletesda <= 0);
        
                for (int d = deletesda; d <= vardrink; d++) {
            nama_drink[d-1] = nama_drink[d];
            harga_drink[d-1] = harga_drink[d];
            stok_drink[d-1] = stok_drink[d];
                }
            vardrink--;
            System.out.println("----------------------------------------------");
            System.out.println("Data softdrink telah dihapus!");
    }
    
        // DATA ADMIN
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
            System.out.println("[02] Delete Admin");
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
    
        // insert admin (nama)
    static void insert_admin() {
            do {
                ceksama = false;
                System.out.print("Nama Admin\t: ");
                ceknamaa = input.next();

                for (cekindex = 0; cekindex <= varadmin; cekindex++) {
                    if (nama_admin[cekindex] != null) {
                        if (ceknamaa.equals(nama_admin[cekindex])) {
                            ceksama = true;
                            break;
                        } else {
                            ceksama = false;
                        }
                    }
                }
            } while (ceksama);
            insertnamaa = ceknamaa;
            insert_kode();
    }
    
        // insert admin (kode)
    static void insert_kode() {
            do {
                ceksama = false;
                System.out.print("Kode Admin\t: ");
                cekkodea = input.next();

                for (cekindex = 0; cekindex <= varadmin; cekindex++) {
                    if (kode_admin[cekindex] != null) {
                        if (cekkodea.equals(kode_admin[cekindex])) {
                            ceksama = true;
                            break;
                        } else {
                            ceksama = false;
                        }
                    }
                }
            } while (ceksama);
            insertkodea = cekkodea;
            
            nama_admin[varadmin] = insertnamaa;
            kode_admin[varadmin] = insertkodea;
            varadmin++;
    }

        // delete admin
    static void delete_admin() {
            do{
                System.out.print("Delete Admin\t► ");
                deletesda = input.nextInt();
            } while (deletesda > varadmin || deletesda <= 0);
        
                for (int d = deletesda; d <= varadmin; d++) {
            nama_admin[d-1] = nama_admin[d];
            kode_admin[d-1] = kode_admin[d];
                }
            varadmin--;
            System.out.println("----------------------------------------------");
            System.out.println("Data admin telah dihapus!");
    }
    
        // MENU TRANSAKSI
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
            System.out.println("[02] Laporan                                 |");
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
                case 2:
                    laporan_transaksi();
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
    
        // beli snack
    static void beli_snack() {
            do {
                System.out.print("Beli Snack\t► ");
                inputarray = input.nextInt();
            } while (inputarray > varsnack || inputarray <= 0);
                
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
    
        // cek stok snack
    static void stok_snack() {
            System.out.println("----------------------------------------------");
            do {
                System.out.print("Input Jumlah\t► ");
                inputjumlah = input.nextInt();
            } while (inputjumlah <= 0);
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
    
        // total snack
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
            System.out.println("[01] Beli Lagi");
            System.out.println("[02] Bayar");
            System.out.println("[09] Batal");
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
                    System.out.println("----------------------------------------------");
                    menu_transaksi();
                    break;
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("Maaf! Menu tidak tersedia.");
                    beli_lagi();
                    break;
            }    
    }
    
        // beli softdrink
    static void beli_drink() {
            do {
                System.out.print("Beli Softdrink\t► ");
                inputarray = input.nextInt();
            } while (inputarray > vardrink || inputarray <= 0);
            
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
    
        // cek stok drink
    static void stok_drink() {
            System.out.println("----------------------------------------------");
            do {
                System.out.print("Input Jumlah\t► ");
                inputjumlah = input.nextInt();
            } while (inputjumlah <= 0);
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
    
        // total drink
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
            System.out.println("[01] Beli Lagi");
            System.out.println("[02] Bayar");
            System.out.println("[09] Batal");
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
    
        // beli lagi
    static void beli_lagi() {
            System.out.println("----------------------------------------------");
            System.out.println("==============================================");
            System.out.println("[01] Beli Snack");
            System.out.println("[02] Beli Softdrink");
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
            do {
                System.out.print("Input Admin\t► ");
                inputadmin = input.nextInt();
            } while (inputadmin > varadmin || inputadmin <= 0);
            
            for (b = 0; b < vartrans; b++) {
                totaltotal = totaltotal+totalsnackdrink[b];
            } 
            System.out.println("----------------------------------------------");
            System.out.println("Total Harga\t: "+totaltotal);
            cek_uang();
    }
    
        // cek uang pembayaran
    static void cek_uang() {        
            do { 
                System.out.print("Uang Pembayaran\t: ");
                inputbayar = input.nextInt();
            } while (inputbayar <= 0);
            rumuskembali = inputbayar-totaltotal;
            
            if (rumuskembali < 0) {
                System.out.println("----------------------------------------------");
                System.out.println("Uang tidak cukup!");
                System.out.println("----------------------------------------------");
                cek_uang();
            }
            else {
                System.out.println("Kembalian\t: "+rumuskembali);
                System.out.println("----------------------------------------------");
                nota_transaksi();
            }
    }
    
        // tanggal transaksi
    static String tanggal_trans() {  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            Date date = new Date();  
            return dateFormat.format(date);  
    }
    
        // waktu transaksi
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
            System.out.println("  Tgl. "+tanggal_trans()+" | "+waktu_trans());
            System.out.println("==============================================");
            System.out.println("       Kritik & Saran Hub Telp. 663619        ");
            System.out.println("                www.59mart.com                ");
            System.out.println("==============================================");
            
            lapadmin[varlap] = nama_admin[inputadmin-1];
            laptanggal[varlap] = tanggal_trans();
            lapwaktu[varlap] = waktu_trans();
            laptotal[varlap] = totaltotal;
            
            varlap++;        
    }
    
        // laporan transaksi
    static void laporan_transaksi(){
            System.out.println("==============================================");
            System.out.println("|             LAPORAN TRANSAKSI              |");
                for (int e = 1; e <= varlap; e++) {
            System.out.println("==============================================");
            System.out.println("     PENJUALAN TRANSAKSI 0"+e);
            System.out.println("==============================================");
            System.out.println("Admin Kasir\t\t: "+lapadmin[e-1]);
            System.out.println("Tanggal Transaksi\t: "+laptanggal[e-1]);
            System.out.println("Waktu Transaksi\t\t: "+lapwaktu[e-1]);
            System.out.println("Total Pendapatan\t: "+laptotal[e-1]+"\n");
        }
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
        
            nama_admin[0] = "DESY";
            nama_admin[1] = "NANCY";
            nama_admin[2] = "AHIN";
            kode_admin[0] = "217-359-001";
            kode_admin[1] = "217-359-002";
            kode_admin[2] = "217-359-003";
            
            System.out.println("        WELCOME TO LIMA SEMBILAN MART         ");

            menu_utama();
        }
    }
}