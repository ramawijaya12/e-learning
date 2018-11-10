package Program;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Mahasiswa MHS  = new Mahasiswa();
        int pilih=0;
        do{
        System.out.println("Tugas Tentang Class Object ");
        System.out.println("---------------------------");
        System.out.println("1. Input Data ");
        System.out.println("2. Tampil Data ");
        System.out.println("3. Sorting Data ");
        System.out.println("4. Keluar ");
        System.out.print(" Masukan Pilihan = "); pilih=s.nextInt();
            
        switch (pilih){
            case 1 :
             MHS.input();
             break;
            case 2 :
             MHS.tampil();
             break;
            case 3:
             MHS.sorting();
             break;
            case 4:
                System.exit (0);
            break;
              
            }
         } while (pilih !=4);
    }
}