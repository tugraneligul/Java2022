public class Main {

    public static void main(String[] args) {
        int number = 33550336;
        int counter = 0;

        if(number==1){
            System.out.println("Sayı mükemmel değildir");
            return;
        }
        if(number<1){
            System.out.println("Sayı geçersizdir");
            return;
        }
        for(int i=1;i<=number;i++)
            if(number%i==0){
                counter = counter+i;
            }
        if(counter%number==0){
            System.out.println("Sayı mükemmel sayıdır");
        }else{
            System.out.println("Sayı mükemmel sayı değildir");
        }
    }
}