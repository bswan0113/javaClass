package day19;

import java.util.ArrayList;
import java.util.function.Consumer;



public class ConsumerEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(4, 8, 8, "5"));
		list.add(new Student(1, 11, 4, "김개똥"));
		list.add(new Student(2, 2, 7, "육계덕"));
		list.add(new Student(3, 1, 2, "곽덕수"));
		
		print(list, (a) -> System.out.println(a));
		print(list, (a) -> {
			System.out.println("학년 : " +a.getClassNum());
			System.out.println("성적 : "  + a.getName());
			System.out.println("교우관계 : " + a.getNum());
			System.out.println("부모님 직업 : " + a.getGrade());
		});
		
		
		

	}

	public static void print(ArrayList<Student> list,Consumer<Student> con) {
		for(Student tmp : list) {
			con.accept(tmp);
		}
		
	}
}
