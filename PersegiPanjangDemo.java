import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        PersegiPanjang[] ArrayofPersegiPanjang = new PersegiPanjang[3];
        for (int i = 0; i < 3; i++) {
            ArrayofPersegiPanjang[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang : " );
            ArrayofPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ArrayofPersegiPanjang[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Persegi panjang ke-" + (i + 1));
            ArrayofPersegiPanjang[i].cetakInfo();
        }
        PersegiPanjang[] myArrayofPersegiPanjang = new PersegiPanjang[100];
        myArrayofPersegiPanjang[5].panjang = 20;
    }
}