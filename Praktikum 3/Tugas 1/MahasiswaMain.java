import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        String NIM, Nama, JenisKelamin;
        double IPK, AverageofIPK;
        AverageofIPK = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int JumlahMahasiswa = sc.nextInt();
        MahasiswaClass[] ArrayOfMahasiswa = new MahasiswaClass[JumlahMahasiswa];
        for (int i = 0; i < ArrayOfMahasiswa.length; i++) {
            System.out.println("--------------------------------------------");
            System.out.println("Mahasiswa Ke-" + (i + 1));
            sc.nextLine();
            System.out.print("Nama\t\t : ");
            Nama = sc.nextLine();
            System.out.print("NIM\t\t : ");
            NIM = sc.nextLine();
            System.out.print("Jenis Kelamin\t : ");
            JenisKelamin = sc.nextLine();
            System.out.print("IPK\t\t : ");
            IPK = sc.nextDouble();
            ArrayOfMahasiswa[i] = new MahasiswaClass(Nama, NIM, JenisKelamin, IPK, JumlahMahasiswa, AverageofIPK);
            System.out.println("--------------------------------------------");
        }
        double TotalIPK = 0;
        for (int i = 0; i < ArrayOfMahasiswa.length; i++) {
            System.out.println("============================================");
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            ArrayOfMahasiswa[i].cetakBiodata(); 
            TotalIPK += ArrayOfMahasiswa[i].IPK;
            System.out.println("============================================");
        }
        AverageofIPK = TotalIPK / JumlahMahasiswa;
        System.out.println("============================================");
        System.out.println("Rata-Rata IPK\t : " + (AverageofIPK));
        System.out.println("============================================");
    }
}