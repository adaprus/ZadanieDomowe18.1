package pl.javastart.eulertwo.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class FibonacciNumberListServiceTest {
    private FibonacciNumberListService underTest;

    @BeforeEach
    void setUp() {
        underTest = new FibonacciNumberListService();
    }

    @Test
    void whenLimitIsTwo_shouldBeOneOne() {
        //given
        int limit = 2;
        List<Integer> expectedList = Arrays.asList(1,1);

        //when
        List<Integer> result = underTest.createFibonacciNumber(limit);

        //then
        assertThat(result).isEqualTo(expectedList);
    }

    @Test
    void whenLimitIsThree_shouldBeOneOneTwo() {
        //given
        int limit = 3;
        List<Integer> expectedList = Arrays.asList(1,1,2);

        //when
        List<Integer> result = underTest.createFibonacciNumber(limit);

        //then
        assertThat(result).isEqualTo(expectedList);
    }

    @Test
    void whenLimitIsFive_shouldBeOneOneTwoThree() {
        //given
        int limit = 5;
        List<Integer> expectedList = Arrays.asList(1,1,2,3);

        //when
        List<Integer> result = underTest.createFibonacciNumber(limit);

        //then
        assertThat(result).isEqualTo(expectedList);
    }

    @Test
    void whenLimitIsSix_shouldBeOneOneTwoThreeFive() {
        //given
        int limit = 6;
        List<Integer> expectedList = Arrays.asList(1,1,2,3,5);

        //when
        List<Integer> result = underTest.createFibonacciNumber(limit);

        //then
        assertThat(result).isEqualTo(expectedList);
    }
}