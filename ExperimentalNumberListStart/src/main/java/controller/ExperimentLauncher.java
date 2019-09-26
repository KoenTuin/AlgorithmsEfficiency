/**
 * Authors: Koen van der Tuin and Youri Pelicaan
 */

package controller;



import model.ExperimentalNumberList;

import java.util.ArrayList;

public class ExperimentLauncher {

	public static void main(String[] args) {

		//create and print a experimentalNumberList
		System.out.println("------------------------------------");
		System.out.println("Opdracht a: ");
		ExperimentalNumberList enl = new ExperimentalNumberList(50);
		enl.generateNumbers(1,365);
		System.out.println(enl.toString());

		//calls equalValuesExcist
		System.out.println("------------------------------------");
		System.out.println("Opdracht b: ");
		System.out.println("\nEr is een waarde die vaker voorkomt in de list: " + enl.equalValuesExsist());

		//generate 100 lists
		System.out.println("------------------------------------");
		System.out.println("Opdracht c: ");
		ExperimentalNumberList.generateMultipleLists(100,50);


	}


}
