public class ArrayeElementEkle {




    protected static int [] elementEkle (int [] gelenArr , int eklenecekElement ){

        int [] bosArr = new int[gelenArr.length+1];

        for (int i = 0; i < gelenArr.length ; i++) {
            bosArr[i] = gelenArr[i];
        }

        bosArr[bosArr.length-1] = eklenecekElement;

        gelenArr = bosArr;
        return gelenArr;
    }
}
