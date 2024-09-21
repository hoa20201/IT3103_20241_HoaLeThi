package Lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbersHoalt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1Hoalt, strNum2Hoalt;
		String strNotificationHoalt = "Hoalt-You've just enterd ";
		strNum1Hoalt=JOptionPane.showInputDialog(null,"Hoa Please input the first number;",
				"Hoa-Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotificationHoalt+= strNum1Hoalt + " and ";
        strNum2Hoalt=JOptionPane.showInputDialog(null,"Hoa Pl;ease input the second number;", 
        		"Hoa-Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotificationHoalt+=strNum2Hoalt;
        JOptionPane.showMessageDialog(null, strNotificationHoalt,"Hoa-Show Two ,Numbers ", 
        		JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
       //Le Thi Hoa -9959
	}

}
