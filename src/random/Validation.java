//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for(int i=0;i<11;i++) {
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		
		if(randomNumber==0) {
        	JOptionPane.showMessageDialog(null, "You are beautiful");
		}
        if(randomNumber==1) {
              	JOptionPane.showMessageDialog(null, "Get out of here and look at the mirrior you will find something nice");
        	  }
        if(randomNumber==2) {
                 	JOptionPane.showMessageDialog(null, "You need to get a makeover");
              	 }
        if(randomNumber==3) {
                     	JOptionPane.showMessageDialog(null, "You are godlier than the Gods."); 
                 	 }
        if(randomNumber==4) {
                         	JOptionPane.showMessageDialog(null, "Wow you are more stunning than the sunflower and the sun combined");
                     	 }
                     	// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
}

