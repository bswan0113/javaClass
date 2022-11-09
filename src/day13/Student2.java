


package day13;
import java.util.Arrays;

import lombok.Data;
@Data
public class Student2 {
	//필드 : 학년, 반, 번호, 이름, 성적들
	private int grade;
	private int classNum;
	private int num;
	private String name;
	private Score []scoreList;
	private int maxSize; // 최대 저장 가능한 성적의 수
	private int count; //현재 저장된 성적의 수
	
	/**
	 * 학생 정보에 성적을 추가하는 메소드
	 * @param 추가할 성적
	 * @return 추가 여부
	 * */
	public boolean addScore(Score score) {
		//학생의 성적 정보들 중에서 과목, 학기가 같은 성적 정보가 없으면 추가
		if(score ==null) {
			return false;
		}
		if(count == maxSize) {
			return false;
		}
		
		for(int i=0; i<count;i++){
			if(score.equals(scoreList[i])) {
				return false;
			}
		}
		scoreList[count]=new Score(score);
		count++;
		return true;
	}
	
	
	//메소드 : getter/setter, equals() : 같은 객체인지 비교하기 위해
	//, toString() : 객체를 쉽게 문자열로 만들기 위해

	
	@Override
	public String toString() {
		return "[" +grade +"학년 " + classNum + "반 " + num + "번 " + name +"]";
	
	}
	
		
	//생성자
	//학년, 반, 번호, 이름이 필요한 생성자(학생정보 추가시 활용)
	public Student2(int grade, int classNum, int num, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		maxSize=30;
		scoreList=new Score[maxSize];
	}
	public Student2(int grade, int classNum, int num) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		maxSize=30;
		scoreList=new Score[maxSize];
		
	}
	
	//학년, 반, 번호가 필요한 생성자(성적 추가시 학생이 있는지 없는지 판별할 때 활용) 


	public void printScore() {
		for(int i=0; i<count; i++) {
			System.out.println(scoreList[i]);
		}
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (classNum != other.classNum)
			return false;
		if (count != other.count)
			return false;
		if (grade != other.grade)
			return false;
		if (maxSize != other.maxSize)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (!Arrays.equals(scoreList, other.scoreList))
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + count;
		result = prime * result + grade;
		result = prime * result + maxSize;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + Arrays.hashCode(scoreList);
		return result;
	}

}
