package pl.javastart.eulertwo.service;
import java.util.ArrayList;
import java.util.List;

public class FibonacciNumberListService {
    public List<Integer> createFibonacciNumber(int limit) {
        List<Integer> fibonacciNumber = new ArrayList<Integer>();
        fibonacciNumber.add(1);
        fibonacciNumber.add(1);
        int value = fibonacciNumber.get(0) + fibonacciNumber.get(1);
        int i = 2;

        while (value < limit) {
            fibonacciNumber.add(value);
            i++;
            value = fibonacciNumber.get(i - 2) + fibonacciNumber.get(i - 1);
        }
        return fibonacciNumber;
    }
}