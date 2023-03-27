import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav_Sorusu {


      /*
		 *
		 * 1. Adim: urunler ve fiyatlari gosteren listeleri olusturunuz.
		 * 			No 	   urun 		  Fiyapt
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Sogan      	 2.30 TL
					04	 Havuc     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Cilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 uzum      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adim: Kullanicinin urun nosuna gore listeden urun secmesini isteyiniz.
		 * 3. Adim: Kac kg satin almak istedigini sorunuz.
		 * 4. Adim: Alinacak bu urunu sepete ekleyiniz ve Sepeti yazdiriniz.
		 * 5. Baska bir urun alip almak istemedigini sorunuz.
		 * 6. Eger devam etmek istiyorsa yeniden urun secme kismina yonlendiriniz.
		 * 7. Eger bitirmek istiyorsa odeme kismina geciniz ve odeme sonrasinda programi bitirinzi.
		 */


    public static void main(String[] args) {
        //  {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "uzum", "Limon"};
        //{2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};

        manavaGit();
    }

    public static void manavaGit() {

        Scanner sc = new Scanner(System.in);

        String[] urunler = {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "uzum", "Limon"};
        Double[] fiyatlar = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};

        List<String> urunListesi = new ArrayList<>();
        List<Double> fiyatListesi = new ArrayList<>();

        List<String> sepet =new ArrayList<>();

        for (String each:urunler) {
            if (!urunListesi.contains(each)) urunListesi.add(each);

        }

        for (Double each:fiyatlar) {
            if (!fiyatListesi.contains(each)) fiyatListesi.add(each);
        }

        // System.out.println(urunListesi);  [Domates, Patates, Biber, Sogan, Havuc, Elma, Muz, Cilek, Kavun, uzum, Limon]
        // System.out.println(fiyatListesi); [2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5]


        System.out.println(" *******  MANAV REYONUNA HOSGELDINIZ  *******\n");

        System.out.println(" No 	   urun 		  Fiyat\n====	 =======	 	=========");
        for (int i = 0; i < urunListesi.size() ; i++) {

            System.out.println(i + "\t\t " + urunListesi.get(i) + "\t\t\t" + fiyatListesi.get(i));
        }

        String giris ="";
        double odenecekTutar =0;

        do {
            System.out.print("\nAlmak istediginiz urun no.'yu giriniz : ");
            int urunNo = sc.nextInt();

            System.out.print("\nKac kilogram almak istiyorsunuz ? (2,5 kg vb.) : ");
            double miktar = sc.nextDouble();

            sepet.add(urunListesi.get(urunNo));
            System.out.println("Sepetinizde bulunan urunler : "+ sepet);

            odenecekTutar += miktar * fiyatListesi.get(urunNo);

            System.out.print("\nManav alisverisine devam etmek istiyor musunuz ? (E/H) : ");
            giris = sc.next().substring(0,1);
            giris = giris.toUpperCase();

        }while (giris.equals("E"));

        System.out.println("\nOdenecek Tutar : "+odenecekTutar + " TL"+
                "\nIyi gunler diler yine bekleriz" );





    }


}




