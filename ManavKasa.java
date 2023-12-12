import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int armutf = 28;
        int elmaf = 19;
        int domatesf = 20;
        int muzf = 39;
        int patlicanf = 25;

        double armutkg;
        double elmakg;
        double domateskg;
        double muzkg;
        double patlicankg;

        System.out.println("Kaç Kg Armut Aldınız : ");
        armutkg = scanner.nextDouble() * armutf;
        System.out.println("Kaç Kg Elma Aldınız : ");
        elmakg = scanner.nextDouble() * elmaf;
        System.out.println("Kaç Kg Domates Aldınız : ");
        domateskg = scanner.nextDouble() * domatesf;
        System.out.println("Kaç Kg Muz Aldınız : ");
        muzkg = scanner.nextDouble() * muzf;
        System.out.println("Kaç Kg Patlıcan Aldınız : ");
        patlicankg = scanner.nextDouble() * patlicanf;

        double toplam = armutkg +  elmakg + domateskg + muzkg + patlicankg;

        System.out.println("Ödemeniz Gereken Tutar : " + toplam);


        scanner.close();
    }
}
