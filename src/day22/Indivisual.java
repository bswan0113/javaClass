package day22;


import lombok.Data;

@Data
public class Indivisual {

	String name;
	String birth;
	static int count=0;
	int stdNum;
	

	public Indivisual(String name, String birth) {
		this.name = name;
		this.birth=birth;
		{ count++; stdNum=count;}
	}
	
/*	public void fBirth(String a) {
	SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
	this.birth = date.format(a);
		
	}*/
	public void print() {
		System.out.println(stdNum + "번 " + birth+" "+ name);
	}

@Override
public String toString() {
	return stdNum+ "번 " + name;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Indivisual other = (Indivisual) obj;
	if (birth == null) {
		if (other.birth != null)
			return false;
	} else if (!birth.equals(other.birth))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((birth == null) ? 0 : birth.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}


}
