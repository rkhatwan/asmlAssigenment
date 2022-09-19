package com.assignment.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.asml.assignment.SpiralMatrix;

/**
 * JUnit test class which has the test cases for positive and negative scenarios
 * @author rkhatwan
 *
 */
class SpiralMatrixUnitTest {

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}

	/**
	 * Code to test the positive use case..
	 */
	@Test
	void testspiralPrintWithProperArray() {
		SpiralMatrix spiralMatrixObject=new SpiralMatrix();
		int[][] arr= {{1, 2, 3,4},
                {5, 6, 7,8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
		
		spiralMatrixObject.spiralPrint(arr);
		assertEquals("1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10", outputStreamCaptor.toString()
	      .trim());
	}
	
	/**
	 * Code to test if the elements of array are not given properly
	 */
	@Test
	void testspiralPrintWithImProperArray() {
		SpiralMatrix spiralMatrixObject=new SpiralMatrix();
		int[][] arr= {{1, 2, 3,4},
                {5, 6, 7},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
		
		spiralMatrixObject.spiralPrint(arr);
		assertEquals("Array is not proper please fill the array elements properly", outputStreamCaptor.toString()
			      .trim());
		
	}
	
	/**
	 * Code to test, If the array elements are not given and has null values..
	 */
	@Test
	void testspiralPrintWithNullArray() {
		SpiralMatrix spiralMatrixObject=new SpiralMatrix();
		int[][] arr= null;
		
		spiralMatrixObject.spiralPrint(arr);
		assertEquals("Array is not proper please fill the array elements properly", outputStreamCaptor.toString()
			      .trim());
		
	}




}
