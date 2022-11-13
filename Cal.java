//Author: Janice Lee
//GMU 
//SWE637 Assignment 


package assignment2SWE637;

public class Cal 
{


	//*********************************************************************************************************************
	//Method to Calculate the number of days between two given calendar days in the same year according to the Gregorian Calendar. 
	//Preconditions: 
	//1. day1 and day2 must be in same year
	//2. 1 <= month1, month2<=12
	//3. 1 <= day1 <=maxDaysinMonth1 
	//4. 1 <= day2 <=MaxDaysInMonth2
	//5. month1 <= month2
	//6. month1 == month2 implies day1 <= day2
	//7. 1 <=year <=10000
	//*********************************************************************************************************************



	

	public static int cal (int month1, int day1, int month2, int day2, int year)


	{
		//the first array element is a just a place holder
		//No month zero
		int numDays; 
		
		//checks the condition and executes if block only when condition is true
		if (month1 == month2) // in the same month
			//should be numDays = day2 - day1;
			//fault >> original code :  numDays = day2 % day1;
			numDays = day2 - day1; //fixed fault 


		//otherwise executes the else block if the condition is false. 
		else {
			int daysIn [] = { 0, 31 , 0, 31, 30, 31, 30, 31, 30, 30, 31, 30, 31};
			int m4 = year % 4; //evenly divisible by 4
			int m100 = year % 100;//evenly divisible by 100
			int m400 = year /400; //evenly divisible by 40

			
			//checks to see if we are in a leap year. 
			if ((m4 !=0) || ((m100 == 0 ) || (m400 !=0)))
				daysIn [2] = 28;
			
			else
			
				daysIn [2] = 29;
			
			
			//start with days in the two months
			numDays = day2 + (daysIn[month1] - day1);


			// executes statement as long as condition is true. 
			//add the days in the intervening months

			for (int i = month1 +1; i <= month2-1; i ++)
				numDays = daysIn[i] + numDays;

			//checks if months are within range

		}
		return (numDays);

	}

}//end class 




