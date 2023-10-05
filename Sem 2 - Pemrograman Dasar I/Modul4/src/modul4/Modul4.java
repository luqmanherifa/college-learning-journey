/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Modul4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList2 a = new LinkedList2();
        Scanner sc = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("-----------------------");
            System.out.println("STACK AND QUEUE  DENGAN LINKEDLIST");
            System.out.println("[1] Push");
            System.out.println("[2] QPop");
            System.out.println("[3] SPop");
            System.out.println("[4] Print");
            System.out.println("[0] Exit");
            System.out.print("Pilih Menu\t: ");
            int menu = sc.nextInt();
            if (menu == 1) {
                int data;
                int jumlah_data;
                System.out.print("Masukkan Jumlah Data : ");
                jumlah_data = sc.nextInt();
                for (int i = 0; i < jumlah_data; i++) {
                    System.out.print("Masukkan Angkake "+(i+1)+ " : ");
                    data = sc.nextInt();
                    a.push(new LinkedListNode2(data));
                }
            } else if (menu == 2) {
                System.out.println("Angka yang di QPop :"+a.qpop().data);
                System.out.print("Hasil : ");
                a.print();
            } else if (menu == 3) {
                System.out.println("Angka yang di Spop :"+a.spop().data);
                System.out.print("Hasil : ");
                a.print();
            } else if (menu == 4) {
                System.out.print("Menampilkan Angka: ");
                a.print();
            } else if (menu == 0) {
                System.exit(0);
                kondisi = false;
            } else {
                System.out.println("Option tidak tersedia.");
            }
        }
    }
}