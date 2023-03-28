import java.util.Random;
import java.util.Scanner;

public class String_manipulation {

    public static void main(String[] args) {

        /*
                -Kullanicidan olusturmak istedigi sifreyi alin
                -Sifre icin asagidaki sartlari kontrol et
                    * ilk karakter kucuk harf olmali
                    * bosluk icermemeli
                    * uzunlugu en az 10 karakter olmali
                    * son karakter rakam olmali
                - uymayan sartlari ekranda uyari ver, sartlar saglandi ise "sifre basariyla kaydedildi" yazidirin

         */


        Scanner read = new Scanner(System.in);

        System.out.print("Lutfen kullanmak istediginiz sifreyi giriniz : ");
        String password = read.nextLine();

        int flag = 0;

        Random rnd = new Random(9);

        if ((password.charAt(0) >= 'a' && password.charAt(0) <= 'z')) {
            flag++;

        } else System.out.println("ilk harf kucuk olmali");

        if (!(password.contains(" "))) {
            flag++;
        } else System.out.println("sifre bosluk icermemeli");

        if (password.length() >= 10) {
            flag++;
        } else System.out.println("uzunlugu en az 10 karakter olmali");

        if (password.charAt(password.length() - 1) >= '0' && password.charAt(password.length() - 1) <= '9') {
            flag++;
        } else System.out.println("son karakter rakam olmali");

        if (flag == 4) System.out.println("\nsifreniz basariyla kaydedildi");


    }

}
