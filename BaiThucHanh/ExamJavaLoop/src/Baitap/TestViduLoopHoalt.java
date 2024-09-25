package Baitap;
import java.util.Scanner;
public class TestViduLoopHoalt {

	//le thi Hoa - 9959
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			double a=10, b=10;
			System.out.println("Le Thi Hoa-9959");
			if (a>b)
			System.out.println(" "+a+" > "+b);
			else if (a<b)
			      System.out.println(" "+a+" < "+b);
			      else System.out.println(" "+a+" = "+b);
			//===================================	
			System.out.println("switch case");
			//====================================
			int day=8;
			switch (day)
			{
			case 1:
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunday");
				break;
			default:
				System.out.println("NHap sai:");
				break;
			}
			//=================================
			System.out.println("Loop While");
			//==================================
			int i=0;
			while (i<10) {
				System.out.println(i);
				i++;
			}
			//=================================
			System.out.println("loop do while");
			//=================================
			int k=0;
			do {
				System.out.println(k);
				k++;
			} while (k<10);
					
			//===============================
			System.out.println("Loop for()");
			//===============================
			for(int j=0; j<10; j++)
			System.out.println(j);
				
				
			//===============================
			System.out.println("for each Loop");
			//================================
		String[] cars = {"Volvo", "BMW", "Ford","Mazda"};
		for (String b1:cars)
			System.out.println(b1);
		//======================================
		System.out.println("Java continue");
		
		for(int k1=0; k1<10; k1++)
		{
			if (k1<8) {
				continue;
			}
			System.out.println(k1);
		}
		
		//======================================
			
		}
		

	}



