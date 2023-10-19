import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static Main.Module.evenOddNumber;
import static Main.Module.numberInInterval;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TestHw3 {
    @ParameterizedTest
    @ValueSource(ints = {4,6,8})
    void testEvenOddNumberGetTrue(int num){
        assertThat(evenOddNumber(num)).isEqualTo(true);
    }
    @ParameterizedTest
    @ValueSource(ints = {3,1,9})
    void testEvenOddNumberGetFalse(int num){
        assertThat(evenOddNumber(num)).isEqualTo(false);
    }
    @ParameterizedTest
    @ValueSource(ints = {25, 99, 100, 77})
    void testNumberInIntervalGetTrue(int num){
        assertThat(numberInInterval(num)).isEqualTo(true);
    }
    @ParameterizedTest
    @ValueSource(ints = {24, 202, 101, 895})
    void testNumberInIntervalGetFalse(int num){
        assertThat(numberInInterval(num)).isEqualTo(false);
    }

}
