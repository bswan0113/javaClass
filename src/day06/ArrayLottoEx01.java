package day06;

import java.util.Scanner;

public class ArrayLottoEx01 {

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
		int lotto[] = new int[size]; // 랜덤 수를 저장할 배열
		int count = 0; //저장된 랜덤 수의 개수
		int min = 1;
		int max = 45;//랜덤 수의 범위
		
		// 1 0 0
		while(count < size) { 
			int r = (int)(Math.random()*(max-min+1)+min);			
			boolean isDuplicated = false;	
			for(int i=0; i < count; i++) {			
				if(lotto[i] ==r) {
					isDuplicated = true;
								}
										}		
			if(isDuplicated) {
				continue;
							}			
			else { 
				lotto[count]=r;  				
				count++;
				}
						}
		
		//보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지 않게)
		int bonus;
		while(true) {
			int r = (int)(Math.random()*(max-min+1)+min);
			boolean isDuplicated = false;
			for(int i=0; i <size; i++) {			
				if(lotto[i] ==r) {
					isDuplicated = true;
								}
										}		
			if(isDuplicated) {
				continue;
							}
			bonus = r;
			break;
		}
		System.out.println("보너스번호는 " + bonus + "입니다.");
		

		
		// 당첨 번호 6개를 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.println("\n당첨 번호 입력 : ");
		int user[] = new int[size];
		for( int i = 0 ; i < size; i++) {
			user[i] = scan.nextInt();
		}
scan.close();



//일치하는 번호 갯수를 구함(보너스 번호 제외)
int sameCount = 0;
for(int i=0; i<lotto.length; i++) {
	for(int j = 0; j<user.length; j++) {
		if(lotto[i] == user[j]) {
			sameCount++;
		}
	}
}

// 등수 판별
switch(sameCount) {

case 6:
	System.out.println("1등");
	break;
case 5: boolean isDuplicated = false;
		for(int i=0; i< user.length; i++) {
			if(user[i] == bonus) {
				isDuplicated = true;
			}
		}
		if(isDuplicated) {
			System.out.println("2등입니다.");
		}
		else {
			System.out.println("3등입니다.");
		}
	break;
case 4:System.out.println("4등");
	break;
case 3:System.out.println("5등");
	break;
default:System.out.println("꽝");
}

		
		
	
// 랜덤으로 6개의 로또 번호 생성
// 보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지 않게)
// 당첨 번호 6개를 입력받음
// 일치하는 번호 개수를 구함(보너스 번호 제외)
// 등수 판별
		
System.out.print("로또번호 확인: \n");

for(int tmp: lotto) {
	System.out.print(tmp + " ");
}
		
	}

}
