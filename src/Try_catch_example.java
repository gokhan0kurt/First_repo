import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_example {
    /* Kullanicidan istedigi kadar tamsayi alip toplayin
     Kullanici Q'ya bastiginda islemi sonlandirip
     kac sayi girldigini ve toplamini yazdirin
     Q/q ya basmadiysa hata verip yeni degerle isleme devam edin

     */


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;
        int girilenSayi=0;

        System.out.println("\n\t\tGirilen Tamsayilari Topla");
        System.out.println("Islemi sonlandirip toplami gormek icin Q/q 'ya basiniz !!!\n");

        do {
            System.out.print("Toplamak uzere tamsayi giriniz : ");

            try {
                girilenSayi=read.nextInt();
                toplam += girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {

                String input = read.next().substring(0,1).toUpperCase();

                if (input.equals("Q")){
                    System.out.println(sayac+" adet tamsayinin toplami : "+toplam);
                    break;
                }else{
                    System.out.println("Isleme devam etmek icin tamsayi girmelisiniz" +
                            "\nSonlandirmak icin Q/q 'ya basiniz");
                }

            }

        }while(true);




    }


}
