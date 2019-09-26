
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		ImageIcon fdog = new ImageIcon("src/_06_birthday_reminder/FDOG.jpg");
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String kidBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String sp= JOptionPane.showInputDialog(null,"Choose a birthday you wish to know. MOM,DAD,KID");
		// 3. Print out what the user typed
	System.out.println(sp);
		// 4. if user asked for "mom"
	if (sp.equalsIgnoreCase("mom")) {
		JOptionPane.showMessageDialog(null,momsBirthday);
		}
			//print mom's birthday
	
		// 5. if user asked for "dad"
	else if (sp.equalsIgnoreCase("dad")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
	else if (sp.equalsIgnoreCase("kid")) {
		JOptionPane.showMessageDialog(null,kidBirthday );
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "we don't have that birthday.");
		}
			
		}
	} 

