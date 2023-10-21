package Test;

import Main.User;
import Main.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static Main.SomeService.firstLast6;
import static Main.SomeService.fizzBuzz;
import static Main.UserRepository.addUser;
import static Main.UserRepository.logoutAllWithoutAdmin;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {
    @ParameterizedTest
    @ValueSource(ints = {5, 20, 55})
    void getBuzzTest(int i){
        assertThat(fizzBuzz(i)).isEqualTo("Buzz");
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 12, 9})
    void getFizzTest(int i){
        assertThat(fizzBuzz(i)).isEqualTo("Fizz");
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 225})
    void getFizzBuzzTest(int i){
        assertThat(fizzBuzz(i)).isEqualTo("FizzBuzz");
    }
    @ParameterizedTest
    @ValueSource(ints = {2, 1, 7})
    void getIntToString(int i){
        assertThat(fizzBuzz(i)).isEqualTo(Integer.toString(i));
    }
    @Test
    void testFirst6(){
        int[]array = {6, 1, 4, 5};
        assertThat(firstLast6(array)).isEqualTo(true);
    }
    @Test
    void testLast6(){
        int[]array = {1,4, 5,6};
        assertThat(firstLast6(array)).isEqualTo(true);
    }
    @Test
    void testMiddle6(){
        int[]array = {1,4,6,4,3};
        assertThat(firstLast6(array)).isEqualTo(false);
    }

    @Test
    void testGetTrue(){
        User user = new User("kostya","1234");
        assertThat(user.auth("kostya", "1234")).isEqualTo(true);
    }
    @Test
    void testGetFalse(){
        User user = new User("kostya","1234");
        assertThat(user.auth("volofya", "234")).isEqualTo(false);
    }
    @Test
    void testAddAuthUser(){
        User user = new User("kostya", "1234", false);
        UserRepository userRepository = new UserRepository();
        user.auth("kostya", "1234");
        addUser(user);
        assertThat(userRepository.getData()).contains(user);
    }
    @Test
    void testNotAddAuthUser(){
        User user = new User("kostya", "1234", false);
        UserRepository userRepository = new UserRepository();
        user.auth("kosta", "1234");
        addUser(user);
        assertThat(userRepository.getData()).doesNotContain(user);
    }
    @Test
    void testLogoutAllWithoutAdmin(){
        User user = new User("kostya", "1234", false);
        User user2 = new User("kirya", "1234", true);
        User user3 = new User("filip", "1234", false);
        UserRepository userRepository = new UserRepository();
        user.auth("kostya", "1234");
        user2.auth("kirya", "1234");
        user3.auth("filip", "1234");
        addUser(user);
        addUser(user2);
        addUser(user3);
        logoutAllWithoutAdmin();
        boolean flag = true;
        for (int i = 0; i < userRepository.getData().size(); i++) {
            if (!userRepository.getData().get(i).getIsAdmin()){
                flag = false;
                break;
            }
        assertTrue(flag);
        }

    }


}
