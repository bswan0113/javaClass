package day25;

import java.util.Scanner;

import lombok.Data;

public class Ex04 {
	/*컴퓨터와 가위, 바위, 보를 하는 프로그램을 작성하세요.
	 * 예: 
	 * 사용자: 가위
	 * 컴퓨터 : 보
	 * 사용자가 이겼습니다! 더하시겠습니까?(y/n):y
	 * 사용자 : 가위
	 * 컴퓨터 : 주먹
	 * 컴퓨터가 이겼습니다! 더하시겠습니까?(y/n) :n
	 * 
	 * 컴퓨터 1회 승리, 사용자 1회 승리
	 * 
	 * 무승부!
	 * 
	 * */
	
	
	
	static User user= new User();
	static Computer computer=new Computer();
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {		
		do {
			
			play();
//			System.out.println("더할거? (y/n)");
//			String userPlay=scan.nextLine();
			
//		if(userPlay.contains("n")) {
//			System.out.println(user.winCount+"번 이겼습니다.(컴퓨터 승리 횟수 : "+ computer.winCount+")");
//			break;}	
		
		if(user.winCount==3) {
			System.out.println("YOU WIN!");break;
		}
		if(computer.winCount==3) {
			System.out.println("YOU LOSE"); break;
		}
		}while(true);
	}	
	private static void play() {
		System.out.println("가위 바위 보!");
		String userPlay=scan.nextLine();
		int a =user.battleuser(userPlay);
		computer.random();
		System.out.println(computer.battleComputer());
		int b =computer.getPlay();
		
		judge(a, b);
		
			
	}
	static void judge(int a, int b) {
		if(a==0) {
			System.out.println("??");
		}
		else if(a==b) {
			System.out.println("무승부!");
		}
		else if(a==1&&b==2) {
			System.out.println("패배!");
			computer.winCount++;
		}
		else if(a==1&&b==3) {
			System.out.println("승!");
			user.winCount++;
		}
		
		else if(a==2&&b==1) {
			System.out.println("승!");
			user.winCount++;
		}
		else if(a==2&&b==3) {
			System.out.println("패배!");			
			computer.winCount++;

		}
		else if(a==3&&b==1) {
			System.out.println("패배!");			
			computer.winCount++;

		}
		else if(a==3&&b==2) {
			System.out.println("승!");
			user.winCount++;
		}
	}

}
@Data
class  RockPaperScissors{
	int play;//1~3
	int winCount=0;
		
	
}


class User extends RockPaperScissors{
	
	int battleuser(String a) {
		switch(a) {
		
		case "가위": return this.play=1;
		case "바위": return this.play=2;
		case "보": return this.play=3;
		default: return 0;
		}
	
		
	}
}


class Computer extends RockPaperScissors{

	void random() {
	}
	
	String battleComputer() {
		
		this.play=(int)(Math.random()*2+1);
		switch(this.play) {
		
		case 1: return "가위";
		case 2: return "바위";
		case 3: return "보";
		default: return null;
		}
	}
	
}