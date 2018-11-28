//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		
		//3. Now make r random. 
	Random r2 = new Random(); 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		int number =r2.nextInt(101);

		//4. Limit the random number between 0 and 100

		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		int number1 =r2.nextInt(51)+25;
		//6. Challenge: Limit the random number between -222 and 88
		int number2=r2.nextInt(-309)+88;
		//1. Print out the value of r
		int r1= 100;
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}