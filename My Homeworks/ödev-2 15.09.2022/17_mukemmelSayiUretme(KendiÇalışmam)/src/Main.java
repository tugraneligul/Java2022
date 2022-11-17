public class Main {

    public static void main(String[] args) {
        int number = 0;


        for (int i = 2; i <= 20; i++) {
            boolean isPrime1 = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime1 = false;
                }
            }
            if (isPrime1) {
                double sayi = (Math.pow(2, i) - 1);
                boolean isPrime2 = true;
                for (int k = 2; k < sayi; k++) {

                    if (sayi % k == 0) {
                        isPrime2 = false;
                    }
                }
                if (isPrime2) {
                    int b = i - 1;
                    double c = Math.pow(2 , b);
                    double d = Math.pow(2 , i);
                    double e = d - 1;
                    double mukemmelSayı = c * e;
                    System.out.println("Mükemmel sayı : " + mukemmelSayı);
                }
            }
        }
    }
}

