public class MahasiswaClass {
    String NIM;
    String Nama;
    String JenisKelamin;
    double IPK;
    int JumlahMahasiswa;
    double AverageofIPK = IPK / JumlahMahasiswa;
    public MahasiswaClass(String nama, String nim, String jenisKelamin, double ipk, int jumlahMahasiswa, double averageofipk) {
        Nama = nama;
        NIM = nim;
        JenisKelamin = jenisKelamin;
        IPK = ipk;
        JumlahMahasiswa = jumlahMahasiswa;
        AverageofIPK = averageofipk;
    }
    public void cetakBiodata() {
        System.out.println("Nama\t\t : " + (Nama) + "\nNIM\t\t : " + (NIM) 
        + "\nJenis Kelamin\t : " + (JenisKelamin) + "\nIPK\t\t : " + (IPK));
    }
    public void hitungAverage() {
        System.out.println("Rata Rata IPK : " + (AverageofIPK));
    }
}