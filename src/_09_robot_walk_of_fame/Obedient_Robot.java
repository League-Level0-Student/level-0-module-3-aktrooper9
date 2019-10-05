package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
public static void main(String[] args) {
	Robot draw = new Robot();
	draw.penDown();
	draw.setSpeed(100);
	for(int i=0; i<4;i++) {
	draw.move(100);
	draw.turn(90);
	}
	draw.penUp();
	draw.move(90);
	draw.penDown();
	for(int e=0; e<3;e++) {
		draw.turn(225);
		draw.move(100);
		
	}
	draw.penUp();
	draw.move(120);
	draw.penDown();
	for(int u=0; u<360;u++) {
	draw.move(2);
	draw.turn(1);
	}
	}
}
