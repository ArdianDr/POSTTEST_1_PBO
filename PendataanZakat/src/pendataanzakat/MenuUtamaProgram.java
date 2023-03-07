
package pendataanzakat;
import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class MenuUtamaProgram {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static DataZakat Zkt = new DataZakat();//OBJEK
    static ArrayList<DataZakat> ZktList;//ARRAYLIST
    
    public static void menu () throws IOException{
        Boolean ulang,ulang2;
        System.out.println("\tWELCOME\n");
        ulang = true;
        while (ulang) {
            menuAwal();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                menuKedua();
                    switch (admin){
                        case "1":
                            Zkt.tambahZakat();
                            break;
                        case "2":
                            Zkt.tampilData();
                            break;
                        case "3":
                            Zkt.ubahData(ZktList);
                            break;
                        case "4":
                            Zkt.hapusData();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String menuKedua (){
        System.out.println();
        System.out.println("Pilih Menu");
        System.out.println("1. Tambah Data Zakat");
        System.out.println("2. Tampilkan Data Zakat");
        System.out.println("3. Edit Data Zakat");
        System.out.println("4. Hapus Data Zakat");
        System.out.println("5. Kembali ke Menu Awal");
        System.out.println("6. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static String menuAwal (){
      System.out.println();
      System.out.println("Pendataan Zakat");
      System.out.println("1. Data Zakat");
      System.out.println("2. Exit Program");
      System.out.print("Masukan Pilihan menu : ");
      option = input.nextLine();
      return option;
    }


    public static void main(String[] args) throws IOException  {
       menu();
    }  
}
