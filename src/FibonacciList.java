import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciList {

    public static void main(String[] args) {
        System.out.println(fiboSerisiOlustur());
    }


    protected static List<Integer> fiboSerisiOlustur() {
        Scanner read = new Scanner(System.in);

        List<Integer> fiboSerisi = new ArrayList<>();

        System.out.print("Kac tane Fibonacci sayisi gormek istiyorsunuz ? : ");
        int girilenSayi = read.nextInt();

        if (girilenSayi <= 0){
            System.out.println("Hatali Giris !!!");
        } else if (girilenSayi == 1) {
            fiboSerisi.add(0);
        } else if (girilenSayi == 2) {
            fiboSerisi.add(0);
            fiboSerisi.add(1);
        }else {

            int ilkSayi = 0;
            fiboSerisi.add(ilkSayi);
            int ikinciSayi = 1;
            fiboSerisi.add(ikinciSayi);
            int yeniSayi = ilkSayi+ikinciSayi;
            fiboSerisi.add(yeniSayi);

            while (fiboSerisi.size() < girilenSayi){
                ilkSayi = ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi = ilkSayi +ikinciSayi;
                fiboSerisi.add(yeniSayi);
            }



        }

        return fiboSerisi;
    }
}