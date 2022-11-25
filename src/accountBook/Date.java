package accountBook;

import lombok.Data;

@Data
public class Date {
	private int year;
	private int month;
	private int day;
public Date() {
	
}
	public Date(int year2, int month2, int day2) {
		this.year=year2;
		this.month=month2;
		this.day=day2;
	}

	@Override
	public String toString() {
		return ""+year+"/"+ month+"/"+day+"";
	}

	
}
