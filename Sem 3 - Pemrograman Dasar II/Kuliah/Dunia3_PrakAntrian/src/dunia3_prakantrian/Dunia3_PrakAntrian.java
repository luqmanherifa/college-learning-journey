package dunia3_prakantrian;

import java.util.Scanner;


/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakAntrian {

    public static void main(String[] args) {
        LinkedList linko = new LinkedList();
        Scanner inputsatu = new Scanner(System.in);
        Scanner inputdua = new Scanner(System.in);
        
        int a = 0;
        int choose;
        String nama;
        
        do {
            System.out.println("\n+====================================+");
            System.out.println("|           ANTRIAN APOTEK           |");
            System.out.println("+====================================+");
            System.out.println("[01] Tambah Antrian");
            System.out.println("[02] Hapus Antrian");
            System.out.println("[03] Lihat Antrian");
            System.out.println("[04] Exit");
            System.out.println("=====================================");
            
            System.out.print("Pilih menu anda\t: ");
            choose = inputsatu.nextInt();
            System.out.println("-------------------------------------");
            
            switch (choose) {
                case 1:
                    System.out.print("Input nama untuk ditambah: ");
                    nama = inputdua.next();
                    linko.push(new LinkedListNode(nama));
                    a = a+1;
                    break;
                case 2:
                    System.out.println("Daftar nama akan dihapus");
                    if (linko.size() >= 1) {
                        linko.print();
                        System.out.println("Nama yang di hapus");
                        System.out.println(linko.qpop().data);
                    } else if (linko.size() == 0) {
                        System.out.println("Data masih kosong!");
                    }
                    a = a+1;
                    break;
                case 3:
                    System.out.println("Daftar nama dalam antrian   : ");
                    linko.print();
                    System.out.println("Jumlah orang yang mengantri : ");
                    System.out.println(linko.size());
                    a = a+1;
                    break;
                case 4:
                    a = 0;
                    break;
                default:
                    System.out.println("Maaf! Menu "+choose+" tidak tersedia.");
                    break;
            }
        } while (a != 0);
        System.out.println("Anda telah keluar dari menu.");
        
    }
}