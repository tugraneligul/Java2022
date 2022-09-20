public class Main {

    public static void main(String[] args) {
        char grade = 'H';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Şartlı Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }

}