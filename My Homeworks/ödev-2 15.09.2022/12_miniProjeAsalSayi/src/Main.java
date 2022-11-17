/*public class Main {

    public static void main(String[] args) {

        int number = 1;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
        } else if (number < 1) {
            System.out.println("Geçersiz sayı");
        } else {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Sayı asaldır");
            } else {
                System.out.println("Sayı asal değildir");
            }
        }
    }
}*/
public class Main {

    public static void main(String[] args) {
        int number = 8191;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }

}