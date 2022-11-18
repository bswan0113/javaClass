package day20;

import java.util.ArrayList;

import lombok.Data;

public class EqualsEx01 {

	public static void main(String[] args) {
		test t1 = new test();
		t1.setNum(10);
		System.out.println(t1.equals((Integer)10));
		
		ArrayList<test> list = new ArrayList<test>();
		list.add(t1);
		System.out.println(list.contains((Integer)10));
		System.out.println(list.indexOf((Integer)10));
		
		// list의 contains와 indexOf는 test의 equals를 바로 호출하지 않고 Objects.equals(o1. o2)를 호출한뒤 내부에서 비교
		//후에 test equals를 호출
		/* 두 객체가 같은 클래스인 겨웅
		 * contains() -> Object.equals() -> Test.equals()
		 * 두 객체가 다른 클래스인 경우
		 * contains() -> Object.equals() -> false
		 * 
		 * 어느 한쪽의 강제형변환을 필요로 하는 두 객체를 비교하는 경우에는 contains와 indexOf는 사용할 수 없음
		 * */
	
	}

}

@Data
class test{
	private int num;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			{if(obj instanceof Integer) return num==(Integer)obj; return false;}
		test other = (test) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}