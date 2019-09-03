package pl.javastart.eulertwo.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class CountEvenNumbersFibonacciServiceTest {
    private CountEvenNumbersFibonacciService service;

    @BeforeEach
    void setUp() {
         service = new CountEvenNumbersFibonacciService();
    }

    @Test
    void whenLimitIsFive_shouldBeTwo() {
        //given
        int expectedResult = 2;
        List<Integer> list;
        list = Arrays.asList(1,1,2,3);

        //when
        int result = service.countEvenNumbersSum(list);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenLimitIsNine_shouldBeTen() {
        //given
        int expectedResult = 10;
        List<Integer> list;
        list = Arrays.asList(1,1,2,3,5,8);

        //when
        int result = service.countEvenNumbersSum(list);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenLimitIsFourteen_shouldBeTen() {
        //given
        int expectedResult = 10;
        List<Integer> list;
        list = Arrays.asList(1,1,2,3,5,8,13);

        //when
        int result = service.countEvenNumbersSum(list);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenLimitIsThirtyFive_shouldBeFortyFour() {
        //given
        int expectedResult = 44;
        List<Integer> list;
        list = Arrays.asList(1,1,2,3,5,8,13,21,34);

        //when
        int result = service.countEvenNumbersSum(list);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}