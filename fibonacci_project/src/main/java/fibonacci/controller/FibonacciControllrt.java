package fibonacci.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fibonacci.calculate.FibonacciCalculate;
import fibonacci.model.RequestData;
import fibonacci.model.ResponseData;

@RestController
public class FibonacciControllrt {
	
	@PostMapping("/fibonacci")
	public ResponseData calculateFibonacci(@RequestBody RequestData data) {
		int num = data.getElements();
		List<Integer> fibonacci = null;
		List<Integer> sorted = null;
		
		if (num > 1 && num < 100) {
			fibonacci = FibonacciCalculate.getFibonacci(num);
	        sorted = FibonacciCalculate.getSorted(fibonacci);
		}
		
		return new ResponseData(fibonacci, sorted);
	}
	
}
