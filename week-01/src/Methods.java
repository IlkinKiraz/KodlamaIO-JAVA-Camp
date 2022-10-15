public class Methods {

    public static void sayiBul() {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;

        for (int sayi:sayilar) {
            if (sayi == aranacak){
                System.out.println("Sayı mevcuttur.");
                break;
            }
        }
    }

    public static void sayiBul2(int aranacakSayi) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = aranacakSayi;

        for (int sayi:sayilar) {
            if (sayi == aranacak){
                System.out.println("Sayı mevcuttur.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        sayiBul();
        sayiBul2(5);
    }
}
