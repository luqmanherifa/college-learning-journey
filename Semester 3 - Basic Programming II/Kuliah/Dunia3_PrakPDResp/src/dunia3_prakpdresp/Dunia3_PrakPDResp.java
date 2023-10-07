package dunia3_prakpdresp;

import java.util.Hashtable;
import java.util.Scanner;

public class Dunia3_PrakPDResp {

    public static void main(String[] args) {
        LinkedList linko = new LinkedList();
        Scanner inputsatu = new Scanner(System.in);
        Scanner inputdua = new Scanner(System.in);
        
        Hashtable<String,String> soal = new Hashtable<String,String>();
        
        //menginputkan data
        soal.put("Hewan yang hidup di air dan di darat?", "");
        soal.put("Sore menjelang malam disebut?", "");
        soal.put("Tempat untuk makan?", "");
        
        int a = 0;
        int choose;
        String jawaban;
        
        do {
            System.out.println("\n+====================================+");
            System.out.println("|          KUIS CAK LONTONG          |");
            System.out.println("+====================================+");
            System.out.println("[01] Lihat Soal");
            System.out.println("[02] Exit");
            System.out.println("=====================================");
            
            System.out.print("Pilih menu anda\t: ");
            choose = inputsatu.nextInt();
            System.out.println("-------------------------------------");
            
            switch (choose) {
                case 1:
                    System.out.println(soal);
                    System.out.print("Input jawaban: ");
                    jawaban = inputdua.next();
                    linko.push(new LinkedListNode(jawaban));
                    linko.print();
                    a = a+1;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Maaf! Menu "+choose+" tidak tersedia.");
                    break;
            }
        } while (a != 0);
        System.out.println("Anda telah keluar dari menu.");
        
    }
}