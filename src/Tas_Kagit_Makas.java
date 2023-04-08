import java.util.Random;
import java.util.Scanner;

public class Tas_Kagit_Makas {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rnd = new Random();

        int userChoice = 0;
        int compChoice = 0;

        int userPoint = 0;
        int compPoint = 0;

        System.out.println( "\n***** TAS-KAGIT-MAKAS *****");

        do {
            System.out.print("\n1-Tas  2-Kagit  3-Makas" +
                    "\nYukardakilerden birini sec : ");

            userChoice = read.nextInt();
            compChoice = rnd.nextInt(1, 4);

            if (userChoice == 1 && compChoice == 3) {

                System.out.println("Tas , makasi kirar. Kazandin :) ");
                userPoint++;
                System.out.println("Sen : " + userPoint + "\t\tBilgisayar : " + compPoint);
            } else if (userChoice == 1 && compChoice == 2) {
                System.out.println("Kagit,tasi sarar. Maalesef kaybettin :(");
                compPoint++;
                System.out.println("Sen : " + userPoint + "\t\tBilgisayar : " + compPoint);

            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println("Kagit,tasi sarar. Kazandin :)");
                userPoint++;
                System.out.println("Sen : " + userPoint + "\t\tBilgisayar : " + compPoint);

            } else if (userChoice == 2 && compChoice == 3) {
                System.out.println("Makas,kagidi keser. Maalesef kaybettin :(");
                compPoint++;
                System.out.println("Sen : " + userPoint + "\t\tBilgisayar : " + compPoint);

            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println("Makas,kagidi keser. Kazandin :)");
                userPoint++;
                System.out.println("Sen : " + userPoint + "\t\tBilgisayar : " + compPoint);

            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println("Tas , makasi kirar. Maalesef kaybettin :( ");
                compPoint++;
                System.out.println("Sen : " + userPoint + "\t\tBilgisayar : " + compPoint);

            } else {
                System.out.println("------ Berabere ------");
            }

        } while (userPoint != 5 && compPoint != 5);

        if (userPoint > compPoint){
            System.out.println("\n OYUNU KAZANDINIZ TEBRIKLER");
        }else System.out.println("\nKAYBETTINIZ");



    }



}
