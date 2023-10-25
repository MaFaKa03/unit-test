package number;

import java.util.Random;

public class RandomNumberModule {
    public int[] randomNumbers(int count) {
        int[] array = new int[count];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

}
