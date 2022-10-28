package day05;

public class ForEx01 {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=5; i++)
		{
			System.out.println(i);
		}
		System.out.println("------------------------------");
		for(i=1; i<=5; i++);
		{
			System.out.println(i);
		}
		System.out.println("------------------------------");
		
		i=4;
		
		if (i%2==0)
		{
			System.out.println("짝수");
		}
		else;
		{
		 System.out.println("홀수");	
		}
// 조건문은 실행문이 1줄이면 {}생략 가능.
	}

}
