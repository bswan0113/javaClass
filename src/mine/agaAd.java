package mine;

public class agaAd {

	public static void main(String[] args) {
		inf(0);

	}
	public static void inf(int a) {
		if(a>10) {System.out.println(a-1);return;}
		
		inf(++a);
		
	}
}
