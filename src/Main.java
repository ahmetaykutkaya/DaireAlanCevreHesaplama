import java.util.Scanner;


public class Main {
    public static void main(String[] args)

    {
        Scanner veri = new Scanner(System.in);
        int r ;
        double pi = 3.14 , alan , cevre ;

        System.out.print("Lutfen dairenin yari capini giriniz : " );
        r = veri.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("Dairenin alani =" + alan);
        System.out.println("Dairenin cevresi = "+ cevre);


    }
}