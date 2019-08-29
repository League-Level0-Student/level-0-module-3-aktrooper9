//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot t = new Robot();
		for(int y = 0;y<999;y++) {
		//3. Ask the user what color they would like the robot to draw
		//String t1 = JOptionPane.showInputDialog(null,"What is your favorite color out of red, blue, yellow");
		//5. Use an if/else statement to set the pen color that the user requested
		//if(t1.equals("red")) {
			//t.setPenColor(255,0,0);
		//}
		//else if(t1.equals("blue")) {
			//t.setPenColor(0,0,255);
		//}
		//else if(t1.equals("yellow")) {
			t.setPenColor(255,255,0);
		//}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		t.setPenWidth(0);
	    //2. Make the robot draw a shape (this will take more than one line of code)

		t.penDown();
		t.setSpeed(1);
		t.turn(18);
		for(int i=0;i<5;i++) {
			t.turn(144);
			t.move(160);
		}
		t.penUp();
		t.move(50);
		}
		}
}
