package pendataanzakat;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataZakat {
    private final String KodeZkt = "Zkt";
    private long noKodeZkt;
    protected String namaZakat, tanggal,Gender;
    public int nominal;
    
DataZakat(String namaZakat, int nominal, String tanggal, String Gender, long noKodeZkt){
    this.namaZakat = namaZakat;
    this.nominal = nominal;
    this.tanggal = tanggal;
    this.Gender = Gender;
    this.noKodeZkt = noKodeZkt;
}
    
    DataZakat() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    public String getKodeZkt() {
        return KodeZkt;
    }

    public long getnoKodeZkt() {
        return noKodeZkt;
    }

    public String getnamaZakat() {
        return namaZakat;
    }


    public int getnominal() {
        return nominal;
    }
  

    public String getGender() {
        return Gender;
    }
    

    public DataZakat getZkt() {
        return Zkt;
    }

    public ArrayList<DataZakat> getZktList() {
        return ZktList;
    }

    public Scanner getInp() {
        return inp;
    }

    public Scanner getInputInt() {
        return inputInt;
    }
    
    DataZakat Zkt;
    ArrayList<DataZakat> ZktList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    protected void tambahZakat() throws IOException{
//        boolean ulang=true;
        System.out.println("\nMenambahkan Data Zakat\n");
        System.out.print("Nama Pembayar Zakat : ");
        namaZakat = inp.nextLine();
        System.out.print("Nominal  : ");
        nominal = Integer.parseInt(br.readLine());
        System.out.print("Tanggal : ");
        tanggal = inp.nextLine();
        System.out.print("Gender : ");
        Gender = inp.nextLine();
        noKodeZkt++;
        System.out.println("No Kode Zakat : " + KodeZkt + noKodeZkt);
        Zkt = new DataZakat(namaZakat, nominal, tanggal, Gender, noKodeZkt); // OBJEK ke - 1
        ZktList.add(Zkt);
        System.out.println("\n>> Tambah Data Zakat Berhasil <<");
}
    
    protected void tampilData(){
        System.out.println("\nMenampilkan Data Zakat \n");
        for (int i=0; i<ZktList.size(); i++){
            System.out.println("No Kode Zakat : " + KodeZkt + ZktList.get(i).getnoKodeZkt());
            System.out.println("Nama : " + ZktList.get(i).getnamaZakat());
            System.out.println("Nominal  : Rp " + ZktList.get(i).getnominal());
            System.out.println("Tanggal: " + ZktList.get(i).gettanggal());
            System.out.println("Gender: " + ZktList.get(i).getGender());
            System.out.println(" ");
        }
    }
    
    public ArrayList<DataZakat> ubahData(ArrayList<DataZakat> ZktList) {
        int ubah;
        System.out.println("\nMengubah Data Zakat\n");
        for (int i=0; i<ZktList.size(); i++){
            System.out.println("No Kode Zakat : " + KodeZkt +
            ZktList.get(i).getnoKodeZkt());
            System.out.println("Nama Peralatan : " + ZktList.get(i).getnamaZakat());
            System.out.println(" ");
        }
        if (ZktList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama : ");
        ZktList.get(ubah).namaZakat = (inp.nextLine());
        System.out.print("Ubah Nominal : ");
        ZktList.get(ubah).nominal = inputInt.nextInt();
        System.out.print("Ubah Tanggal : ");
        ZktList.get(ubah).tanggal = (inp.nextLine());
        System.out.print("Ubah Gender : ");
        ZktList.get(ubah).Gender = (inp.nextLine());
        System.out.println("\n>> Data Zakat Berhasil Di Ubah <<\n");


        return ZktList;
    }
    
    public void hapusData() {
        System.out.println("\nMenghapus Data Zakat\n");
        for (int i=0; i<ZktList.size(); i++){
            System.out.println("No Kode Zakat : " + KodeZkt +
            ZktList.get(i).getnoKodeZkt());
            System.out.println("Nama  : " + ZktList.get(i).getnamaZakat());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Data Zakat [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        ZktList.remove(hapus);
        System.out.println("\n>> Data Zakat Berhasil di Hapus <<\n");
    }   

//    private String gettanggal() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private String gettanggal(){
        throw new UnsupportedOperationException("Not supported"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
