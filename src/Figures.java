
//   Figures.java      Author: Allison Fischer
//  Summer 2020		PROGRAMMING ASSIGNMENT 2
//  July 31, 2020
//  This program asks the user to enter the size of a figure (must be odd). 
//  It then displays a menu of 4 options. Options 1-3 will print various figures: box, diamond, X. 
//  Option 4 will allow the user to quit the program.*/

import java.util.Scanner;
import java.lang.*;

public class Figures {

	static int size = 0; // Initializes int odd_number which will be the size of the figure.
	int option_choice; // Initializes int option choice to allow user to choose a figure or quit
						// program.
	static int row;
	static int columns;
// Method for printing box
	static void printBox(int size) {
		for (int row = 0; row < size; row++) {
			for (int columns = 0; columns < size; columns++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
// Method for printing diamond
	static void printDiamond(int size) {
		for (int row = 1; row <= size; row++) {
			for (int columns = 1; columns <= size; columns++) {
				if (row == columns) {
					System.out.print("X");
				} else if (row + columns == size + 1) {
					System.out.print(" ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

// Method for printing "X"
	static void printX(int size) {
		for (int row = 1; row <= size; row++) {
			for (int columns = 1; columns <= size; columns++) {
				if (row == columns) {
					System.out.print("X");
				} else if (row + columns == size + 1) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");

			
		}
	}

	public static void main(String[] args) {
				System.out.println("Programming Fundamentals \nNAME: Allison Fischer \nPROGRAMMING ASSIGNMENT 2");
				System.out.println("\nPlease enter the size of the figure you would like created.\r\nThe size must be"
						+ " an odd number:  ");	//Prompts the user to enter the size of the figure (odd number).
				Scanner scan = new Scanner(System.in);
				size = scan.nextInt();
				while (size % 2 == 0) {
					System.out.print("Invalid figure size - must be an odd number\r\n" + 
							"Re-enter the size of the figure: ");
					size = scan.nextInt();
					continue;}
					System.out.print("MENU:\r\n1. Print box\r\n"
							+ "2. Print diamond\r\n3. Print X\r\n4. Quit program\r\n"
							+ "Please select an option:  ");
				
				int option_choice = scan.nextInt();
					if (option_choice == 1) 
					{printBox(size);}
					if (option_choice == 2)
					{printDiamond(size);}
					if (option_choice == 3)
					{printX(size);
					if (option_choice == 4)
						System.out.print("Good bye!");}
					System.exit(0);}
