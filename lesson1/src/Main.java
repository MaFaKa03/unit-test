import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //System.out.println(sum(2,Integer.MAX_VALUE));
        ny();
    }
    public static int sum(int a, int b){
        assert Integer.MAX_VALUE - Math.abs(a) >= Math.abs(b): ("Error: num is over");

        return a + b;
    }
    public static void ny(){
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String currentDateTime = dateFormat.format(calendar.getTime());

        assert currentDateTime.compareTo("2023/01/01") <= 0 : "Еще 2023 год :(";
        System.out.println("С новым годом!");
    }
}