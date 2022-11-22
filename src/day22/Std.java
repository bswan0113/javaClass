package day22;


import lombok.Data;

@Data
public class Std {
	
	String date;
	Indivisual std;
	String attend;

	

	
	
	
/*	public void Day(String a) {
		SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
		this.date = date.format(a);
			
		} */

	

public void attend(String a) {
	switch(a){
	case "O" : this.attend = "출석";
	break;
	case "L" : this.attend = "지각";
	break;
	case "T" : this.attend = "조퇴";
	break;
	case "X" : this.attend = "결석";
	break;
	default: 
	}
	
}



	public Std(String date, Indivisual std, String attend) {
	//	Day(date);
		this.std = std;
		this.date=date;
		attend(attend);
	}


	@Override
	public String toString() {
		return "\n"+std + " : " + attend;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (std == null) {
			if (other.std != null)
				return false;
		} else if (!std.equals(other.std))
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attend == null) ? 0 : attend.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((std == null) ? 0 : std.hashCode());
		return result;
	}
	



	

}

