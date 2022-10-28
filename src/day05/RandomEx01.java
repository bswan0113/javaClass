package day05;

public class RandomEx01 {

	public static void main(String[] args) {
		// min~max 사이의 랜덤한 값을 지니는 정수를 생성하는 예제
		int min = -50, max = 50;
		/*Math.random() : 0이상 1미만의 랜덤한 실수를 생성해줌
		 * 0 <= Math.random() <1   * ( Max - min + 1)
		 * -> 0 <= Math.random()*(Max - min + 1) < (Max -Min + 1)   +Min
		 * -> Min <= Math.random()*(Max - min + 1) + Min < Max +1
		 * */
		
		int r = (int)(Math.random()*(max-min+1) + min);
		
		System.out.println(r);

	}

}
