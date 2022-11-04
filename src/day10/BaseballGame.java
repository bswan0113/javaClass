package day10;

import java.util.Arrays;

public class BaseballGame {
	private int []com;
	private int []user;
	private int strike;
	private int ball;
	
	
	public BaseballGame(int []com) {
		this.com = Arrays.copyOf(com, com.length);
	}
	public void setUser(int []user) {
		this.user = Arrays.copyOf(user, user.length);
		calculateResult();
	}
	public void calculateResult() {
		calculateBall();
		calculateStrike();
	}
	
	private void calculateStrike() {
		int count = 0;
		int size = com.length < user.length ? com.length : user.length;
		for(int i = 0 ; i<size; i++) {
			if(com[i] == user[i]) {
				count++;
									}
			}
		strike =count;
		
	}
	private void calculateBall() {
		int count=0;
		for(int i = 0; i<com.length; i++) {
			for(int j=0; j<user.length; j++) {
				if (com[i] == user[j] &&i!=j) {
					count++;
				}
			}
		}
		ball = count;
	}
	/**기능 :strike와 ball의 개수가 주어지면 콘솔에 결과를 출력
	 * @param strike 스트라이크의 개수
	 * @param ball 볼의 개수
	 * */
	public void printGame() {
		if(strike !=0) {
			System.out.print(strike +"S ");
		}
		if(ball !=0) {
			System.out.println(ball + "B ");
			
		}
		if(strike==0 && ball==0) {
			System.out.println("OUT");
		}
		
		}
	public int getStrike() {
		return strike;}

}


