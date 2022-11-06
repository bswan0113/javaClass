package cute31;

import java.util.Scanner;

public class CuteAndCuteThirtyone {
/*메뉴

1. 플레이
//컴퓨터가 랜덤 1~3개의 숫자를 부름
//사용자가 몇개의 숫자를 부를지 입력
2. 기록확인
3. 종료
 * */
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 프로그램 실행시 메뉴 출력
		
		printMenu(
				"BaskinRobbins 31",
				"1. PLAY GAME ",
				"2. RECORD ",
				"3. QUIT");
		
		// 메뉴선택
		int select;
		select = selectInt();
		//메뉴출력
		printMenu(select);

	
	}
	
	//메뉴 실행
private static void printMenu(int select) {
	switch(select) {
	case 1: 
	play31();
		break;
	case 2:
		break;
	case 3:System.out.println("It was a good time. See you again.");
		break;
	default:
		System.out.println("Please select a number from 1, 2, or 3 again");
	}
	
}
/**
 * 게임 실행 메소드//
 * size를 입력받아, 최종숫자가 size가 될때까지, 컴퓨터와 플레이어가 번갈아가며 숫자를 1씩 n번 더한 뒤 더한 숫자를 출력
 * n은 1~3까지 컴퓨터는 랜덤하게, 플레이어는 임의로 결정  
 * @return 컴퓨터가 승리했다면 loseCount를, 플레이어가 승리했다면 winCount를 1 추가하여 반환
 * */
private static int play31() {
	System.out.println("Please enter the last number in the game. : ");
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	int winCount=0;
	int loseCount=0;
	
	
				
		for(int i=1; i<size;) {
				int com=random(1,3);
				//시작 숫자는 i, 마지막숫자는, i+com, 총갯수는 com
				// i+1, i+2, i+com 출력 => i+1부터, i+com까지 출력	
				System.out.print("Computer : "  );
				for(int j=0; i+j<i+com; j++) {
					System.out.print(i+j+" ");
											}				
								i+=com;
						if(i==size-1){
								System.out.println("YOU LOSE!");
								loseCount++;
								return loseCount;
									}
									
				int userTurn=scan.nextInt();
				System.out.print("You: ");
				for(int j=0; i+j<i+userTurn; j++) {
					System.out.print(i+j+" ");
												}
				i+=userTurn;
				System.out.println();	
						if(i==size-1) {
							System.out.println("YOU WIN!");
							winCount++;
							return winCount;
									}
						
							}
		
	
	
	
	
	return 0;
	}




/**유저의 턴에 입력받는 메소드
 *  1~3의 갯수를 지닌 배열을 입력받아
 *  배열의 갯수를 되돌려주는 메소드 ==> 는 아직 무리 즉 포기
 * 
 * */
//	private static int userTurn(int i) {
//		Scanner scan = new Scanner(System.in);
//		int arr[];
//		for(int j=0;j<3;j++) {
//			arr[j]=scan.nextInt();
//			
//		}
//		
//	return arr.length;
//}

	//메뉴입력
	private static int selectInt() {
		Scanner scan = new Scanner(System.in);
				return scan.nextInt();
}

	//메뉴출력
private static void printMenu(String ...str) {
	for(int i=0; i<str.length; i++) {
	System.out.print(str[i]+"\n");}
	
}

public static int random(int min, int max) {
	return (int)(Math.random()*(max-min+1)+min);}
}
