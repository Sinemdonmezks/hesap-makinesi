import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b;
        System.out.print("Ilk sayiyi giriniz: ");
        a = input.nextDouble();
        System.out.print("Ikinci sayiyi giriniz: ");
        b = input.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminizi Giriniz:");
        int select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplama: " + (a+b));
                break;

            case 2:
                System.out.println("Çıkarma: " + (a-b));
                break;

            case 3:
                System.out.println("Çarpma: " + (a*b));
                break;

            case 4:
                System.out.println("Bölme: " + (a/b));
                break;

            default:
                System.out.println("Yanlış seçim yaptınız.");
                break;
        }
    }
}