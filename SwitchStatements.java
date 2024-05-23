package JavaDSA;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
//		--------------------------- NORMAL CASES AND SWITCH -----------------------------------------
//		String fruits = in.next();
//		
//		switch (fruits) {
//		
//		case "Mango":
//			System.out.println("King of fruits");
//			break;
//		case "Apple": 
//			System.out.println("red fruit");
//			break;
//		default:
//			System.out.println("Kuch toh leke aa");
//		}
		
//		------------------------------------------ WEEKDAYS AND WEEKENDS -------------------------
		int day = in.nextInt();
		
		switch (day){
			case 1 :
			case 2 :
			case 3 :
			case 4 :
			case 5 : System.out.println("Weekdays"); 
			break;
			case 6: 
			case 7: System.out.println("Weekends");
			break;
			default :
				System.out.println("Enter Valid day");
			}
		
	}

}
