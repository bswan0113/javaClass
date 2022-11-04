package day09;

public class Player {
	private String Player;
	private int playNum=0;
	public void print() {
		System.out.println(Player +": " + playNum);
	}
	public Player(String player, int playNum) {
		Player = player;
		this.playNum = playNum;
	}

	public int getPlayNum() {
		return playNum;
	}
}
