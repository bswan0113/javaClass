package day16;

import java.util.HashMap;
import java.util.Scanner;

import lombok.Data;

public class UserManagerMain {

	public static void main(String[] args) {
/*
 * 회원정보를 관리하는 프로그램을 작성하시오.
 * -회원정보는 아이디, 비번, 이름, 나이, 주민번호로 구성
 * -기능1 : 회원 추가
 * -기능2 : 회원 검색
 * -기능3 : 회원 정보 수정
 * -기능4 : 회원삭제
 * */
		Scanner scan = new Scanner(System.in);
		HashMap<String, Object> UserList = new HashMap<String , Object>();
		
		int menu=-1;
		System.out.println("회원관리 프로그램을 시작합니다.");
		do {
			
		
		
		print();
		menu=scan.nextInt();
		runMenu(UserList,menu);
		
		}while(menu!=5);
		System.out.println("회원관리 프로그램을 종료합니다.");
	}

	private static void runMenu(HashMap<String, Object> userList, int menu) {
		switch(menu) {
		case 1: addUser(userList);
			break;
		case 2: searchUser(userList);
			break;
		case 3: updateUser(userList);
			break;
		case 4:	deleteUser(userList);
			break;
		case 5: 
			break;
		default:
			
		}
	}

	private static void deleteUser(HashMap<String, Object> userList) {
		System.out.println("삭제할 대상의 ID를 입력하세요. ");
		Scanner scan = new Scanner(System.in);
		String search = scan.nextLine();
		if(userList.get(search)==null)
		{System.out.println("존재하지 않는 ID입니다."); return;}
							
		userList.get(search);
		System.out.println(userList.get(search));
		System.out.println("정말 삭제하시겠습니까? Y/N");
		char a = scan.next().charAt(0);
		scan.nextLine();
		if(a=='N') { return;}
		if(a=='Y') {
			userList.remove(search);
			System.out.println("삭제되었습니다.");}
		
				
				
		
			
			
		}
	

	private static void updateUser(HashMap<String, Object> userList) {
		System.out.println("변경할 대상의 ID를 입력하세요. ");
		Scanner scan = new Scanner(System.in);
		String search = scan.nextLine();
		if(userList.get(search)==null)
		{System.out.println("존재하지 않는 ID입니다."); return;}
		userList.get(search);
		System.out.println(userList.get(search));
		System.out.println("변경할 정보를 나이, 주민등록번호, 비밀번호로 입력해주세요.");
		String update = scan.nextLine();
		
		
		switch(update) {
		case "나이": changeAge(userList,search);
			break;
		case "주민등록번호": changeUserNum(userList, search);
			break;
		case "비밀번호": changePw(userList, search);
			break;
		default: System.out.println("나이, 주민등록번호, 비밀번호로 입력해주세요.");
			break;
		
			
		}
				
		
				
	}


	private static void changePw(HashMap<String, Object> userList, String search) {
		Scanner scan = new Scanner(System.in);
		UserData a= (UserData)userList.get(search);
		System.out.println("변경할 값을 입력해주세요.");
		a.setPw(scan.nextLine());
		userList.put(search, a);
	}

	private static void changeUserNum(HashMap<String, Object> userList, String search) {
		Scanner scan = new Scanner(System.in);
		UserData a= (UserData)userList.get(search);
		System.out.println("변경할 값을 입력해주세요.");
		a.setUserNum(scan.nextLine());
		userList.put(search, a);		
	}

	private static void changeAge(HashMap<String, Object> userList, String search) {
		Scanner scan = new Scanner(System.in);
		UserData a= (UserData)userList.get(search);
		System.out.println("변경할 값을 입력해주세요.");
		a.setAge(scan.nextInt());
		userList.put(search, a);
		
	}

	private static void searchUser(HashMap<String, Object> userList) {
		System.out.println("검색할 대상의 ID를 입력하세요. ");
		Scanner scan = new Scanner(System.in);
		String search = scan.nextLine();
							
		if(userList.get(search)==null)
			{System.out.println("존재하지 않는 ID입니다."); return;}
		System.out.println(userList.get(search));
		
		
	
	}

	private static void addUser(HashMap<String, Object> userList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사용할 아이디를 입력하세요.");
		String ID = scan.nextLine();
		if(userList.containsKey(ID)) {
			System.out.println("이미 존재하는 아이디 입니다.");
			return;
		}
		System.out.println("사용할 비밀번호를 입력하세요.");
		String PW = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		 scan.nextLine();
		System.out.println("주민등록번호를 입력하세요.");
		String num = scan.nextLine();
		userList.put(ID, new UserData(PW, name, num, age));
		System.out.println("가입 완료.");
		System.out.println("ID : " + ID +"\n"+ userList.get(ID));
		
		
		
	}

	private static void print() {
		System.out.println("1.회원추가");
		System.out.println("2.회원검색");
		System.out.println("3.회원수정");
		System.out.println("4.회원삭제");
		
	}

}





class UserData{
	private String name, pw;
	private int age;
	private String UserNum;

	public UserData() {
		
	}
	public UserData(String pw, String name,  String userNum,int age) {
		this.pw = pw;
		this.name = name;
		this.age = age;
		UserNum = userNum;
	}


	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 :  " +age+ "\n주민번호 : " + UserNum+"";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserNum() {
		return UserNum;
	}
	public void setUserNum(String userNum) {
		UserNum = userNum;
	}
	
	
	
}