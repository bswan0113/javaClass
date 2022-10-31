package day06;

import java.util.Scanner;

public class ArrayScoreEx01 {

	public static void main(String[] args) {
		/*5명 학생의 국어, 영어, 수학 성적을 저장하기 위한 배열을 만들고
		 * Scanner를 이용하여 입력받아, 국어평균, 영어평균, 수학 평균을 구하는 코드를 작성
		 * */
		
		Scanner scan = new Scanner(System.in);
		/*
		int size=5;
		String StName[] = new String[size];
		
		int KoreanScore[] = new int[size];
		int MathScore[] = new int[size];
		int EnglishScore[] = new int[size];
		
		
		
		
		for (int i=0; i<size; i++) {
			
			System.out.println(i+1+"번째 학생의 이름을 입력해주세요.");
			StName[i] = scan.next();
			
			System.out.println();
			
			System.out.println(StName[i] +"학생의 국어성적을 입력해주세요.");
			KoreanScore[i] = scan.nextInt();
			
			System.out.println(StName[i] +"학생의 영어성적을 입력해주세요.");
			EnglishScore[i] = scan.nextInt();
			
			System.out.println(StName[i] +"학생의 수학성적을 입력해주세요.");
			MathScore[i] = scan.nextInt();
			
			System.out.println();
			
		}
		
	

		double KAvg=0;
		double MAvg=0;
		double EAvg=0; 
		
		for (int i=0; i<size; i++) {
			KAvg+=KoreanScore[i];
			MAvg+=MathScore[i];
			EAvg+=EnglishScore[i];}
		
		
				
		
		System.out.println("학생들의  국어성적의 평균은" +KAvg/size+ " 입니다." );
		System.out.println("학생들의  수학성적의 평균은" +MAvg/size+ " 입니다."  );
		System.out.println("학생들의  영어성적의 평균은" +EAvg/size+ " 입니다."  );
		
		*/
	
	//	Teacher Ver.
		// 우선 배열생성의 기준을 선택 - 학생 or 성적
		int stdCount = 5;
		int kor[] = new int[stdCount];
		int eng[] = new int[stdCount];
		int math[] = new int[stdCount];
		
		// 학생별 국어, 영어, 수학 성적을 입력
		for(int i = 0; i < stdCount; i++) {
			System.out.print("학생 " +(i+1)+"의 국어, 영어, 수학 성적을 입력하세요.");
			kor[i] = scan.nextInt();
			eng[i] = scan.nextInt();
			math[i] = scan.nextInt();
			
		}
		
		// 과목별 합(총점)
		double korSum=0, engSum=0, mathSum = 0;
		for(int i = 0; i <stdCount; i++) {
			korSum += kor[i];
			engSum += eng[i];
			mathSum += math[i];
			
		}
		
		//과목별 평균
		System.out.println("국어 성적의 평균 : " + korSum/ stdCount);
		System.out.println("영어 성적의 평균 : "+ engSum/ stdCount);
		System.out.println("수학 성적의 평균 : "+ mathSum/ stdCount);
		
		// 학생별 평균
		double stSum;
		for(int i = 0; i < stdCount; i++) {
			stSum= kor[i] + eng[i] + math[i];
			System.out.println(i+1 +"번째 학생의 평균점은" + (stSum/3) +"입니다.");
			
		}
		
		
		
		
		
		
		
		scan.close();
	
	}
}
