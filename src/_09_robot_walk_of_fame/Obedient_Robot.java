package _09_robot_walk_of_fame;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot draw = new Robot();

	public static void main(String[] args) {
		for(int i=0; i<3;i++) {
		String shape = JOptionPane.showInputDialog("Choose you favorite shape between square, triangle, or circle.");

		if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		} else if (shape.equalsIgnoreCase("CIRCLE")) {
			drawCircle();
		} else
			JOptionPane.showMessageDialog(null, "ERROR");
	}
	}
	static void drawSquare() {
		draw.penDown();
		draw.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			draw.move(100);
			draw.turn(90);
		}
	}

	static void drawTriangle() {
		draw.penUp();
		draw.move(186);
		draw.turn(-30);
		draw.penDown();
		for (int e = 0; e < 3; e++) {
			draw.turn(240);
			draw.move(100);

		}
	}

	static void drawCircle() {
		draw.penUp();
		draw.turn(90);
		draw.move(100);
		draw.penDown();
		for (int u = 0; u < 360; u++) {
			draw.move(1);
			draw.turn(1);
		}
		draw.penUp();
		draw.move(500);
	}
}
