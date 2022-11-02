package day08;

import java.util.Scanner;

public class MethodBaseballGameEx01 {
	/* 1~9사이의 중복되지 않은 3개의 숫자가 랜덤으로 생성이 되고, 생성된 숫자를 맞추는 게임
	 * 규칙
	 * - 숫자가 같은 자리에 있으면 Strike
	 * - 숫자가 있지만 다른 자리에 있으면 Ball
	 * - 일치하는 숫자가 하나도 없으면 Out
	 * ex)( 랜덤 숫자 : 5 9 8)
	 * 입력 : 1 2 3 out!
	 * 입력 : 4 5 6 1Ball
	 * 입력 : 7 8 9 2Ball
	 * 입력 : 7 9 8 2Strike!
	 * 입력 : 7 9 5 1Strike 1Ball!
	 * 입력 : 5 9 8 3Strike Game set Player Win!!!
	 * */
	/*
	 * 1. 랜덤으로 3개의 수를 선택
	 * 2. 사용자가 숫자를 선택
	 * 3. 판별
	 * 4. 2~3을 반복
	 * */
	public static void main(String[] args) {
		int min=1, max=9, size=3;
		System.out.println("게임을 시작합니다.");
		Scanner scan = new Scanner(System.in);		
		
		int[]newGame=newGame(min, max, size);
		for(int tmp : newGame) {
			System.out.print(tmp + " ");
		}
		int []player = new int[size];
	int strike=size+1, ball;
		while(strike!=size) {
			System.out.println("숫자를 입력하세요.");
			for(int i=0; i<player.length;i++) {
				player[i]=scan.nextInt();
				}
			strike =strike(newGame,player);
			ball=ball(newGame,player);				
			
			playGame(ball,strike,size);}

		

		System.out.println("게임을 종료합니다.");
		
		
	scan.close();}	
	//createRandomArray// 게임을 시작하는 메서드
	public static int[] newGame(int min, int max, int size) {
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
	// contains
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

/*기능  : 주어진 두 배열의 구성요소를 비교하여 숫자만 일치하는 개수를 돌려주는 매서드
매개변수 : 두 배열 => int[] newGame, int[]player
리턴타입 : 일치하는 개수 => int
매소드명 : ball
 */
	public static int ball(int newGame[], int player[]) {
		if (newGame == null || player == null) {
			return 0;
		}
		
		int ball=0;
		for(int i=0; i<newGame.length; i++) {
		for(int j=0; j<player.length; j++) {
			
			if(newGame[i]==player[j]) {
				if(i!=j) {
				ball++;
				break;
			}}
		}
	}


		
		
		return ball;
	}
	
	

/*기능  : 주어진 두 배열의 구성요소와 위치를 비교하여 둘 다 일치하는 개수를 돌려주는 메서드
매개변수 : 두 배열 => int[] newGame, int[]player
리턴타입 : 일치하는 개수 => int
매소드명 : strike
 */
	public static int strike(int[] newGame, int[]player) {
		if (newGame == null || player == null) {
			return 0;}
			int strike=0;
			
			for(int i=0; i<newGame.length;i++) {
				
				if(newGame[i]==player[i]) {
					strike++;
				}
				
			}
		
		return strike;
	}

/*	기능	   : 메서드 ball과 strike, 게임사이즈의 값을 입력받아 S,B,O의 값을 저장하는 메서드
 * 	매개변수 : ball, strike => int ball, int strike, int size
 * 	리턴타입 : int
 * 	매서드명 : judge
 * */

	

/*	기능 : 메서드 ball과 strike, judge의 값을 입력받아 S,B,O를 출력하는 메서드
 * 	매개변수 : ball, strike, judge
 * 	리턴타입 : void
 * 	매서드명 : playGame
 * */
	public static void playGame(int ball, int strike,int size) {
		int judge = 0;
		if(ball==0 && strike==0) {
			judge=0; System.out.println("OUT!");
		}
		else if(strike==size) {
			judge=1; System.out.println("Game set! Player change"); 
		}
		else {
		judge=2; System.out.println(ball +"Ball, " + strike + "Strike."); }
	}
		
		
	

	/**
	 * 기능 : Scanner가 주어지면 정수를 size개 만큼 입력받아 배열에 저장하고,
	 * 			저장된 배열을 돌려주는 메소드
	 * 매개변수 : Scanner, size => scanner scan, int size;
	 * 리턴타입 : 정수 배열 => int []
	 * 매소드명 : scanArray
	 * @param scan Scanner
	 * @param size 입력받을 정수의 개수
	 * @return 입력받은 값들이 저장된 배열
	 * */
	public static int[] scanArray(Scanner scan, int size) {
		if(size <=0) {
			return null;
		}
		int [] arr = new int[size];
		for(int i = 0; i< size; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

}