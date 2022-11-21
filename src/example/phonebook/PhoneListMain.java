package example.phonebook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
public class PhoneListMain {
	
	static Scanner scan = new Scanner(System.in);
	static 	{System.out.println("시스템을 시작합니다.");}
	public static void main(String[] args) {
		
		
		int menu=-1;
		ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
		do {
		printMenu();
		try {
		menu=scan.nextInt();
		System.out.println("===================");

		runMenu(menu, list);}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("===================");
		}
			
		
		}while(menu !=5);
		
		System.out.println("시스템을 종료합니다.");

	}

	private static void runMenu(int menu, ArrayList<PhoneBook> list) {
		switch(menu) {
		case 1://1.번호 추가
			
			if(insertPhoneBook(list)) {
				System.out.println("전화번호를 추가했습니다.");
				System.out.println("===================");
			}
			else {
				System.out.println("번호등록에 실패했습니다.");
				System.out.println("===================");
			}
			
			
			break;
		case 2:
			if(updatePhonebook(list)) {
				System.out.println("수정완룟!");
			}
			else {
				System.out.println("수정 실패요 ㅠ");
			}
			
			break;
		case 3:
			//3. 번호 삭제
			if(deletePhoneBook(list)) {
				System.out.println("삭제 성공 ~!");
				}
			else {
				System.out.println("삭제 실패 ㅠㅠ");
			}
			
			break;
		case 4:
			//4. 번호 조회
			//이름을 입력
			printSearchnumber(list);
			//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
	
			//조회할 전화번호부를 선택

			//전화번호 조회
			break;
		case 5:
			break;
		default: System.out.println("존재하지 않는 메뉴입니다.");
		}
		
	}

	private static boolean updatePhonebook(ArrayList<PhoneBook> list) {
		
		//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
		printSearchnumber(list);
		//수정할 전화번호부를 선택
		System.out.println("수정할 번호를 선택해주세요 . : ");
		int selectIndex =scan.nextInt()-1;
		if(selectIndex<0|| list.size()<selectIndex ) {
			throw new RuntimeException("잘못된 선택입니다.");}
		
		printSubMenu();
		int selectInt = scan.nextInt();
		runSubMenu(selectInt, list.get(selectIndex));
		
		return true;
	
	
				
	}

	private static boolean runSubMenu(int selectInt, PhoneBook q) {
		if(q==null)return false;
		switch(selectInt) {
		case 1:
			scan.nextLine();
			System.out.println("수정할 이름을 입력해주세요. : ");
			String name = scan.nextLine();
			System.out.println("수정할 분류를 입력해주세요. : ");
			String company = scan.nextLine();
			
			q.update(name, company);
			break;
		case 2:			
			scan.nextLine();

		 q.print();
		 System.out.println("번호 입력 : ");
		 int index = scan.nextInt()-1;
		 scan.nextLine();
		 System.out.println("이름 : ");
		 String pName = scan.nextLine();
		 System.out.println("번호 : ");
		 String number = scan.nextLine();
		 q.getPnlist().get(index).update(pName, number);
		 
			break;
		case 3:       	
			scan.nextLine();
			ArrayList<PhoneNumber> q2 =  inputPhoneNumbers();
		q.getPnlist().addAll(q2);
			break;
		default:return false;
		}
		//1. 이름, 직장 수정
		//이름 직장 입력

		//이름, 직장을 수정
		
	//2. 기존 전화번호 수정
		//기존 전화번호들를 출력

		//수정할 전화번호를 선택

		//이름, 번호를 입력

		//선택한 전화번호 이름, 번호를 수정
	//3. 새 전화번호 추가
		//이름 번호를 입력		
	return true;}

	private static void printSubMenu() {
		System.out.println("1. 이름, 직장 수정");
		System.out.println("2. 기존 전화번호 수정");
		System.out.println("3. 기존 연락처에 전화번호 추가");
		System.out.println("4. 메인메뉴로");
		
		
	}

	private static void printSearchnumber(ArrayList<PhoneBook> list) {
		scan.nextLine();
		System.out.println("조회할 이름을 입력해주세요. : ");
		String find = scan.nextLine();
		ArrayList<Integer> indexs = searchPhoneBook(list, (p)->p.getName().contains(find));		
		printIndexNumber(indexs, list);
		
	}


	private static boolean printIndexNumber(ArrayList<Integer> indexs, ArrayList<PhoneBook> list) {
	if(indexs == null||indexs.size()==0) {
	throw new RuntimeException("조회 결과가 없습니다.");}
		
		for(int i=0; i<indexs.size(); i++) {
			System.out.println(i+1+"."+list.get(indexs.get(i)));
			
		}		
		return true;
	}
	


	private static boolean deletePhoneBook(ArrayList<PhoneBook> list) {
		scan.nextLine();
		//이름을 입력
		System.out.println("삭제할 이름을 입력하세용! : ");
		String name = scan.nextLine();
		ArrayList<Integer> indexs = searchPhoneBook(list, (p)->p.getName().contains(name));		
		//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)		
		if(printIndexNumber(indexs, list)) {
		if(deleteNum(list, indexs)) return true;
		else {
			System.out.println("잘못된 접근입니다.");
			return false;
		}}
		else {
			return false;
		}
		
		
	
		
		//확인된 번지에 있는 번호들을 인덱스와 함께 출력

		//삭제할 전화번호부를 선택

		//전화번호를 삭제		

		}

	private static boolean deleteNum(ArrayList<PhoneBook> list, ArrayList<Integer> indexs) {
		int selectIndex = scan.nextInt() -1;
		if(selectIndex<0 || selectIndex>indexs.size())return false;
		int deleteIndex = indexs.get(selectIndex);
		list.remove(deleteIndex);
		return true;
	}

	private static ArrayList<Integer> searchPhoneBook(ArrayList<PhoneBook> list, 
			Predicate<PhoneBook> p) {
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		for(int i=0; i<list.size();i++){
			if(p.test(list.get(i))) {indexs.add(i);}
		}
		
		
		return indexs;
	}

	private static PhoneNumber inputPhoneNumber(){
		System.out.print("분류를 입력하세요. : ");
		String pName = scan.nextLine();
		System.out.print("번호을 입력하세요 ex)010-0000-000 : ");
		String number = scan.nextLine();
		return new PhoneNumber(pName, number);
	}
	
	private static ArrayList<PhoneNumber> inputPhoneNumbers(){
		ArrayList<PhoneNumber> pnList = new ArrayList<PhoneNumber>();
	do {
			PhoneNumber pn = inputPhoneNumber();
			pnList.add(pn);
		
			System.out.print("추가로 입력 하시겠습니까? : ");
	
		}while(scan.nextLine().charAt(0)!='n');
		return pnList;
	}
	
	private static boolean insertPhoneBook(ArrayList<PhoneBook> list) {
		//성명, 직장 입력
		scan.nextLine(); //공백처리
		System.out.print("등록할 이름을 입력해주세요. : ");
		String name = scan.nextLine();
		System.out.print(name + "의 직장을 입력해주세요. : ");
		String company = scan.nextLine();
		ArrayList<PhoneNumber> pnList;
		try {
		pnList = inputPhoneNumbers();}
		catch(RuntimeException e) {
			return false;
		}
		
		PhoneBook pb = new PhoneBook(name, company, pnList);
		// 만들어진 PhoneNumber리스트에 추가
		list.add(pb);
		return true;
	
		
		
		//PhoneBook객체를 생상하고
		//list에 PhoneBook객체를 추가

		//반복
			//전화번호를 입력(이름 : 번호) => PhoneNumber

			//전화번호를 더 입력할건지 물어봄

		//전화번호부에 추가 => PhoneBook 개체를 생성
	}

	private static void printMenu() {
		System.out.println("========메뉴========");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 프로그램 종료");
		System.out.println("===================");
		System.out.println("메뉴 선택 : ");
	}
	

}
