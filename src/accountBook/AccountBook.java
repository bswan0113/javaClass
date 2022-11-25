package accountBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountBook {

	public static void main(String[] args) {
	int menu;
	Scanner scan = new Scanner(System.in);
		
	ArrayList<Account> account = new ArrayList<>(); 
	
	do {
		printMenu(
				"MENU",
				"1. Add account",
				"2. Report",
				"3. Edit account",
				"4. Delete account",
				"5. Quit"
				);	
			menu = scan.nextInt();
			runMenu(menu,account);
		}while(menu!=5);

	}

	private static void runMenu(int menu, ArrayList<Account> account) {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1: addAccount(account);
			Account ac = new Account();
			ac.copy(account, 0);
			System.out.println(ac);
			
			break;
		case 2: selectReportMenu();
				int select = scan.nextInt();
				Reportmenu(select, account);
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



	private static void Reportmenu(int select, ArrayList<Account> account) {
		switch(select) {
		case 1: printTotalReport(account);
			break;
		case 2: printAnnalReport(account);
			break;
		case 3: printmonthlyReport(account);
			break;
		case 4: printDailyReport(account);
			break;
			default:
		}
	}

	private static void printDailyReport(ArrayList<Account> account){
		Scanner scan = new Scanner(System.in);
		System.out.println(account.get(0));
		Account ac = new Account();
		ac.copy(account, 0);
		System.out.println(ac);
		System.out.println("Input a day you want.");
		int num = scan.nextInt();
		ArrayList<Integer> dayList = findDayList(account,num);
		
		for(int i=0; i<dayList.size(); i++) {
			int index = dayList.get(i);
			System.out.println(i+1+". " + account.get(index));
		}
		
			
	}

	private static ArrayList<Integer> findDayList(ArrayList<Account> account, int num) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		Account ac = new Account();
		for(int i=0; i<account.size();i++) { 
			ac.copy(account, i);
			if(ac.setDay()==num) {
				list.add(i);
			}
			
		
		}
		
		
		return list;
	}

	private static void printmonthlyReport(ArrayList<Account> account) {
		for(int i=0; i<account.size(); i++) {
			System.out.println(account.get(i));
		}		
	}

	private static void printAnnalReport(ArrayList<Account> account) {
		for(int i=0; i<account.size(); i++) {
			System.out.println(account.get(i));
		}
	}

	private static void printTotalReport(ArrayList<Account> account) {
		
		for(int i=0; i<account.size(); i++) {
			income(account.get(i));
			System.out.println(account.get(i));
			System.out.println("-----------------");
		}
		
	}
	
	private static void income(Account account) {
		if(account.isCome()== true)System.out.println("income : ");
		if(account.isCome()==false)System.out.println("expenses: ");
	}

	private static void selectReportMenu() {
		System.out.println("1. Total report");
		System.out.println("2. Annual report");
		System.out.println("3. monthly report");
		System.out.println("4. daily report");
		
	}

	private static void addAccount(ArrayList<Account> account) {
		Scanner scan = new Scanner(System.in);
		Account ac = new Account();
		
		System.out.println("Enter '1' if you want to record income and '2' if you want to record expenses");
		System.out.print("Is it income or expenses? :  ");
		int select = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Input Category :");
		String category =scan.nextLine();
		System.out.print("Input Content : ");
		String content = scan.nextLine();
		System.out.print("Input price : ");
		int price =scan.nextInt();
		scan.nextLine();
		
		System.out.print("Input date( ex)2022 11 13 ): ");

	Date date = new Date(scan.nextInt(),scan.nextInt(),scan.nextInt());
		ac = new Account(select, category, content, price, date);
		account.add(ac);
	

		
		
	
		
		
		
	}

	private static void printMenu(String ...str) {
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
	}

}
