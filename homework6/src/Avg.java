public class Avg {
    private static int[] array;
    private static int[] array2;

    public Avg(int[] array, int[] array2) {
        this.array = array;
        this.array2 = array2;
    }

    public static String equalsAvg() {
        double res = 0;
        double res2 = 0;
        String result1 = "Первый список имеет большее среднее значение";
        String result2 = "Второй список имеет большее среднее значение";
        String result3 = "Средние значения равны";
        String result4 = "Передан пустой массив";
        String message;
        if (array == null || array2 == null) {
            message = result4;
            System.out.println(result4);
        } else {
            for (int i = 0; i < array.length; i++) {
                res = res + array[i];
            }
            for (int i = 0; i < array2.length; i++) {
                res2 = res2 + array2[i];
            }
            if ((res / array.length) > (res2 / array2.length)) {
                message = result1;
                System.out.println(result1);

            } else if ((res / array.length) < (res2 / array2.length)) {
                message = result2;
                System.out.println(result2);
            } else {
                message = result3;
                System.out.println(result3);
            }

        }
        return message;
    }
   /* private void sumArray(int[] array, int[]array2){
        int res = 0;
        int res2 =0;
        for (int i = 0; i < array.length; i++) {
            res =res+array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            res2 = res2 + array2[i];
        }
    }

    */
}
