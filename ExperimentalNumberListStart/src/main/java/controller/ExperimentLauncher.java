/**
 * Authors: Koen van der Tuin and Youri Pelicaan
 */

package controller;



import model.ExperimentalNumberList;

import java.util.Arrays;

public class ExperimentLauncher {

	public static void main(String[] args) {


		ExperimentalNumberList enl = new ExperimentalNumberList(50);






		//start of part 1
		System.out.println("******Part 1******");

		//create and print a experimentalNumberList
		System.out.println("------------------------------------");
		System.out.println("Excersise a: ");
		ExperimentalNumberList enl = new ExperimentalNumberList(50);
		enl.generateNumbers(1,365);
		System.out.println(enl.toString());

		//calls equalValuesExcist
		System.out.println("------------------------------------");
		System.out.println("Exercise b: ");
		System.out.println("\nThere is a value that occurs multiple times in the list: " + enl.equalValuesExsist());

		//generate 100 lists
		System.out.println("------------------------------------");
		System.out.println("Exercise c: ");
		ExperimentalNumberList.generateMultipleLists(100,50);

		System.out.println("\nOur conclusion:\nFrom this exercise we can conclude that the birthday paradox is right," +
				" we see a percentage of 90 to 100 percent from 100 groups of 50.");

		//start of part 2
		System.out.println("******Part 2******");

		//count positive numbers
		enl.generateNumbers(1,10);
		System.out.println(enl.toString());
		System.out.println("D. Amount of positive numbers: " + enl.countPositives());
		//Sum of positive numbers
		System.out.println("E. Sum of positive numbers: " + enl.sumOfPositives());
		//Highest value
		System.out.println("F. Highest value: " + enl.maxValue());

		//Check amount of unique values in list
		System.out.println("------------------------------------");
		System.out.println("Exercise g: ");
		System.out.println("\nThis list contains: " + enl.numberOfDifferentValues() + " unique values.");

		//Check local max
		System.out.println("H. Local max: " + enl.isLocalMaximum(2));
		//Check location local max
		System.out.println("I. Index of local max" + Arrays.toString(enl.locationOfLocalMaximum()));
		//(total)number of local maxima
		System.out.println("J. Total local max" + enl.numberOfLocalMaximum());

		//start of part 3
		System.out.println("\n******Part 3******");

		ExperimentalNumberList.generateMultipleIncreasingLists(10000,40000);


	}


}
