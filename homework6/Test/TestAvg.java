import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestAvg {
    @Test
    void avgTestFirstMoreThenSecond(){
        int[] array1 = {5,7,9,10};
        int[] array2 = {6,1,5,3};
        Avg avg = new Avg(array1, array2);
        assertThat(avg.equalsAvg()).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    void avgTestSecondMoreThenFirst(){
        int[] array1 = {5,7,9,10};
        int[] array2 = {6,1,5,30};
        Avg avg = new Avg(array1, array2);
        assertThat(avg.equalsAvg()).isEqualTo("Второй список имеет большее среднее значение");
    }
    @Test
    void avgTestFirstEqualsSecond(){
        int[] array1 = {5,7,9,10};
        int[] array2 = {6,1,5,19};
        Avg avg = new Avg(array1, array2);
        assertThat(avg.equalsAvg()).isEqualTo("Средние значения равны");
    }
    @Test
    void avgTestArrayIsNull(){
        int[] array1 = null;
        int[] array2 = {1,7,8,9};
        Avg avg = new Avg(array1, array2);
        assertThat(avg.equalsAvg()).isEqualTo("Передан пустой массив");
    }




}
