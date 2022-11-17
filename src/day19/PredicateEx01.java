package day19;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(4, 8, 8, "5", 1, 1,1));
		list.add(new Student(1, 1, 4, "김개똥", 100, 200, 150));
		list.add(new Student(1, 2, 7, "육계덕", 4000, 12191092, 4));
		list.add(new Student(1, 1, 2, "곽덕수", 70, 85, 98));
		
		/* 1학년 1박 학생들을 출력하는 코드를 자성
		 * 1학년 2반 학생들을 출력하는 코드를 작성
		 * 1학년 학생들을 출력하는 코드를 작성
		 * */
		
/*		System.out.println("----------1학년 1반-------------");

		print11(list);
		System.out.println("-----------1학년 2반------------");

		print12(list);
		System.out.println("------------1학년 -----------");
		
		print1(list); */
		
	

		print(list, (s)->s.getGrade()==1 && s.getClassNum()==1);
		print(list, (s) -> s.getGrade()==1);
		print(list, (s) -> s.getName().charAt(0)=='육');
	
	}
	public static void print2(ArrayList<Student> list, int grade, int classNum) {
		for(Student tmp : list) {
			if(tmp.getGrade()==grade && tmp.getClassNum()==classNum) {
				System.out.println(tmp);
				
			}
			
		}
	}
	public static void print2(ArrayList<Student> list, int grade) {
		for(Student tmp : list) {
			if(tmp.getGrade()==grade) {
				System.out.println(tmp);
				
			}
			
		}
	}

	public static void print(ArrayList<Student> list, Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
			
		}
	}

	
	
	public static void print1(ArrayList<Student> list) {
		for(int i=0; i<list.size();i++) {
		if(list.get(i).getGrade()==1)
			System.out.println(list.get(i));
		}
	}
	public static void print11(ArrayList<Student> list) {
		for(int i=0; i<list.size();i++) {
		if(list.get(i).getClassNum()==1 && list.get(i).getGrade()==1)
			System.out.println(list.get(i));
		}
	}
	public static void print12(ArrayList<Student> list) {
		for(int i=0; i<list.size();i++) {
		if(list.get(i).getClassNum()==2 && list.get(i).getGrade()==1)
			System.out.println(list.get(i));
		}
	}

}
