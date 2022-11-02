package day08;

import java.util.Arrays;
import java.util.Scanner;

public class MethodLottoEx01 {

	public static void main(String[] args) {
		int min = 1;
		int max = 45;
		int size = 6;
		
		//로또 생성
		int []lotto=createRandomArray(min, max, size);
		
		System.out.print("로또 번호 : ");
		//로또 정렬
		Arrays.sort(lotto);
		//로또 출력
		printArray(lotto);
		
		int bonus;		
		
		// Teacher - bonus
		
		do { 
			bonus = random(min,max);
			}while(contains(lotto,bonus));
		

		// 보너스 번호 출력
		System.out.println("보너스 번호는 " + bonus + "입니다.");
		
		//로또 번호 입력
		int []user = new int[size];
		System.out.println("입력번호: ");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<user.length; i++) {
			user[i]=scan.nextInt();
		}
		scan.close();	
		
		int rank = getRank(lotto, bonus, user);
		printRank(rank);
		
	}
	// 당첨 등수를 알려주는 메소드를 작성하시오.
		/*	기능1 : 일치하는개수(countLotto)와 랜덤으로 생성된 보너스번호에 따라 당첨 결과를 저장
	 * 	기능2 : 두 배열(lotto,user)과 보너스 번호를 입력받아 당첨 결과를 저장
	 * 	매개변수 : countLotto, bonus => int, int 
	 * 	매개변수 2 : int []lotto, int []user[], int bonus
	 * 	리턴타입 : 당첨 결과 => String
	 *  메소드명 : lottoResult 
	 * */
		public static String lottoResult(int lotto[],int user[], int bonus) {
		
		
		
		switch(countLotto(lotto,user)){
		
				case 6:
					return "1등입니다.";
				case 5:
					if(contains(user,bonus)) {
					return "2등입니다.";}
					
					else { 
					return "3등입니다.";}
				case 4:
					return "4등입니다.";
				case 3:
					return "5등입니다.";
				default:
					return "여지없이 고민의 여지도 없이 그 무엇도 없이! 꼴등입니다.";
					
				}
	}
		
		/*		기능 : 주어진 두 배열에서 일치하는 숫자의 개수를 알려주는 메소드
	 * 		매개변수 : 주어진 두 배열
	 * 		리턴타입 : 일치하는 숫자의 갯수 => int
	 * 		메소드명 : countLotto
	 * 
	 * */	
		public static int countLotto(int lotto[], int user[]) {
			if (lotto == null || user == null) {
				return 0;
			}
			
			int countLotto=0;
			
//			for(int i=0; i<lotto.length; i++) {
//				for(int j=0; j<user.length; j++) {
//					if(lotto[i]==user[j]) {
//						countLotto++;
//						break;
//					}
//				}
//			}
//			Teacher Ver.
			for(int tmp : lotto) {
				if(contains(user, tmp)) {
					countLotto++;
				}
			}
			
			
			return countLotto;
		}
	
		//주어진 배열을 출력
		public static void printArray(int arr[]) {
			if(arr == null) { // 예외처리
				return;
			}
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
		}

		//지정된 범위의 난수 생성
		public static int random(int min, int max) {
			if (min > max) {
				int tmp = min;
				min = max;
				max = tmp;
			}
			return (int)(Math.random()*(max-min+1)+min);}

		//배열에 특정 수가 있으면 true를 반환
		public static boolean contains(int arr[], int num) {
			if (arr == null || arr.length == 0 ) {
				return false;
			}
			int i=0;
			for(;i<arr.length;i++) {
				if(arr[i]==num) {
					return true;}
									}				
		return false;
														}
		
		//Teacher Ver.
		public static int[] createRandomArray(int min, int max, int size) {
			if(max - min +1<=size) {
				return null;
			}
			int arr[] = new int[size];
			for(int i=0; i<arr.length;) {
				int r=(int)(Math.random()*(max-min+1)+min);
				if(!contains(arr,r)) {
					arr[i]=r;
					i++;
				}
			}
			
			return arr;	

	}

		/* 기능 : 로또 번호와 입력번호가 주어지면 등수를 알려주는 메소드
		 * 매개변수 : 로또 번호, 입력번호 => int []lotto, int bonus, int []user
		 * 리턴타입 : 등수 => 정수 => int
		 * 메소드명 :getRank
		 * */
		
		public static int getRank(int []lotto, int bonus, int []user) {
			int count = countLotto(lotto, user);
			switch(count) {
			case 6: return 1;
			case 5: return contains(user, bonus)? 2 : 3;
			case 4: return 4;
			case 3: return 5;
			default: return -1;
			
			
			}
		}
		
		/*기능 : 등수가 주어지면 등수를 콘솔에 출력하는 메소드
		  매개변수 : 등수 => int rank
		  리턴타입 : void 
		  메소드명 :printRank
		 * */
		
		public static void printRank(int rank) {
			switch(rank) {
			case 1: System.out.println("1등입니다. 인생역전하셨네요."); break;
			case 2: System.out.println("2등입니다. 나름 쏠쏠해요."); break;
			case 3: System.out.println("3등입니다. 생각보다 얼마 안되네요."); break;
			case 4: System.out.println("4등입니다. 비상금으로 숨겨놔요."); break;
			case 5: System.out.println("5등입니다. 재뽑기!"); break;
			case -1: System.out.println("그럼 그렇죠 꼴등입니다. 뭘 기대했어요."); break;	
			}
		}
}
/* 메서드 분할
 *  1. 메서드의 재활용을 통해 코드의 길이를 줄일 수 있음
 *  2. 기능의 유지보수에 용이함 => 문제가 있는 해당 코드를 체킹하면됨
 *  3. 코드의 구조적인 분석에 용이함 => 메서드명 명확하게 만들수 있도록!
 * */
