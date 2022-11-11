package accountBook;

import java.util.Scanner;

public class AccountBook {

	public static void main(String[] args) {
	int menu;
	Scanner scan = new Scanner(System.in);
		
	
	do {
		printMenu(
				"MENU",
				"1. Add detail",
				"2. History",
				"3. Edit detail",
				"4. Delete detail",
				"5. Quit"
				);	
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu!=5);

	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
		}
	}

	private static void printMenu(String ...str) {
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
	}

}
