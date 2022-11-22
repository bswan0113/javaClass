package attendant;

import lombok.Data;

@Data
public class Student {
	private String name;
	private String birthday;
	
	public Student(String name, String birth) {
		this.name=name;
		birthday=birth;
	}

	public Student(Student std) {
		this(std.name, std.birthday);
		
	}
}
