package pl.javastart.eulertwo.service;

import java.util.List;

public class CountEvenNumbersFibonacciService {
    public int countEvenNumbersSum(List<Integer> integerList){
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) % 2 == 0){
                sum += integerList.get(i);
            }
        }
        return sum;
    }
}
