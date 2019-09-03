package pl.javastart.eulertwo;
import pl.javastart.eulertwo.service.CountEvenNumbersFibonacciService;
import pl.javastart.eulertwo.service.FibonacciNumberListService;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int limit = 4000000;
        CountEvenNumbersFibonacciService countSumService = new CountEvenNumbersFibonacciService();
        FibonacciNumberListService numberListService = new FibonacciNumberListService();
        List<Integer> list = numberListService.createFibonacciNumber(limit);
        System.out.println("Suma parzystych elementów ciągu Fibonacciego poniżej " + limit
                + " wynosi " + countSumService.countEvenNumbersSum(list));
    }
}
