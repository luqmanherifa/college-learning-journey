package dunia3_checknrp;

import java.util.Scanner;

class Dunia3_CheckNRP {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //input nrp
        System.out.print("Input NRP Mahasiswa ► ");
        String nrp = input.nextLine();
        System.out.println("-----------------------------------");
        
        //deklarasi
        String angkatan = nrp.substring(0,2);
        String jenjang = nrp.substring(2,3);
        String prodi = nrp.substring(3,6);
        String nourut = nrp.substring(6,9);
        
        int cek_angkatan, cek_jenjang, cek_prodi, cek_no;
        
        //angkatan
        System.out.println("Angkatan\t: Tahun 20"+angkatan);
        
        //jenjang
        cek_jenjang = Integer.parseInt(jenjang);
        switch (cek_jenjang) {
                case 1:
                    System.out.println("Jenjang\t\t: S1");
                    break;
                case 2:
                    System.out.println("Jenjang\t\t: D3");
                    break;
                default:
                    System.out.println("Prodi\t\t: Tidak tersedia.");
                    break;
        }
         
        //prodi
        cek_prodi = Integer.parseInt(prodi);
        switch (cek_prodi) {
                case 111:
                    System.out.println("Prodi\t\t: Teknik Informatika");
                    break;
                case 222:
                    System.out.println("Prodi\t\t: Sistem Informasi");
                    break;
                case 333:
                    System.out.println("Prodi\t\t: Manajemen Informatika");
                    break;
                case 444:
                    System.out.println("Prodi\t\t: Desain dan Komunikasi Visual");
                    break;
                default:
                    System.out.println("Prodi\t\t: Tidak tersedia");
                    break;
        }
 
        //no urut
        System.out.println("No Urut\t\t: "+nourut);
        
    }
}
