package day08;

public class MethodArguments {
/* 매개변수의 개수를 다양하게 하고싶을때
 * 매개변수에 자료형... 배열명 => 메소드에서 배열처럼 사용
 * */
	public static void main(String[] args) {

	 
	}

	public static int sum(int ...nums) {
		if(nums == null || nums.length==0)
			return 0;
		
		int sum=0;
		for(int num : nums) {
			sum+= num;
		}
		return sum;
	}
	public static int sum() {
		return 0;
	}
	public static void score(int grade, int classNum, int num, String name, int ...score) {
		// 가변인자는 항상 마지막에 위치
		
	}
	
}

