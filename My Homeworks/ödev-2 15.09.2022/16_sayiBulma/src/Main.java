public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean isExist=false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                isExist=true;
                break;
            }
        }
        if(isExist){
            System.out.println("Sayı dizide mevcuttur.");
        }else {
            System.out.println("Sayı dizide mevcut değildir.");
        }
    }
}

