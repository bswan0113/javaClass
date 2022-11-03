package day09;

public class Player {
	private String Player;
	private int playNum=0;
	public void print() {
		System.out.println(Player +": " + playNum);
	}
	public void updatePlayNum(int playNum) {
		this.playNum=playNum;
	}
	public Player() {
		this.Player=" ";
		this.playNum=0;
	}
}
