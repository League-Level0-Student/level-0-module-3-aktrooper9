package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	public static void main(String[] args) {
		String t =JOptionPane.showInputDialog("Are you happy?");
		if(t.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing what you're doing.");
		}
		else if(t.equalsIgnoreCase("no")) {
			String t1 =JOptionPane.showInputDialog("Do you want to be happy ==}==========================+");
		
			if(t1.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");//String
			}
			else if(t1.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
			}			
	
		
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}