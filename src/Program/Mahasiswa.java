package Program;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mahasiswa {
   
    Scanner s = new Scanner (System.in);
     List <Mahasiswa> mahasiswas = new ArrayList<>();
    public String nim;
    public String nama;
    public float ipk;
  
    public Mahasiswa(String nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    public Mahasiswa (){
    
    }        
    //setter
    public void setNim(String nim ){
        this.nim=nim;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setIPK(float ipk) {
        this.ipk=ipk;
    }
    //getter
    public String getNim (){
        return nim;
    }
    public String getNama (){
        return nama;
    }
    public float getIPK (){
        return ipk;
    }
    
    protected void input (){
        String q=s.nextLine();
        System.out.print("Masukan NIM  : ");
        String Nim=s.nextLine(); 
        System.out.print("Masukan Nama : ");
        String Nama=s.nextLine();
        System.out.print("Masukan IPK  : "); 
        float Ipk=s.nextFloat();
        Mahasiswa m = new Mahasiswa(Nim, Nama, Ipk);
        mahasiswas.add(m);
    }
    protected void tampil (){
            if (mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        }
            System.out.println("-------------------------");
            int counter = 1;
            for (Mahasiswa mahasiswa : mahasiswas) {
                System.out.println("Data ke-"+counter);
                System.out.println("NIM : "+mahasiswa.getNim());
                System.out.println("Nama: "+mahasiswa.getNama());
                System.out.println("IPK : "+mahasiswa.getIPK());
                counter++;
            }
        }
    protected void sorting (){
     if(mahasiswas.isEmpty()){
                        System.out.println("Data masih kosong");
                    }
                    else {
                            int input=0;
                        do {                  
                            
                            System.out.println("");
                            System.out.println("--------------------------");
                            System.out.println("1. Sorting Nim");
                            System.out.println("2. Sorting Nama");
                            System.out.println("3. Sorting Ipk");
                            System.out.println("4. Kembali ke menu awal");
                            System.out.print("Masukan Pilihan: ");
                            input = s.nextInt();
                            s.nextLine();
                            switch (input) {
                                case 1:
                                    Collections.sort(mahasiswas , new  SortingNim());
                                    int counter = 1;;
                                    for (Mahasiswa mhs:mahasiswas) {
                                        System.out.println("-------------------------");
                                            System.out.println("Data ke-" + counter);
                                            System.out.println("NIM : " + mhs.getNim());
                                            System.out.println("Nama: " + mhs.getNama());
                                            System.out.println("IPK : " + mhs.getIPK());
                                            counter++;
                                }
                                break;
                                case 2:
                                    Collections.sort(mahasiswas , new SortingNama());
                                    counter = 1;
                                    for (Mahasiswa mhs:mahasiswas) {
                                        System.out.println("-------------------------");
                                        System.out.println("Data ke-" + counter);
                                        System.out.println("NIM : " + mhs.getNim());
                                        System.out.println("Nama: " + mhs.getNama());
                                        System.out.println("IPK : " + mhs.getIPK());
                                        counter++;
                                    }
                                    break;
                                case 3:
                                    Collections.sort(mahasiswas , new SortingIpk());
                                    counter = 1;
                                    for (Mahasiswa mhs:mahasiswas) {
                                        System.out.println("-------------------------");
                                        System.out.println("Data ke-" + counter);
                                        System.out.println("NIM : " + mhs.getNim());
                                        System.out.println("Nama: " + mhs.getNama());
                                        System.out.println("IPK : " + mhs.getIPK());
                                        counter++;
                                    }
                                    break;
                            }
                            
                    }while (input !=4);
            } 
    }
     @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + '}';
        }
     
}
                       
   

   

