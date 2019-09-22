package _05_horoscope;

import javax.swing.JOptionPane;

//import org.jointheleague.graphical.robot.Robot;

public class HOROSCOPE {
public static void main(String[] args) {
//Robot Writer=new Robot();
//Writer.setAngle(180);
//Writer.penDown();
	String year = JOptionPane.showInputDialog("What Year were you born in."); 
	if(year.equalsIgnoreCase("1996")){
		JOptionPane.showMessageDialog(null, "You are a rat. You are clever and very tricky,");
		}
	else if(year.equalsIgnoreCase("1997")) {
		JOptionPane.showMessageDialog(null, "You are an Ox. You are hardworking honest and can always be depended on.");
	}
	else if(year.equalsIgnoreCase("1998")) {
		JOptionPane.showMessageDialog(null,"You are a white tiger. You are fast and will have a taste for competition");
	}
	else if(year.equalsIgnoreCase("1999")) {
		JOptionPane.showMessageDialog(null, "You are a rabbit. You are astute always aware of your surroundings.");
		
	}
	else if(year.equalsIgnoreCase("2000")) {
		JOptionPane.showMessageDialog(null, "You are a dragon. You are strong and independent and will be very wealthy as dragons are.");
	}
	else if(year.equalsIgnoreCase("2001")) {
		JOptionPane.showMessageDialog(null, "You are a snake. You are a deep thinker but when you love, you love with your entire heart.");
	}
	else if(year.equalsIgnoreCase("2002")) {
		JOptionPane.showMessageDialog(null, "You are a horse. You enjoy being free and being yourself.");
	
	}
	else if(year.equalsIgnoreCase("2003")) {
		JOptionPane.showMessageDialog(null, "You are a goat. You are selfless even if it is against your interests.");
	}
	else if(year.equalsIgnoreCase("2004")) {
		JOptionPane.showMessageDialog(null, "You are a monkey. You will live a long life, you will be able to accomplish your dreams and you are a prankster.");
		
	}
	else if(year.equalsIgnoreCase("2005")) {
		JOptionPane.showMessageDialog(null, "You are a rooster. You can ward of evil sprits but require validation from those you love.");
	}
	else if(year.equalsIgnoreCase("2006")) {
		JOptionPane.showMessageDialog(null, "You are a dog. You are an honest anloyal friend with a liitle anxiety and a strong will.");
	}
	else if(year.equalsIgnoreCase("2007")) {
		JOptionPane.showMessageDialog(null,"You are a pig. You are lucky and will have amazing wealth. You will be very realistic and work but not talk. You will allow yourself to enjoy life. You enjoy holding solid objects and are always glad to work at even the most boring things. You will always take position of power because you want to be heard. You believe that those in power have the right to speak.");
	}
	else {
		JOptionPane.showMessageDialog(null, "If This message is showing add or subtract twelves till you get 1996-2007 then rerun the code.");
	}
} 
}
