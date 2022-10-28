package day05;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		/* 학생 5명의 국어 성적을 입력받고 출력하는 코드를 작성하시오.
		 * 반복 횟수 : i는 0부터 배열의 크기보다 작을때까지 1씩 증가
		 * 규칙성 : 콘솔에서 입력받은 정수를 배열 i번지에 저장 후배열 i번지에 있는 값을 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int student[] = new int[5];
		int i;
		
		String studentName[] = new String[5];
		

		for(i=0;i<studentName.length;i++) {
			System.out.println(i+1 +"번째 학생의 이름을 입력하시오.");
			studentName[i]= scan.nextLine();}
		
		for(i=0;i<student.length;i++) { //배열에 할당시 사용
			System.out.println(studentName[i]+" 학생의 국어 성적을 입력하시오.");
			student[i]= scan.nextInt();
										  }
		for(i=0;i<student.length;i++) {
			System.out.println(studentName[i]+"의 성적은 " +student[i]+"입니다.");					
										  }
	/*
	 *  학생 성적의 평균을 구하는 코드를 작성하세요.
	 * */
		double sum=0;
		for(i=0;i<student.length;i++) {
			sum +=student[i];
			
		}
		
		System.out.println("모든 학생의 총 성적의 평균은 " +(sum/i) + "입니다.");
		
		/* 향상된 for문 예제
		
		sum = 0;
		for(int tmp : stduent){
		sum+=tmp;}
		 * */
		
		for(i=0;i<student.length;i++) {
			if(student[i] >80) {
					System.out.println(studentName[i]+"는 우리와 함께 갈 수 있습니다. 목걸이 받으시죠.");
			}
					else {
						System.out.println(studentName[i]+"는 불합격입니다. 죄송합니다. 밥챙겨드시고 조심히 들어가세요.");
					
			}
		}
		
		
		

		scan.close();
}
	}

