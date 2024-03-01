import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class KamarClass {
    Scanner sc = new Scanner(System.in);
    Locale indonesia = new Locale("id", "ID");
    NumberFormat IDR = NumberFormat.getCurrencyInstance(indonesia);
    String TipeKamar;
    double HargaKamarSuite = 800000;
    double HargaKamarDeluxe = 400000;
    double HargaKamarStandard = 200000;
    String FasilitasKamar;
    int NomorKamar;
    String Nama;
    long NIK;
    double Saldo;
    String eMail;
    long NoHP;
    int OpsiKamar;
    int LamaMenginap;
    double TotalHarga;
    int JumlahTamu = sc.nextInt();
    public KamarClass (String tipekamar, double hargakamarsuite, double hargakamardeluxe, double hargakamarstandard, String fasilitaskamar, int nomorkamar, String nama, long nik, double saldo, String email, long nohp, int opsikamar, int lamamenginap, double totalharga) {
        TipeKamar = tipekamar;
        HargaKamarSuite = hargakamarsuite;
        HargaKamarDeluxe = hargakamardeluxe;
        HargaKamarStandard = hargakamarstandard;
        FasilitasKamar = fasilitaskamar;
        NomorKamar = nomorkamar;
        Nama = nama;
        NIK = nik;
        Saldo = saldo;
        eMail = email;
        NoHP = nohp;
        OpsiKamar = opsikamar;
        LamaMenginap = lamamenginap;
        TotalHarga = totalharga;
    }
    public void CetakStrukPembayaran() {
        if (OpsiKamar == 1) {
            TotalHarga = HargaKamarSuite * LamaMenginap;
            System.out.println("\n=============( STRUK PEMBAYARAN )=============\n");
            System.out.println("Nama\t\t : " + (Nama) + "\nNIK\t\t : " + (NIK) + "\nE-Mail\t\t : " 
            + (eMail) + "\nNomor Handphone\t : " + (NoHP) + "\nTipe Kamar\t\t : Suite" 
            + "\nHarga Kamar\t\t : " + (IDR.format(HargaKamarSuite)) + "Lama Menginap\t : " + (LamaMenginap) 
            + "Total Harga\t : " + (IDR.format(TotalHarga)));
            System.out.println("\n==============================================");
        }else if (OpsiKamar == 2) {
            TotalHarga = HargaKamarDeluxe * LamaMenginap;
            System.out.println("\n=============( STRUK PEMBAYARAN )=============\n");
            System.out.println("Nama\t\t : " + (Nama) + "\nNIK\t\t : " + (NIK) + "\nE-Mail\t\t : " 
            + (eMail) + "\nNomor Handphone\t : " + (NoHP) + "\nTipe Kamar\t\t : Deluxe" 
            + "\nHarga Kamar\t\t : " + (IDR.format(HargaKamarDeluxe)) + "Lama Menginap\t : " + (LamaMenginap) 
            + "Total Harga\t : " + (IDR.format(TotalHarga)));
            System.out.println("\n==============================================");
        }else if (OpsiKamar == 3) {
            TotalHarga = HargaKamarStandard * LamaMenginap;
            System.out.println("\n=============( STRUK PEMBAYARAN )=============\n");
            System.out.println("Nama\t\t : " + (Nama) + "\nNIK\t\t : " + (NIK) + "\nE-Mail\t\t : " 
            + (eMail) + "\nNomor Handphone\t : " + (NoHP) + "\nTipe Kamar\t\t : Standard" 
            + "\nHarga Kamar\t\t : " + (IDR.format(HargaKamarStandard)) + "Lama Menginap\t : " + (LamaMenginap) 
            + "Total Harga\t : " + (IDR.format(TotalHarga)));
            System.out.println("\n==============================================");
        }
    }
    public void CekKetersediaanKamar() {
        System.out.println("\n==============================================");
        System.out.println("\nKamar Tersedia");
        System.out.println("\n==============================================");
    }
    public void TambahLayananKamar() {
        System.out.println("\n==============================================");
        System.out.println("\nLayanan Tambahan Tidak Tersedia");
        System.out.println("\n==============================================");
    }
}