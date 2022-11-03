package day09;

public class AbstractionEx01T {

	public static void main(String[] args) {

		Student std1 = new Student(1,1,1,"홍길동");
		Student std2 = new Student();
		
		std2.print();
		std2.updateScore(50, 30, 45);
		std2.print();
		std1.print();
		std1.updateScore(50, 30, 45);
		std1.print();
	}
}
	class Student{
		//멤버변수
		private int grade;
		private int classNum;
		private int num;
		private String name;
		private int kor, eng, math;
		
		public void print() {
			System.out.println(grade + "학년 " + classNum + "반 " + num + "번 "+ name);
			System.out.println("국어 : " + kor +"영어 : " + eng +"수학 : " + math);
		}
		//메소드
		public void updateKor(int kor1) {
			kor=kor1;
		}
		public void updateEng(int eng1) {
			eng=eng1;
		}
		public void updateMath(int math1) {
			math=math1;
		}
		public void updateScore(int kor1, int eng1, int math1) {
			updateKor(kor1);
			updateEng(eng1);
			updateMath(math1);
		
	}
		//생성자
		public Student(){
			grade =1;
			classNum =1;
			num = 1;
			name = "";
		}

		public Student(int grade1, int classNum1, int num1, String name1) {
			
			grade = grade1;
			classNum = classNum1;
			num = num1;
			name = name1;
		}
		
}
