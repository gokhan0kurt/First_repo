import java.util.Arrays;
import java.util.Scanner;

public class C_farkYaratMethodu {


    /*

         Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
         büyük öğeler arasındaki farkı yazdiran bir metod olusturunuz.

     */


    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

    farkYarat();

    }

    protected static void farkYarat(){

        System.out.print("Kac tane tamsayi gireceksiniz : ");
        int adet = read.nextInt();

        int [] arr = new int[adet];

        for (int i = 1; i <= arr.length ; i++) {

            System.out.print(i +". tamsayiyi giriniz : ");

            arr[i-1] = read.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int fark = arr[arr.length-1] - arr[0];

        System.out.println("fark = " + fark);


    }



}
