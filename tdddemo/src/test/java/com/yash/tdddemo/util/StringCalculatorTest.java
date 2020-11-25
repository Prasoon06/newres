package com.yash.tdddemo.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator stringCalculator;
	
	@Before
	public void setup(){
		stringCalculator=new StringCalculator();
	}
	@Test
	public void test_Calculator_GivenEmptyString_ShouldReturnNumericZero() {
		int res=stringCalculator.calculate("");
		assertEquals(0,res);
	}
	
	@Test
	public void test_Calculator_GivenSingleNumberAsString_ShouldReturnSingleNumericValue() {
		int res=stringCalculator.calculate("1");
		assertEquals(1,res);
	}
	
	@Test
	public void test_Calculator_GivenTwoNumberAsStringSeparatedByComma_ShouldReturnSumAsNumber() {
		int res=stringCalculator.calculate("1,2");
		assertEquals(3,res);
	}
	
	@Test
	public void test_Calculator_GivenNNumberAsStringSeparatedByComma_ShouldReturnSumAsNumber() {
		int res=stringCalculator.calculate("1,2,4,5,5");
		assertEquals(17,res);
	}
	

}
