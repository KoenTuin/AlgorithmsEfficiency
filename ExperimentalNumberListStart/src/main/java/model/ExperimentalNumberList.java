package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperimentalNumberList {
	private int[] numberList;
	private int numberOfElements;
	private int minimumValue;
	private int maximumValue;
	
	
	public ExperimentalNumberList(int numberOfElements) {
		super();
		this.numberOfElements = numberOfElements;
		this.numberList = new int[numberOfElements];
	}

	public void generateNumbers(int min, int max) {
		this.minimumValue = min;
		this.maximumValue = max;
		// the range of the random numbers is max - min + 1 (from 17 upto 41 makes 25 numbers to choose from)
		for (int i = 0; i < numberOfElements; i++) {
			this.numberList[i] = (int) (min + Math.random() * (max - min + 1));
		}
	}
	

	public List<Integer> getNumbersAsList() {
		List<Integer> resultList = new ArrayList<>();
		for (Integer i : numberList) {
			resultList.add(i);
		}
		return resultList;
	}
	
	public String toString() {
		return Arrays.toString(this.numberList);
	}

}
