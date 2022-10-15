public class LoopDemo {

    public static void main(String[] args) {

        // for loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        // while loop

        int i = 1;

        while (i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");

        // do-while döngüsü

        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println("Do-While döngüsü bitti");

    }
}
