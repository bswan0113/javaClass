package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		// for문에서 continue를 만나면 증감식으로 이동
		int i;
		for(i=0; i<10; i++) {
			System.out.print("Hello, World! ");
			if(i%2==0) {
			continue;}
			System.out.println();
		}

	}

}
