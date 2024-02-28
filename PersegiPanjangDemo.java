public class PersegiPanjangDemo {
    public static void main(String[] args) {
        PersegiPanjang[] ArrayofPersegiPanjang = new PersegiPanjang[3];
        ArrayofPersegiPanjang[0] = new PersegiPanjang();
        ArrayofPersegiPanjang[0].panjang = 110;
        ArrayofPersegiPanjang[0].lebar = 30;
        ArrayofPersegiPanjang[1] = new PersegiPanjang();
        ArrayofPersegiPanjang[1].panjang = 80;
        ArrayofPersegiPanjang[1].lebar = 40;
        ArrayofPersegiPanjang[2] = new PersegiPanjang();
        ArrayofPersegiPanjang[2].panjang = 100;
        ArrayofPersegiPanjang[2].lebar = 20;
        System.out.println("Persegi panjang ke-1, panjang : " + (ArrayofPersegiPanjang[0].panjang) + ", lebar : " + (ArrayofPersegiPanjang[0].lebar));
        System.out.println("Persegi panjang ke-2, panjang : " + (ArrayofPersegiPanjang[1].panjang) + ", lebar : " + (ArrayofPersegiPanjang[1].lebar));
        System.out.println("Persegi panjang ke-3, panjang : " + (ArrayofPersegiPanjang[2].panjang) + ", lebar : " + (ArrayofPersegiPanjang[2].lebar));
    }
}