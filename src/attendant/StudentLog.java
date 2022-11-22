package attendant;

import lombok.Data;

@Data
public class StudentLog {

	private Student std;
	private String state;
	
	public StudentLog(String name, String birth, String state) {
		this.std = new Student(name, birth);
		this.state=state;
	}
	
	public StudentLog(Student std, String state) {
		this.std= new Student(std);
		this.state=state;
	}
	
}
