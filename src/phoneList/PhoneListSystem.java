package phoneList;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneListSystem {
	Scanner scan;
	ArrayList<PhoneList> list = new ArrayList<PhoneList>();

	
	
	




	public void run() {
		
		System.out.println("전화번호부를 실행합니다.");
		int menu=-1;
		
		do {
			printmenu();
			menu=scan.nextInt();
			runMenu(menu,list);
			
			
		}while(menu!=5);
		System.out.println("전화번호부를 종료합니다.");
		
	}
	
	private void runMenu(int menu, ArrayList<PhoneList> list) {
		scan.nextLine();
		switch(menu) {

		case 1: addList(list);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4: searchNum(list);
			break;
		case 5:
			break;
		default: System.out.println("잘못 입력하였습니다.");
		}
		
		
	}

	private void searchNum(ArrayList<PhoneList> list) {
		System.out.println("검색할 이름을 입력해주세요.");
		String find = scan.nextLine();
		ArrayList<Integer> a = findIndex(list, find);
		for(int i=0; i<a.size();i++) {
				System.out.println(list.get(a.get(i)));
		}
		
	}

	private ArrayList<Integer> findIndex(ArrayList<PhoneList> list, String find) {
		ArrayList <Integer> index = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getLastName().contains(find)) {
				index.add(i);
			}
		}
		
		return index;
	}

	private void addList(ArrayList<PhoneList> list) {
		
		ArrayList<PhoneNum> p = new ArrayList<PhoneNum>();
		System.out.println("입력할 사람의 성을 입력해주세요. : ");
		String last = scan.nextLine();
		System.out.println("입력할 사람의 이름을 입력해주세요. : ");
		String first = scan.nextLine();
		System.out.println("입력할 사람의 직장을 입력해주세요. : ");
		String rec = scan.nextLine();
		Inputnum(p);
		
		list.add(new PhoneList(last, first, rec, p));
		
		System.out.println("추가가 완료되었어요.");
		System.out.println("\n");
		System.out.println(list);

		
		
	}


	private void Inputnum(ArrayList<PhoneNum> p) {
		String a="Y";
		String name;
		String num;
		while(true){
		System.out.println("입력할 전화번호의 분류를 입력해주세요. : ");
		name = scan.nextLine();
		System.out.println("입력할 전화번호를 입력해주세요. : ");
		num = scan.nextLine();
		System.out.println("추가로 입력하시겠습니까?'Y'or'N'");
		a=scan.nextLine();
		p.add(new PhoneNum(name, num));
		
		if(a.equals("N")) break;		
		}
		
		
	}

	private void printmenu() {
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");		
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 종료");
	}

	public PhoneListSystem(Scanner scan) {
		if(scan == null) {
			this.scan = new Scanner(System.in);
		}else {
			this.scan = scan;
		
	}

}



}