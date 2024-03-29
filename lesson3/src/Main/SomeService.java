package Main;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public static String fizzBuzz(int i) {
        if (((i % 3) == 0) && ((i % 5) == 0))
            return "FizzBuzz";
        else if ((i % 5) == 0)
            return "Buzz";
        else if ((i % 3) == 0 )
            return "Fizz";
        else return Integer.toString(i);
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public static boolean firstLast6(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 6 | nums[nums.length - 1] == 6)
                return true;

        }
        return false;
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {

        return purchaseAmount;
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */


}