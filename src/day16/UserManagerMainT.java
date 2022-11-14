package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManagerMainT {

	public static void main(String[] args) {
		
		//메뉴출력
		//메뉴를 선택
		//선택된 메뉴에 따른 기능 실행
		
		ArrayList<Member1> member = new ArrayList<Member1>();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		do {
			print();
			menu = scan.nextInt();
			runMenu(member, menu);
			
			
		}while(menu!=6);

	}
	private static void print() {
		System.out.println("1.회원추가");
		System.out.println("2.회원검색");
		System.out.println("3.회원수정");
		System.out.println("4.회원삭제");
		System.out.println("5.전체회원정보출력");
		System.out.println("6.종료");
		
	}
	private static void runMenu(ArrayList<Member1> list, int menu) {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1: addMember(list);
			break;
		
		case 2: Member1 searchTmp = searchMember(list);
		if(searchTmp==null) {
			System.out.println("아이디 또는 비밀번호가 잘못 되었습니다.");
		}System.out.println(searchTmp);
		
			break;
		
		case 3: //changeInfo(list);	
			Member1 updateTmp = searchMember(list);
			updateMember(list, updateTmp);
	
			break;
		
		case 4:	
		//삭제할 회원 아이디와 비번을 입력하여 일치하는 회원 정보를 가져옴
		Member1 deleteTmp =  searchMember(list);
		//일치하는 회원정보가 있으면 삭제
		if(deleteTmp !=null) {
			System.out.println("정말 삭제하시겠습니까? Y/N");
			if(scan.next().charAt(0)=='Y') {
				list.remove(deleteTmp);
				System.out.println("삭제가 완료되었습니다.");}
			
		}
		else {
			System.out.println("아이디 또는 비밀번호가 잘못 되었습니다.");
		}
		//
			break;
		
		case 5: 
			
			System.out.println("관리자 비밀번호를 입력해주세요.");
			if(scan.nextInt() ==Member1.totalPass) {
				for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			}
		}
			else {
				System.out.println("접근 권한이 없습니다.");
			}
			break;
		default: System.out.println("잘못된 접근 입니다.");
		
			
		
			
		}
	}

	private static boolean addMember(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사용할 아이디를 입력하세요.");
		String ID = scan.nextLine();
		System.out.println("사용할 비밀번호를 입력하세요.");
		String PW = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		 scan.nextLine();
		System.out.println("주민등록번호를 입력하세요.");
		String num = scan.nextLine();
		
		Member1 member = new Member1(ID, PW, name, num, age);		
		if(list.contains(member)){
			System.out.println("이미 존재하는 아이디 입니다.");
			return false;}
		list.add(member);
		System.out.println("");
		return true;
	}
	public static Member1 searchMember(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);
		//아이디 입력
		System.out.println("검색할 회원의 ID를 입력하시오.");
		String id = scan.next();
		scan.nextLine();
		System.out.println("비밀 번호를 입력하시오.");
		String pw = scan.next();
		Member1 member = new Member1(id, pw);
		int index = list.indexOf(member);
		if(index==-1) {
			return null;
		}
		Member1 tmp = list.get(index);
		if(!tmp.getPw().equals(member.getPw())) {
			System.out.println("비밀번호가 틀렸습니다.");
			return null;}
		
		
		//비밀번호입력
		//아이디, 비밀번호를 이용하여 객체를 만듬
		//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
		//가져온 회원 정보의 비밀번호와 입력한 비밀번호를 비교하여 같으면 회원정보를 보여주고 다르면 종료
		return tmp;
	}
/*	public static void changeInfo(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 회원의 ID를 입력하시오.");
		String id = scan.next();
		scan.nextLine();
		System.out.println("비밀 번호를 입력하시오.");
		String pw = scan.next();
		Member1 member = new Member1(id, pw);
		int index = list.indexOf(member);
		if(index==-1) {
			return;
		}
		Member1 tmp = list.get(index);
		if(!tmp.getPw().equals(member.getPw())) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;}
		
		System.out.println(tmp); 
		
		
		System.out.println("수정할 항목의 번호를 선택해주세요.");
		System.out.println("1. ID \n2. 비밀번호 \n3. 이름\n4. 나이\n5. 주민등록번호\n6. 뒤로\n입력 : ");
		int select = scan.nextInt();
		scan.nextLine();
		switch(select) {
		
		case 1: 
			System.out.println("변경할 ID를 입력해주세요.");
			list.get(index).setId(scan.nextLine());
			System.out.println("ID가 변경되었습니다.");
			System.out.println(list.get(index).toString());
					
			break;
		case 2:				
			System.out.println("변경할 비밀번호를 입력해주세요.");
		list.get(index).setPw(scan.nextLine());
		System.out.println("비밀번호가 변경되었습니다.");
		System.out.println(list.get(index).toString());
			break;
		case 3:
			System.out.println("변경할 이름를 입력해주세요.");
			list.get(index).setName(scan.nextLine());
			System.out.println("이름이 변경되었습니다.");
			System.out.println(list.get(index).toString());
			
			break;
		case 4:
			System.out.println("변경할 나이를 입력해주세요.");
			list.get(index).setAge(scan.nextInt());
			scan.nextLine();
			System.out.println("나이가 변경되었습니다.");
			System.out.println(list.get(index).toString());
			break;
		case 5:
			System.out.println("변경할 주민등록번호를 입력해주세요.");
			list.get(index).setResidentNum(scan.nextLine());
			System.out.println("주민등록번호가 변경되었습니다.");
			System.out.println(list.get(index).toString());
			break;
		case 6:
			return;
		default:System.out.println("잘못된 값을 입력하였습니다.");
		break;
		}
		
			//수정할 항목을 입력받음
			//항목을 수정할 내용을 입력받음
			//수정

	} */
	public static boolean updateMember(ArrayList<Member1> list, Member1 updateTmp) {
		Scanner scan = new Scanner(System.in);
		if(updateTmp==null) {
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");return false;}
		System.out.println("수정할 회원 정보를 입력하아시이오오~ 빰");
		System.out.println("사용할 아이디를 입력하세요.");
		String ID = scan.nextLine();
		System.out.println("사용할 비밀번호를 입력하세요.");
		String PW = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		 scan.nextLine();
		System.out.println("주민등록번호를 입력하세요.");
		String num = scan.nextLine();
		updateTmp.update(ID,PW,name,age,num);
		System.out.println("수정이 완료되었습니다.");
	return true;}
}
