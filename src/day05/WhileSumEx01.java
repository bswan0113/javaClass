package day05;

public class WhileSumEx01 {

	public static void main(String[] args) {
		// 1부터 10사이 홀수의 합을 구하는 코드를  while문으로 작성하시오
		
		int num=0;
		int sum=0;
		
		while(++num<11) {
			if(num%2==1)
				sum+=num;
			
		}
		System.out.println(sum);

	}

}
