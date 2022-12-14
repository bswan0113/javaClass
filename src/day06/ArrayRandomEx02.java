package day06;

public class ArrayRandomEx02 {

	public static void main(String[] args) {
		//랜덤으로 1~9사이의 숫자를 중복되지 않게 3개생성하여 배열에 저장하는 코드를 작성하시오.
		
		int size = 3;
		int arr[] = new int[size]; // 랜덤 수를 저장할 배열
		int count = 0; //저장된 랜덤 수의 개수
		int min = 1;
		int max = 9;//랜덤 수의 범위
		
		// 배열에 저장된 중복되지 않은 수가 3개가 될 때까지 반복해야함
		while(count < 3) { //반복횟수가 정해져있지않으면 while문 사용이 유용
			//랜덤함수 생성
			int r = (int)(Math.random()*(max-min+1)+min);
			
			boolean isDuplicated = false;
			//배열에 저장된 수중에서 랜덤한 수와 일치하는 숫자가 있는지 없는지 확인하여
			// 저장된 숫자개수만큼 반복 => i는 0번지부터 저장된 갯수보다 작을때까지
			for(int i=0; i < count; i++) {
				//배열에 저장된 숫자 갯수만큼 확인
				//i번지에 있는 숫자와 랜덤수가 같으면 isDuplicated를 true로
				if(arr[i] ==r) {
					isDuplicated = true;
				}
			}
			//있으면 다시처음으로,
			//isDuplicated가 true이면
			if(isDuplicated) {
				continue;
			}
			// 없으면 배열에 저장하고, 저장된 개수 1 증가
			// isDuplicated가 false이면
			else { // else 생략가능
				arr[count]=r; // arr[count++] = r; 
				
				count++;
			}
		}
		
		for (int tmp : arr) {
			System.out.print(tmp+"  ");
		}
	
		
		
		//랜덤한 수 생성
		// 배열에 저장된 수 중에서 랜덤한 수와 일치하는 숫자가 있는지 없는지 확인
			//배열에 저장된 숫자개수만큼 반복=>i는 0번지부터 저장된 개수보다 작을때까지
			// i번지에 있는 숫자와 랜덤수가 같으면 isDuplicated를 true로
		// 있으면 다시 처음으로,
		// isDuplicated가 true이면
		
		// 없으면 배열에 저장하고, 저장된 개수 1 증가
		// isDuplicated가 false이면
	}

}
