package attendant;

import java.util.ArrayList;

import lombok.Data;
@Data
public class Log {
	private ArrayList<StudentLog> sLogs = new ArrayList<StudentLog>();
	private String date;
	
	
	public Log(ArrayList<StudentLog> sLogs, String date ) {
		this.sLogs=sLogs;
		this.date=date;
		
		
	}


	@Override
	public String toString() {
		return date +"\n"+sLogs;
	}
	
	/*public Log(ArrayList<Student> stds, String date ) {
		this.date=date;
		for(Student std : stds) {
			StudentLog sLog = new StudentLog(std, null);
			sLogs.add(sLog);
			
		}
	}*/

}
