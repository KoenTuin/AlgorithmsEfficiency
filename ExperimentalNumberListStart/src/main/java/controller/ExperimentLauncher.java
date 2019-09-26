/**
 * Authors: Koen van der Tuin and Youri Pelicaan
 */

package controller;



import model.ExperimentalNumberList;

import java.util.ArrayList;

public class ExperimentLauncher {

	public static void main(String[] args) {

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

	}


}
