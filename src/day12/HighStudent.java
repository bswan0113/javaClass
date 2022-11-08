package day12;

public class HighStudent {
	private String name;
	private int grade;
	private int classNum;
	private int stdNum;
	
	
	public HighStudent(int grade, int classNum, int stdNum,String name) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.stdNum = stdNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getStdNum() {
		return stdNum;
	}

	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}

	@Override
	public String toString() {
		return "HighStudent [name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", stdNum=" + stdNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stdNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HighStudent other = (HighStudent) obj;
		if (classNum != other.classNum)
			return false;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stdNum != other.stdNum)
			return false;
		return true;
	}
	
	
	
	
	

}
