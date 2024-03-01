import java.util.Scanner;
public class TamuClass {
    Scanner sc = new Scanner(System.in);
    String Nama;
    long NIK;
    double Saldo;
    String eMail;
    long NoHP;
    public TamuClass(String nama, long nik, double saldo, String email, long nohp) {
        Nama = nama;
        NIK = nik;
        Saldo = saldo;
        eMail = email;
        NoHP = nohp;
    }
    public void PilihTipeKamar() {
        System.out.println("\n===============( DAFTAR KAMAR )===============\n \n1. Kamar Suite\n \n2. Kamar Deluxe\n \n3. Kamar Standard\n");
        System.out.println("==============================================");
        System.out.print("\nMasukkan Opsi Pilihan : ");
        int OpsiKamar = sc.nextInt();
    }
    public void LamaMenginap() {
        System.out.println("\n==============================================");
        System.out.print("\nLama Menginap\t      : ");
        int LamaMenginap = sc.nextInt();
        System.out.println("\n==============================================");
    }
    public void MetodeBayar() {
        System.out.println("\n===============( METODE BAYAR )===============\n \n1. Kartu Kredit\n \n2. Kartu Debit\n \n3. E-Wallet\n \n4. Tunai");
        System.out.println("\n==============================================");
        System.out.print("\nMasukkan Opsi Pilihan : ");
        int OpsiBayar = sc.nextInt();
    }
}