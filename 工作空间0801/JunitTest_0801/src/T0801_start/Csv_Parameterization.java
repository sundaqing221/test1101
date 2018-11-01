package T0801_start;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Csv_Parameterization {


//	 private int input1;
//	 private int input2;
//	 private int expected;
	 private String expected;
	@ParameterizedTest
//	@CsvSource({ "5,2,3","6,2,4","11,4,7" })
	@CsvSource({"nihao" })
	void Parameterization_basic(String expected
//			int expected, int input1, int input2
			) {
		 
	      this.expected = expected;
	      System.out.println(expected);
//          this.input1 = input1;
//          this.input2 = input2; 
//          int d=Sum.twoSum(input1,input2);
//          System.out.println(d);
//		  int c=input1+input2;
//		  System.out.println(c);
//          assertEquals(expected, d); 
    } 

//	@Test
//    public void testSub() {
//		int c;
//		c=Sum.twoSum(input1, input2);
//		System.out.println(c);
//		System.out.println(expected);
//      assertEquals(expected, c);        
//    }    	
}
