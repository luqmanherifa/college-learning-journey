package dunia3_prakbinarytree;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakBinaryTree {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Tree binarytree = new Tree();
        
        int a = 0;
        int banyakangka, z, angkake, cari;
        
        while (true) {
            System.out.println("\n+=================================+");
            System.out.println("|           BINARY TREE           |");
            System.out.println("+=================================+");
            System.out.println("[01] Push");
            System.out.println("[02] Search");
            System.out.println("[03] Print");
            System.out.println("[04] Exit");
            System.out.println("==================================");
            
            System.out.print("Pilih menu anda\t: ");
            int choose = input.nextInt();
            System.out.println("----------------------------------");
            
            switch (choose) {
                case 1:
                    System.out.print("Input jumlah angka: ");
                    banyakangka = input.nextInt();
                    System.out.println("----------------------------------");
                    for (z=1; z<=banyakangka; z++) {
                        System.out.print("Input angka ke-"+z+": ");
                        angkake = input.nextInt();
                        binarytree.push(new TreeNode(angkake));
                    } break;
                case 2:
                    System.out.print("Input angka yang dicari: ");
                    cari = input.nextInt();
                    binarytree.search(new TreeNode(cari));
                    break;
                case 3:
                    binarytree.print();
                    break;
                case 4:
                    System.out.println("Anda telah keluar dari menu.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf! Menu "+choose+" tidak tersedia.");
                    break;
            }
        }
    }
}