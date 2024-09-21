package Lab01;

import javax.swing.JOptionPane;

public class HelloNameDialogHoalt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a variable to store name
		String result;
		//Get the name from user
		result = JOptionPane.showInputDialog("Hoa-Please enter your name:");
		//Display the name with a message
		JOptionPane.showMessageDialog(null, "Hoa Hi " + result + "!");
		System.exit(0);
		

	}

}
