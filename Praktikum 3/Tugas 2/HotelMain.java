import java.util.Scanner;
public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nama = null;
        long NIK = 0;
        double Saldo = 0;
        String eMail = null;
        long NoHP = 0;
        String TipeKamar = null;
        double HargaKamarSuite = 800000;
        double HargaKamarDeluxe = 400000;
        double HargaKamarStandard = 200000;
        String FasilitasKamar = null;
        int NomorKamar = 0;
        int OpsiKamar = 0;
        int LamaMenginap = 0;
        double TotalHarga = 0;
        System.out.println("\n==============================================");
        System.out.print("\nMasukkan Jumlah Tamu : ");
        int JumlahTamu = sc.nextInt();
        System.out.println("\n==============================================");
        TamuClass[] ArrayOfTamuClass = new TamuClass[JumlahTamu];
        KamarClass[] ArrayOfKamarClass = new KamarClass[JumlahTamu];
        for (int i = 0; i < ArrayOfTamuClass.length; i++) {
            System.out.println("\n==============================================");
            System.out.println("\nTamu Ke-" + (i + 1));
            sc.nextLine();
            System.out.print("\nNama\t\t : ");
            Nama = sc.nextLine();
            System.out.print("\nNIK\t\t : ");
            NIK = sc.nextLong();
            System.out.print("\nE-Mail\t\t : ");
            eMail = sc.next();
            System.out.print("\nNomor Handphone\t : ");
            NoHP = sc.nextLong();
            System.out.println("\n==============================================");
            ArrayOfTamuClass[i] = new TamuClass(Nama, NIK, Saldo, eMail, NoHP);
            ArrayOfTamuClass[i].PilihTipeKamar();
            ArrayOfTamuClass[i].LamaMenginap();
            ArrayOfTamuClass[i].MetodeBayar();
        }
        for (int i = 0; i < ArrayOfTamuClass.length; i++) {
            ArrayOfKamarClass[i] = new KamarClass(TipeKamar, HargaKamarSuite, HargaKamarDeluxe, HargaKamarStandard, FasilitasKamar, NomorKamar, Nama, NIK, Saldo, eMail, NoHP, OpsiKamar, LamaMenginap, TotalHarga);
            ArrayOfKamarClass[i].CetakStrukPembayaran();
            ArrayOfKamarClass[i].CekKetersediaanKamar();
            ArrayOfKamarClass[i].TambahLayananKamar();
        }
    }
}