package com.asml.assignment;

import java.util.StringJoiner;


/**
 * SpiralMatrix class contains all the logic which is required to print the
 * given array in the spiral form 
 * The class contains two methods :
 * 
 * 1) main method which will call the method which has the logic to print the 
 * array and will pass the 2d array to the method 
 * 2) another method is the spiralPrintMethod which will take the array as 
 * parameter and will print the 2d array in the spiral form the logic used
 * to print the array is described in the method comments..
 * 
 * @author rkhatwan
 *
 */
public class SpiralMatrix {
	
	 public static void main(String[] args)
	    {
	       
	        int array[][] ={{1, 2, 3, 4},
	                   {5, 6, 7},
	                   {9, 10, 11, 12},
	                   {13, 14, 15, 16}};
	  
	        // Function Call
	        SpiralMatrix spiralMatrix=new SpiralMatrix();
	        spiralMatrix.spiralPrint(array);
	    }

	 /**
	  * SprialPrint method takes arr as the parameters. The logic used is :
	  * 1) four pointers are taken which will be initially pointing to 
	  *    starting coloumn Index, ending coloumn index, top row index and 
	  *    Bottom row index...
	  *  2) The logic will run until all the squares of the loop and are printed
	  *  3) NullPointerException is handled , If the arr is null
	  *  4) ArrayIndexOutOfBoundException is handled, If the array elements are not 
	  *     provided properly
	  *  5) Time complexity is m*n and space complexity is 1..
	  *  
	  *  The logic used is : 
	  *  First the top row will be added to stringJoiner and then , the top row pointer will be 
	  *  incremented by 1 
	  *  Then the right most coloumn is stringJoiner from the topRow pointer value to the
	  *  BottomRowPointer value and then the right most coloumn value is decremented
	  *  by 1 
	  *  Then the Bottom most row is stringJoiner from the RightMostColoumn pointer to the 
	  *  LeftMost coloumn pointer and then the value of Bottom Most row pointer is
	  *  Decremented 
	  *  Then the left most coloumn is stringJoiner from the BottomRow to the TopRow
	  *  Taking the coloumn value as constant and then increase the left pointer to one
	  *  All these logic is will execute until the 
	  *  topRowPointer<=bottomRowPointer && leftColoumnPointer<=rightColoumnPointer
	  *  Finally the value of stringJoiner will be printed 
	  * @param arr
	  */
	public void spiralPrint(int[][] arr) {
		try
		{
			int rowLength=arr.length;
			int coloumnLength=arr[0].length;
			
			int leftColoumnPointer=0;
			int rightColoumnPointer=coloumnLength-1;
			
			int topRowPointer=0;
			int bottomRowPointer=rowLength-1;
			StringJoiner arrayElementsJoiner=new StringJoiner(",");
			
			while(topRowPointer<=bottomRowPointer && leftColoumnPointer<=rightColoumnPointer)
			{
				for(int i=leftColoumnPointer;i<=rightColoumnPointer;i++)
				{
					arrayElementsJoiner.add(String.valueOf(arr[topRowPointer][i]));
				}
				topRowPointer++;
				for(int i=topRowPointer;i<=bottomRowPointer;i++)
				{
					arrayElementsJoiner.add(String.valueOf(arr[i][rightColoumnPointer]));
				}
				rightColoumnPointer--;
				if(topRowPointer<=bottomRowPointer)
				{
					for(int i=rightColoumnPointer;i>=leftColoumnPointer;i--)
					{
						arrayElementsJoiner.add(String.valueOf(arr[bottomRowPointer][i]));
					}
					bottomRowPointer--;
				}
				if(leftColoumnPointer<=rightColoumnPointer)
				{
					for(int i=bottomRowPointer;i>=topRowPointer;i--)
					{
						arrayElementsJoiner.add(String.valueOf(arr[i][leftColoumnPointer]));
					}
					leftColoumnPointer++;
				}
				
			}
			System.out.println(arrayElementsJoiner.toString());
		}
			catch(ArrayIndexOutOfBoundsException | NullPointerException ex2)
			{
				System.out.println("Array is not proper please fill the array elements properly");
			}
		}
	
		
		// TODO Auto-generated method stub
		
}

