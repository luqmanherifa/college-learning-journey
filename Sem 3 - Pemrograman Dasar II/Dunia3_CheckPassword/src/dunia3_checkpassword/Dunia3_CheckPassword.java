package dunia3_checkpassword;

import java.util.Scanner;

public class Dunia3_CheckPassword {
  
    static int panjang = 8, kar = 0, nom = 0;
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.println("   Program Cek Password");
        System.out.println("1. Password harus terdiri dari 8 karakter.");
        System.out.println("2. Password harus terdiri dari sebuah huruf.");
        System.out.println("3. Password harus terdiri dari sebuah angka.\n");
        
        
        System.out.print("Input password: ");
        String masuk = input.nextLine();
        
        if (test_password(masuk)) {
            System.out.println("Password "+masuk+". Berhasil.");
        } else {
            System.out.println("Password "+masuk+". Gagal!");
        }
    }
        
    static boolean test_password(String sandi) {
           
        if (sandi.length() < panjang) return false;
            
        for(int i=0; i<sandi.length(); i++) {
                
            char kt = sandi.charAt(i);

            if (angka(kt)) nom++;
            else if (huruf(kt)) kar++;
            else return false;  
        }
            return (kar >= 2 && nom >= 2);
    }
    
    static boolean huruf(char kt) {
        kt = Character.toUpperCase(kt);
        return (kt >= 'A' && kt <= 'Z');
    }
        
    static boolean angka(char kt) {
        return (kt >= '0' && kt <= '9');
    }
    
}
    
