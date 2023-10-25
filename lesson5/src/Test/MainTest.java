package Test;

import number.MaxNumberModule;
import number.RandomNumberModule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import user.UserRepository;
import user.UserService;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @ParameterizedTest
    @ValueSource(ints = {5,8,20})
    void testRandom(int count){
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int [] testArray = randomNumberModule.randomNumbers(count);
        assertThat(testArray.length).isEqualTo(count);
    }
    @Test
    void testMax(){
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int[]array = {1,5,9,4};
        int max = maxNumberModule.maxNumbers(array);
        assertThat(max).isEqualTo(9);
    }
    @ParameterizedTest
    @ValueSource(ints = {5,8,20})
    void integrationTest(int count){
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int[] array = randomNumberModule.randomNumbers(count);
        Arrays.sort(array);
        int max = maxNumberModule.maxNumbers(array);
        assertEquals(max, array[count - 1]);

    }
    @Test
    void integrationTestUser(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        assertThat(userService.getUserName(1)).isEqualTo("User 1");
    }
}
