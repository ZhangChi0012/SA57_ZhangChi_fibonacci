package fibonacci.calculate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonacciCalculate {
	public static List<Integer> getFibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            fibonacci.add(a);
            c = a + b;
            a = b;
            b = c;
        }
        return fibonacci;
    }

    public static List<Integer> getSorted(List<Integer> list) {
    	List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        
        for (int number : list) {
            if (number % 2 == 0) {
                evenList.add(number);
            } else {
                oddList.add(number);
            }
        }
        
        Collections.sort(evenList, Collections.reverseOrder());
        Collections.sort(oddList, Collections.reverseOrder());
        
        sortedList.addAll(evenList);
        sortedList.addAll(oddList);

        return sortedList;
    }
}
