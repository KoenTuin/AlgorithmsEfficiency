/**
 * Authors: Koen van der Tuin and Youri Pelicaan
 */

package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

	public boolean equalValuesExist(){
		if(numberList.equals(1)){}
		return true;
	}

	public int countPositives(){
		int positive = 0;
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] >= 0 ){
				 positive++;
			}
		}
		return positive;
	}

	public int sumOfPositives(){
		int sumOfPositive = 0;
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] >= 0 ){
				sumOfPositive += numberList[i];
			}
		}
		return sumOfPositive;
	}

	public int maxValue(){
		int highestValue = 0;
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] >= highestValue ){
				highestValue = numberList[i];
			}
		}
		return highestValue;
	}

//	public int numberOfDifferentValues(){
//		int totalDifferent = 0;
//		for (int i = 0; i < numberList.length; i++) {
//			if(numberList[i] >= highestValue ){
//				highestValue = numberList[i];
//			}
//		}
//		return highestValue;
//	}

	public boolean isLocalMaximum(int i){
		int localMax = numberList[i];
		for (int j = i--; j >= 0; j--) {
			if(numberList[j] > localMax ){

				return false;
			}
		}
		return true;
	}


	public int numberOfLocalMaximum(){
		int totalLocalMax = 0;
		int previousMax = 0;
		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] > previousMax){
				previousMax = numberList[i];
				totalLocalMax++;
			}
		}
		return totalLocalMax;
	}


	public  int[] locationOfLocalMaximum(){
		int localMax = 0;
		int j = 0;
		int max = numberOfLocalMaximum();

		int[] indexLocalMaximum = new int[max];


		for (int i = 0; i < numberList.length; i++) {

			if(numberList[i] > localMax ){
				indexLocalMaximum[j] = i;
				localMax = numberList[i];
				j++;
			}

		}

		return indexLocalMaximum;
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
