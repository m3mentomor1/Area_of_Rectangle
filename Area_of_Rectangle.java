
/*  ------------------------------------------------------
 *	File Name: Area_of_Rectangle.java
 *  ------------------------------------------------------
 *  Date Created: 01-21-2021
 *  ------------------------------------------------------
 *  Description:
 *  This program is a calculator that calculates the 
 *  area of a rectangle based on the length and width 
 *  provided by the user.
 *  ------------------------------------------------------ */

import java.util.Scanner;

public class Area_of_Rectangle 
{
	public static void main(String[] args) 
    {
		/*
		 * Formula:
		 * A = (length x width)
		 */
        Scanner lengthxwidth = new Scanner(System.in); 
        
        System.out.println("Enter length: ");
		double length = lengthxwidth.nextDouble();

        System.out.println("Enter width: ");
		double width = lengthxwidth.nextDouble();
        
        lengthxwidth.close();
		System.out.println("The area of the rectangle is " + (length*width) + " m^2");
	}

}
