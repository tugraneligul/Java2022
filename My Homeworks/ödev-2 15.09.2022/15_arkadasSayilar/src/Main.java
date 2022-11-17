/*public class Main {

    public static void main(String[] args) {
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;

        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }
        if(toplam1==sayi2) {
            for (int j = 1; j < sayi2; j++) {
                if (sayi2 % j == 0) {
                    toplam2 = toplam2 + j;
                }
            }
            if (toplam2 == sayi1) {
                System.out.println("Sayılar kardeş sayıdır.");
            }else {
                System.out.println("Sayılar kardeş sayı değildir.");
            }
        }else {
            System.out.println("Sayılar kardeş sayı değildir.");
        }
    }

} */ //BENİM YÖNTEMİM.

// HOCANIN VE BENİM BİLDİĞİM 2. YÖNTEM

public class Main {

    public static void main(String[] args){

        int sayi1=8;
        int sayi2=7;
        int toplam1=0;
        int toplam2=0;

        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }
        for(int j=1;j<sayi2;j++){
            if(sayi2%j==0){
                toplam2=toplam2+j;
            }
        }

        if(toplam1==sayi2 && toplam2==sayi1){
            System.out.println("Sayılar kardeş sayılardır.");
        }else {
            System.out.println("Sayılar kardeş sayı değildir.");
        }
    }

}