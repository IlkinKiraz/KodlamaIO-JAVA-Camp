public class RecapDemo1 {

    public static void main(String[] args) {

        int number1 = 35;
        int number2 = 19;
        int number3 = 20;
        int checkNumber = number1;

        if (checkNumber < number2) {
            checkNumber = number2;
        }

        if (checkNumber < number3) {
            checkNumber = number3;
        }

        System.out.println(checkNumber + " greater than other numbers.");

    }
}
