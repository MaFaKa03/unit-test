package Main;

public class Module {
    public static boolean evenOddNumber(int num){
        if (num % 2 == 0)
            return true;
        else return false;
    }
    public static boolean numberInInterval(int num){
        if ((25 - num) <= 0 && (100 - num) >= 0)
            return true;
        else return false;
    }
}
