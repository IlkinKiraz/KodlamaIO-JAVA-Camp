public class Methods2 {

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {

        int toplam = 0;

        for (int sayi:sayilar) {
            toplam += sayi;
        }

        return toplam;
    }

    public static void main(String[] args) {
        int toplam = topla(5, 9);
        System.out.println(toplam);

        toplam = topla2(5, 9, 6, 3);
        System.out.println(toplam);
    }
}
