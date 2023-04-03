import java.util.Arrays;
import java.util.Scanner;

public class ArrayOlusturmaMethodu {


    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        /*
               Kullanicidan alinacak tamsayilar ile bir array olusturan ve bu arrayi bize
               donduren bir method yaziniz
         */

        System.out.println("\nGirilen tamsayilarla olusturulan arry : "+Arrays.toString(arrayOlustur()));

    }


    protected static int[] arrayOlustur() {
        int[] ilkArr = new int[0];
        int girilenSayi = 1;

        while (girilenSayi != 0) {
            System.out.print("\nArraye eklemek istediginiz pozitif/negatif tamsayiyi giriniz : " +
                    "\nIslemi sonlandirmak icin 0'a basiniz : ");

            girilenSayi = read.nextInt();

            if (girilenSayi != 0) {
                ilkArr = ArrayeElementEkle.elementEkle(ilkArr, girilenSayi);

            }

        }

        return ilkArr;
    }


}
