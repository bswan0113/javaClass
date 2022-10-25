package day02;

import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		/*
		 *  홍길동 학생의 국어, 영어, 수학 점수를 콘솔에 입력받고
		 *  홍길동 학생의 평균 성적을 콘솔에 출력하는 코드를 작성하시오
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력하시오.");
		float korean = scan.nextFloat();
		
		System.out.println("영어 점수를 입력하시오.");
		float english = scan.nextFloat();
		
		System.out.println("수학 점수를 입력하시오.");
		float math = scan.nextFloat();
		
		float avg = (korean + english + math)/3;
		
		System.out.printf( "%s의 평균점은  %.6f입니다.\n\n\n",name,avg);
		

		
		//teacher Ver
		int kor, eng, matht, sum;
		double avgt;

		//scanner를 통해 성적을 입력
		
		System.out.print("국어 성적을 입력하세요 : ");
		kor = scan.nextInt();
		System.out.print("영어 성적을 입력하세요 : ");
		eng = scan.nextInt();
		System.out.print("수학 성적을 입력하세요 : ");
		matht = scan.nextInt();
		
		scan.close();

		//총점을 계산
		sum = kor + eng + matht;
		
		//평균을 계산
		avgt = (double)sum / 3.0;
		
		//평균을 출력
		System.out.println("평균은" + avgt + "입니다.");
		
		//통과입니까? true/false
		//평균이 60점이상이면 true, 아니면 false
		
		boolean pass = avgt >= 60;
		boolean youFailedForeverGuys = pass == !true;
		System.out.println("통과입니까?" + pass);
		System.out.println("통과입니까?" + !youFailedForeverGuys);
			
	}

}
