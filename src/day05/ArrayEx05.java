package day05;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 5개짜리 배열을 생성하여 2부터 5개의 소수를 배열에 저장하고 출력하세요.
	    // 반복횟수 : i가 2부터 1씩증가	
		// 규칙성 : i가 소수이면 i번지에 num을 저장
		// i를 1씩 증가
		// i가 배열의 크기와 같으면 반복문을 종료
		// 반복문 종료후 : 배열의 값을 출력
		
		int num; // 소수인지 판별하는 수;
		int i; // 약수를 찾기 위해 1부터 num까지 증가시키려는 수
		int count; //num의 약수의 갯수
		int index=0;
		int prime[] = new int[5];
		
		for (num=2; ; num++) {
			//num이 소수인지 판별하는 코드
			for(i=1, count=0;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if (count ==2 ) {
				prime[index]=num;
				index++;
				
			}
			if(index == prime.length) {
				break;
			}
			
		}
		
		for(int tmp : prime) {
			System.out.println(tmp + "");
		}
		}
	
	}

	


