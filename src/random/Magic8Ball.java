//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	System.out.println(4);
	


	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
 
	
	int r=  new Random().nextInt(4);
	int num3=new Random().nextInt(4);
	// 3. Print out this variable
	
	// 4. Get the user to enter a question for the 8 ball
    String Answer = JOptionPane.showInputDialog("What Question would you like to ask the Great Magic 8 Ball?");{
	// 5. If the random number is 0
    if(r==0) {
    JOptionPane.showMessageDialog(null, "Yes");
    }
	// -- tell the user "Yes"
	// 6. If the random number is 1
    if(r==1) {
    	JOptionPane.showMessageDialog(null, "No");
    }
	if(r==2) {
    	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
    }
	// -- tell the user "Maybe you should ask Google?"
	// 8. If the random number is 3
    if(r==3) {
    	JOptionPane.showMessageDialog(null, "Try again next time");
    }
	// -- write your own answer
}
}
} 


