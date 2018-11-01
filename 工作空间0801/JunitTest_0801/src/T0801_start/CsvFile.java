//package T0801_start;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//
//class CsvFile {
//	
//	 private int input1;
//	 private int input2;
//	 private int expected;
//	@ParameterizedTest
//	@CsvFileSource(resources = "D:\\¹¤×÷¿Õ¼ä0801\\JunitTest_0801\\src\\T0801_start\\two-column.csv",numLinesToSkip = 1)
//	void Parameterization_basic(int expected, int input1, int input2) {
//		 
//	    this.expected = expected;
//        this.input1 = input1;
//        this.input2 = input2; 
//        int d=Sum.twoSum(input1,input2);
//        System.out.println(d);
//		int c=input1+input2;
//		System.out.println(c);
//        assertEquals(expected, d); 
//        
//  } 
//}
