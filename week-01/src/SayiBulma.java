public class SayiBulma {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;

        for (int sayi:sayilar) {
            if (sayi == aranacak){
                System.out.println("Sayı mevcuttur.");
                break;
            }
        }

    }
}
