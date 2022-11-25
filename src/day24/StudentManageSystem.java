package day24;




import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;






public class StudentManageSystem {

	ArrayList<Student> std = new ArrayList<Student>();
	 Scanner scan = new Scanner(System.in);
	 {System.out.println("학생관리 프로그램을 시작합니다.");}
	 int stdCount=0;
	

	public void run() throws Exception {
		
		String fileName = "student.txt";
			
		load(std, fileName);
			int menu=0;
			do {
				printMenu();
				menu=scan.nextInt();
				scan.nextLine();
				runMenu(menu);
			}while(menu!=3);
	save(std,fileName);
		
	}
	
	
		
	
	
	
	
	private void load(ArrayList<Student> std, String fileName) throws Exception {
		if(std==null)throw new Exception("학생 관리 리스트가 생성되지 않음");
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {			
				while(true){
					Student tmp=(Student)ois.readObject();
					std.add(tmp);
				}
				
		}
		catch(FileNotFoundException e) {
			System.out.println(fileName+"을/를 생성할 수 없습니다.");
			
		}
		catch(EOFException e) {
			System.out.println("불러오기완료");
		}
		catch(Exception e) {
			System.out.println("불러오기에 실패했습니다.");
			
		}
	}







	private void save(ArrayList<Student> std, String fileName) throws Exception {
		if(std==null)throw new Exception("학생 관리 리스트가 생성되지 않음");
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {			
				for(Student tmp : std) {
					oos.writeObject(tmp);
				}
				System.out.println("☆저장완료★");
		}catch(FileNotFoundException e) {
			System.out.println(fileName+"을/를 생성할 수 없습니다.");
			
		}catch(IOException e) {
			System.out.println("저장에 실패했습니다.");
			
		}
		
	}







	private void runMenu(int menu) throws Exception {
		switch(menu) {
		case 1:	addStd();
			break;
		case 2: printStd();
			break;
		case 3: System.out.println("시스템을 종료합니다.");
			break;
			default: System.out.println("잘못된 접근입니다.");
		}
	}

	private void addStd() throws Exception {
		if(std==null)throw new Exception("학생 관리 리스트가 생성되지 않음");
		System.out.println("학생을 추가합니다.");
		System.out.println("이름을 입력해주세요.");
		String name=scan.nextLine();
		System.out.println("학년을 입력해주세요.");
		int grade = scan.nextInt();
		System.out.println("반을 입력해주세요.");
		int classNum = scan.nextInt();	
		System.out.println("번호을 입력해주세요.");
		int stdNum = scan.nextInt();
		Student tmp=new Student(name, grade, classNum, stdNum);
		if(std.contains(tmp)) {System.out.println("중복된 학생");return;}
		std.add(tmp);
		System.out.println("추가완료");
		stdCount++;
	
		
		
	}

	private void printStd() throws Exception{
		if(std==null)throw new Exception("학생 관리 리스트가 생성되지 않음");
		if(std.size()==0) {System.out.println("등록된 학생이 없습니다."); return;}
		printSubMenu();
		int select=scan.nextInt();
		scan.nextLine();
		switch(select) {
		case 1: printAll();
			break;
		case 2: printA();
			break;
		case 3: return;
		default: System.out.println("잘못된 접근입니다."); printStd();
		}
		
	}

	private void printA() {
		System.out.println("검색할 학생의 이름을 입력해주세요.");
		System.out.println("이름을 입력해주세요.");
		String name=scan.nextLine();
		int count=0;
		for(int i=0; i<std.size();i++) {
			if(std.get(i).getName().equals(name)) {
				System.out.println(std.get(i));
				count++;
			}
			
		}
		if(count==0)System.out.println("해당하는 학생이 없습니다.");
		
		
		
		
	}

	private void printAll() {
		System.out.println("전체 학생정보입니다.");
		for(int i=0; i<std.size();i++) {
			System.out.println(std.get(i));
		}
		
	}

	private void printSubMenu() {
		System.out.println("1. 학생정보 전체출력");
		System.out.println("2. 학생정보 검색");
		System.out.println("3. 이전으로");
		
	}

	private void printMenu() {
		System.out.println("1. 학생추가");
		System.out.println("2. 학생정보출력");
		System.out.println("3. 시스템 종료");
		
	}

}
