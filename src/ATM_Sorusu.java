import java.util.Scanner;

public class ATM_Sorusu {

     /*
        ATM
           Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
	       Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
	       Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
	       Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
	       Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
	       Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
	       Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali

    */


    static int bakiye = 10000;
    static Scanner sc = new Scanner(System.in);
    static String kullaniciSifre = "1903";
    static String kullaniciKartNo = "5437901246092215";

    public static void main(String[] args) {

        atmMenu();

    }

    public static void atmMenu(){

        System.out.print("Lutfen kart numaranizi giriniz : ");
        String kartNo = sc.nextLine();
        kartNo = kartNo.replace(" ", "");

        System.out.print("Lutfen kart sifrenizi giriniz : ");
        String sifre = sc.nextLine();

        boolean kartNoEsitMi = kullaniciKartNo.equals(kartNo);
        boolean sifreEsitMi = kullaniciSifre.equals(sifre);


        while (!kartNoEsitMi || !sifreEsitMi) {
            System.out.println("\nHatali giris yaptiniz !!! Lutfen tekrar deneyiniz\n");
            System.out.print("Lutfen kart numaranizi giriniz : ");
            kartNo = sc.nextLine();
            kartNo = kartNo.replace(" ", "");

            System.out.print("Lutfen kart sifrenizi giriniz : ");
            sifre = sc.nextLine();

            kartNoEsitMi = kullaniciKartNo.equals(kartNo);
            sifreEsitMi = kullaniciSifre.equals(sifre);

        }

        menuEkrani();
    }

    public static void menuEkrani (){
        System.out.println(" \n\n***** WISE BANK MUTLU GUNLER DILER *****\n\n" +
                "      ATM'den yapabileceginiz islemler : \n" +
                "1- Bakiye Sorgula\n" +
                "2- Para Yatirma\n" +
                "3- Para Cekme\n" +
                "4- Para Gonderme\n" +
                "5- Sifre Degistirme\n" +
                "6- Cikis");

        System.out.print("Lutfen islemi seciniz : ");
        int islemNo = sc.nextInt();

        switch (islemNo) {
            case 1:
                System.out.println("\nGuncel bakiye durumunuz : " + bakiye);
                menuEkrani();

            case 2:

                break;

            case 3:
                paraCekme();
                break;

            case 4:
                paraGonderme();
                break;

            case 5:
                sifreDegistir();
                break;

            case 6:
                System.out.println("\nCikis yaptiniz ! Isleminiz sonlandirildi");
                break;

            default:
                System.out.println("Hatali giris yaptiniz !!! Lutfen tekrar deneyin ");

        }

    }

    public static void paraCekme() {

        System.out.print("Lutfen cekmek istediginiz miktari giriniz : ");
        int cekilecekMiktar = sc.nextInt();

        if (bakiye < cekilecekMiktar){
            System.out.println("\nUzgunum, islem icin bakiyeniz yetersiz !");
            menuEkrani();
        }else {
            bakiye -= cekilecekMiktar;
            System.out.println("Para Cekme isleminiz tamamlandi, Kalan bakiyeniz : " + bakiye);
        }


    }

    public static void paraGonderme() {

        System.out.print("Lutfen gondermek istediginiz miktari giriniz : ");
        int gonderilecekMiktar = sc.nextInt();

        System.out.print("Lutfen gonderilecek hesabin IBAN nosunu giriniz : ");
        String ibanNo = sc.next();


        if (!ibanNo.startsWith("TR") || ibanNo.length() < 26) {
            System.out.println("\nHatali giris yapildi\n" +
                    "IBAN numarasi TR ile baslamali ve 26 karakter olmalidir");

            menuEkrani();

        } else {
            if (bakiye < gonderilecekMiktar){
                System.out.println("Uzgunum, islem icin bakiyeniz yetersiz !");
            }else {
                bakiye -= gonderilecekMiktar;
                System.out.println(ibanNo+" nolu hesaba "+gonderilecekMiktar+ " basariyla gonderildi");
                System.out.println("Para gonderim isleminden sonra kalan bakiyeniz : " + bakiye);
                menuEkrani();
            }
        }
    }

    public static void sifreDegistir() {
        System.out.print("Lutfen mevcut sifrenizi giriniz : ");
        String tempSifre = sc.next();

        while(!tempSifre.equals(kullaniciSifre)){
            System.out.println("Mevcut sifrenizi hatali girdiniz.Tekrar deneyiniz !");
            System.out.print("Lutfen mevcut sifrenizi giriniz : ");
            tempSifre = sc.next();
        }
        System.out.print("Simdi belirlemek istediginiz yeni sifreyi giriniz : ");
        kullaniciSifre = sc.next();

        System.out.println("Sifre degistirme isleminiz basariyla tamamlandi\n" +
                "Yeni sifreniz : "+kullaniciSifre);


    }




}
