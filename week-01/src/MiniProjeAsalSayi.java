import java.util.Scanner;

public class MiniProjeAsalSayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");

        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayi asal değildir.");
        }

        if (number < 2) {
            System.out.println("Geçersiz sayı!");
        }

        for (int i = 2; i < number; i++) {
            if (i % number == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayi asaldır.");
        } else {
            System.out.println("Sayi asal değildir.");
        }

    }
}
