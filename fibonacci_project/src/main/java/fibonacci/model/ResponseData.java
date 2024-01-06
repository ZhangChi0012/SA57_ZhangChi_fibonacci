package fibonacci.model;

import java.util.List;

public class ResponseData {
	private List<Integer> fibonacci;
	
    private List<Integer> sorted;
    
	public List<Integer> getFibonacci() {
		return fibonacci;
	}
	public void setFibonacci(List<Integer> fibonacci) {
		this.fibonacci = fibonacci;
	}
	public List<Integer> getSorted() {
		return sorted;
	}
	public void setSorted(List<Integer> sorted) {
		this.sorted = sorted;
	}
	public ResponseData(List<Integer> fibonacci, List<Integer> sorted) {
		super();
		this.fibonacci = fibonacci;
		this.sorted = sorted;
	}
    
}
