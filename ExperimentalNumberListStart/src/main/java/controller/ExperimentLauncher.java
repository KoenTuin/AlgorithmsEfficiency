/**
 * Authors: Koen van der Tuin and Youri Pelicaan
 */

package controller;



import model.ExperimentalNumberList;

import java.util.ArrayList;

public class ExperimentLauncher {

	public static void main(String[] args) {

		//create and print a experimentalNumberList
		ExperimentalNumberList enl = new ExperimentalNumberList(5);
		enl.generateNumbers(1,100);
		System.out.println(enl.toString());

		//calls equalValuesExcist
		System.out.println(enl.equalValuesExsist());


	}

}
