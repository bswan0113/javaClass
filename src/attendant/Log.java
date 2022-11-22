package attendant;

import java.util.ArrayList;

public class Log {
	private ArrayList<StudentLog> sLogs = new ArrayList<StudentLog>();
	private String date;
	
	public Log(ArrayList<Student> stds, String date ) {
		this.date=date;
		for(Student std : stds) {
			StudentLog sLog = new StudentLog(std, null);
			sLogs.add(sLog);
			
		}
	}

}
