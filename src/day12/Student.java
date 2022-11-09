package day12;

public class Student {
	private int grade, classNum, num;
	private String name;

	
	public void print() {
		
	}
	
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + grade;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// Object obj => 매개변수의 다형성, 상속받은 모든 객체가 equals에 올 수 있음
			return true; // 같은 객체 공유
		
		if (obj == null)
			return false; //null과 비교 불가능
		
		if (getClass() != obj.getClass())
			return false; //obj가 같은 클래스의 객체가 아닌 경우
		Student other = (Student) obj;
		if (classNum != other.classNum)
			return false;
		if (grade != other.grade)
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	

}
