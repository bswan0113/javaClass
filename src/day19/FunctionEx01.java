package day19;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;


public class FunctionEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(4, 8, 8, "5", 1, 1,1));
		list.add(new Student(1, 11, 4, "김개똥", 100, 200, 150));
		list.add(new Student(2, 2, 7, "육계덕", 4000, 12191092, 4));
		list.add(new Student(3, 1, 2, "곽덕수", 70, 85, 98));
		
		
		/* 학생들의 국어 성적만 출력하는 코드를 작성하세요.
		 * 학생들의 영어 성적만 출력하는 코드를 작성하세요.
		 * 학생들의 수학 성적만 출력하는 코드를 작성하세요.
		 * */
/*	printK(list);	
	System.out.println("\n\n\n");
	printE(list);
	System.out.println("\n\n\n");
	printM(list); 
	*/
	/*	lamPrint(list, (a) -> System.out.println(a.getEng()));
		lamPrint(list, (a) -> System.out.println(a.getKor()));
		lamPrint(list, (a) -> System.out.println(a.getMath())); */
		

		print(list, "국어", (s) -> s.getKor() );
		print(list, "영어", (zxfoqjfka) ->zxfoqjfka.getEng());
		print(list, "수학", (zzxianiaofgaigaigoaiifahoifahiofhaoifhaoigiuaguiasbfiuabfa) ->zzxianiaofgaigaigoaiifahoifahiofhaoifhaoigiuaguiasbfiuabfa.getMath());
	
		
	
	
	}
	public static void print(ArrayList<Student> list, String subject, Function<Student, Integer> f) {
			for(Student tmp : list) {
				System.out.println(subject + " : " + f.apply(tmp));
			}
		
	}
	
	public static void lamPrint(ArrayList<Student> list, Consumer<Student> a) {	
		for(Student tmp : list) {
			a.accept(tmp);
		}				
	}

public static void printE(ArrayList<Student> list) {
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i).getName() + "의 영어 성적은 : ");
		System.out.println(list.get(i).getEng() + "점");
		}
	}
public static void printM(ArrayList<Student> list) {
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i).getName() + "의 수학 성적은 : ");
		System.out.println(list.get(i).getMath() + "점");
		}
	}
public static void printK(ArrayList<Student> list) {
	
	for(int i=0; i<list.size();i++) {
		System.out.print(list.get(i).getName() + "의 국어 성적은 : ");
	System.out.println(list.get(i).getKor() + "점");
	}
}
}
