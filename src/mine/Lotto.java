package mine;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
/*로또번호를 랜덤으로 생성하고, 당첨 번호를 입력하여 몇등에 당첨이 되었는지 출력하는 코드를 작성하시오.
 * 숫자범위 : 1~45
 * 1등 : 6개
 * 2등 : 5개 + 보너스번호
 * 3등 : 5개
 * 4등 : 4개
 * 5등 : 3개
 * 로또 번호 : 번호 6개와 + 보너스 번호 
 * */ 
		int size = 6;
		int arr[] = new int[size]; // 랜덤 수를 저장할 배열
		int count = 0; //저장된 랜덤 수의 개수
		int min = 1;
		int max = 45;//랜덤 수의 범위
		int bonus=0;
		
		// 6가지 생성
		while(count < size) { 
			int r = (int)(Math.random()*(max-min+1)+min);			
			boolean isDuplicated = false;	
			for(int i=0; i < size; i++) {			
				if(arr[i] ==r) {
					isDuplicated = true;
								}
										}		
			if(isDuplicated) {
				continue;
							}			
			else { 
				arr[count]=r;  				
				count++;
				}
						}
		
		// 보너스 번호 생성
		count=0;
		while(count<1) { 
			
			int r = (int)(Math.random()*(max-min+1)+min);			
			boolean isDuplicated = false;	
			for(int i=0; i < size; i++) {			
				if(arr[i] ==r) {
					isDuplicated = true;
								}
										}		
			if(isDuplicated) {
				continue;
							}			
			else { 
				bonus=r;  				
				count++;
				}
						}
		

System.out.println("당첨번호는 " + arr[0]+" "+ arr[1]+" "+  arr[2]+" "+  arr[3]+ " "+ arr[4]+ " "+ arr[5]+  " 이고 bonus 번호는 " + bonus + " 입니다.");
		
		
// 번호 입력		
		Scanner scan = new Scanner(System.in);
		int myLotto[] = new int[6];
		System.out.println("구입할 번호를 입력해주세요.");
		for(int i=0; i<size; i++) {
			
			myLotto[i] = scan.nextInt(); 
					}
		
		count=0;
		boolean cor = false;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(arr[i]==myLotto[j]) {
					count++;}
				
				
			}
			if(myLotto[i]==bonus) {
				cor = true;
				
			}
			
		}
		
		// 당첨 확인
		if(count==6) {
			System.out.println("1등입니다.");
		}
		else if(count==5 && cor==true) {
			System.out.println("2등입니다.");
		}
			
		
		else if(count==5) {
			System.out.println("3등입니다.");
		}
		else if(count==4) {
			System.out.println("4등입니다.");
		}

		else if(count==3) {
			System.out.println("5등입니다.");
		}
		else {
			System.out.println("꽝입니다.");
		}



		
		
	
// 랜덤으로 6개의 로또 번호 생성
// 보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지 않게)
// 당첨 번호 6개를 입력받음
// 일치하는 번호 개수를 구함(보너스 번호 제외)
// 등수 판별
		
		
		scan.close();
	}

}
