//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		
		
		int random = new Random().nextInt(99)+1;
		
		// 2. Print out the random variable above
			//System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
			for(int i = 0;i<10;i+=1) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String t1 = JOptionPane.showInputDialog("choose a numberfrom 1 to 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		 int t2 = Integer.parseInt(t1);	
			// 5. if the guess is correct
		 
		 if(t2==(random)) {
				JOptionPane.showMessageDialog(null,"good job you have won the video game");
		System.exit(0);
		 }	
			// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			else if(t2>random) {
				JOptionPane.showMessageDialog(null,"Too high");
			}	
			else if(t2<random) {
				JOptionPane.showMessageDialog(null,"Too low");
			}	
		}
			
			JOptionPane.showMessageDialog(null,"You lose the number was "+random+" okay");
			
			// 
			// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


