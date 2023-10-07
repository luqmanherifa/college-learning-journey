package dunia3_checkpassword2;

import java.util.Scanner;

public class Dunia3_CheckPassword2 {

    public static void main(String[] args) {
        
        //scanner input
        Scanner input = new Scanner (System.in);
       
        //deklarasi
        String password, cek_angka, cek_simbol, cek_hurufb;
        
        System.out.println("   PROGRAM CEK PASSWORD");
        System.out.println("1. Password harus terdiri dari 8 karakter.");
        System.out.println("2. Password harus terdiri dari sebuah simbol.");
        System.out.println("3. Password harus terdiri dari sebuah angka.");
        System.out.println("3. Password harus terdiri dari sebuah huruf besar.");
        
        System.out.println("-----------------------------------");
        System.out.print("Input password\t: ");
        password = input.nextLine();
        System.out.println("-----------------------------------");
        
        //char
            if (password.length()<8) {
                System.out.println("Jumlah karakter (kurang dari 8)\t☒");
            } else if (password.length()>=22) {
                System.out.println("Jumlah karakter (lebih dari 22)\t☒");
            } else {
                System.out.println("Jumlah karakter\t\t\t☑");
            }
        
        //symbol
        cek_simbol = password.replaceAll("[a-zA-Z0-9]","");
            if (cek_simbol.length()<1) {
                System.out.println("Karakter simbol\t\t\t☒");
            } else {
                System.out.println("Karakter simbol\t\t\t☑");
            }    
            
        //number
        cek_angka = password.replaceAll("[a-zA-Z!@#$%^&*()]","");
            if (cek_angka.length()<1) {
                System.out.println("Karakter angka\t\t\t☒");
            } else {
                System.out.println("Karakter angka\t\t\t☑");
            }
            
        
            
        //uppercase
            int count = password.length();
            int c = 0;
            String a = null;
            
            for (int b=0; b<count; b++) {
                if (Character.isUpperCase(password.charAt(b))) {
                    c++;
                            
                    char d = password.charAt(b);
                    a = a+d+"";
                }
            }
            
            if (c==0) {
                System.out.println("Karakter uppercase\t\t☒");
            } else {
                System.out.println("Karakter uppercase\t\t☑");
            }
            
    }
}