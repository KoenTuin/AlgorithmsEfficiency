/**
 * Authors: Koen van der Tuin and Youri Pelicaan
 */

package controller;



import model.ExperimentalNumberList;

public class ExperimentLauncher {

	public static void main(String[] args) {

		ExperimentalNumberList enl = new ExperimentalNumberList(50);


		//count positive numbers
		enl.generateNumbers(1,10);
		System.out.println(enl.toString());
		System.out.println("D. Amount of positive numbers: " + enl.countPositives());
		//Sum of positive numbers
		System.out.println("E. Sum of positive numbers: " + enl.sumOfPositives());
		//Highest value
		System.out.println("F. Highest value: " + enl.maxValue());
		//Number of different values
		System.out.println("G. NOT DONE");
		//Check local max
		System.out.println("H. Local max: " + enl.isLocalMaximum(2));
	}
}
