//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
private void Mainmethod() {
	// TODO Auto-generated method stub

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	
	int r=  new Random().nextInt(4);
	


	// 3. Print out this variable
   System.out.println(4);
	// 4. Get the user to enter a question for the 8 ball
String Answer = JOptionPane.showInputDialog("What Question would you like to ask the Great Magic 8 Ball?");
	// 5. If the random number is 0
    if(r==0) {
    JOptionPane.showMessageDialog(null, "Yes");
    }
	// -- tell the user "Yes"

	int r1 = 0;
	// 6. If the random number is 1
    if(r1==1) {
    	JOptionPane.showMessageDialog(null, "No");
    }
    int r2 = 0;
	if(r2==2) {
    	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
    }
	// -- tell the user "Maybe you should ask Google?"

	int r3 = 0;
	// 8. If the random number is 3
    if(r3==3) {
    	JOptionPane.showMessageDialog(null, "Try again next time");
    }
	// -- write your own answer
}
}

