//Author: Janice Lee
//GMU
//SWE637 HW 2

package assignment2SWE637;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class CalTest {

	@RunWith (Parameterized.class)
	public class ParameterizedCalTest
	{ 
		int month1; 
		int day1; 
		int month2;
		int day2;
		int year;
		int numDays; 



		//inject values via constructor
		public ParameterizedCalTest (int month1, int day1, int month2, int day2, int year, int numDays) {
			this.month1 = month1; 
			this.day1 = day1;
			this.month2 = month2;
			this.day2 = day2;
			this.year = year;
			this.numDays = numDays;
		}




		@Parameters 
		public Collection <Object[]> data(){
			return Arrays.asList (new Object [][]{
				{1,2,1,3,2014}

			});
		}

		@Test //creates a test method
		public void test_Caldate() {
			assertEquals(Cal.cal(month1, day1, month2, day2, year));
			
			
		}//END CalTest CLASS
		

		}
}
