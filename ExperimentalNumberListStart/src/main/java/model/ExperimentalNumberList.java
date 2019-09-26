/**
 * Authors: Koen van der Tuin and Youri Pelicaan
 */

package model;

import java.util.*;

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

	public boolean equalValuesExsist(){
		ArrayList<Integer> list = (ArrayList<Integer>) this.getNumbersAsList();
		for (int number : this.getNumbersAsList()) {
			if(Collections.frequency(list, number) > 1) {
				return true;
			}
		}
		return false;
	}

	public static void generateMultipleLists(int hoeveelLists, int hoeveelNummers){
		//counter
		int hoeveelGelijk = 0;

		//Create amount of lists entered
		for (int hoeveelGemaakteLists = 0; hoeveelGemaakteLists < hoeveelLists ; hoeveelGemaakteLists++) {
			ExperimentalNumberList list = new ExperimentalNumberList(hoeveelNummers);
			list.generateNumbers(1, 365);

			if (list.equalValuesExsist()){
				hoeveelGelijk += 1;
			}

		}
		System.out.println("\nIn de " + hoeveelLists  + " gemaakte lists waren" +
				" er " + hoeveelGelijk + " lists met minimaal 1 gelijk nummer.");


	}

}
