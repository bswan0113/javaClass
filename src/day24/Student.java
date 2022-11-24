package day24;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4396871842408766103L;
	String name;
	int stdNum,classNum,grade;
	public Student(String name2, int grade2, int classNum2, int stdNum2) {
		name=name2;
		grade=grade2;
		classNum=classNum2;
		stdNum=stdNum2;
	}
	@Override
	public String toString() {
		return grade + "학년 "+ classNum+"반 "+ stdNum+"번 " + name;
	}
	
}
