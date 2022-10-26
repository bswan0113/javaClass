package day03;

public class ForEx03 {

	public static void main(String[] args) {
		
		// 구구단 2단을 출력하는 코드를 작성하세요.
		
		int i;
		int n;
		 
			for(n=2; n<10; n++) {
				System.out.println();
				
				for(i=1; i<10; i++)
				System.out.println(n + "X" + i + "=" + i*n  );
				
			}
//			
//			
//		int i;
//		int num = 2;
//		for(i = 1; i <=9; i++) {
//			System.out.println(num + " X " + i + " =  " + num*i);
//		} 

	}

}
