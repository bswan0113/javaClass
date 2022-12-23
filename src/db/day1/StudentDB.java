package db.day1;

import java.sql.*;
import java.util.ArrayList;
public class StudentDB {
	private Connection con;
	private Statement stmt;
	private PreparedStatement ps;
	private ResultSet rs;

	public StudentDB(String url, String id, String pw) throws Exception {
		connect(url, id, pw);
		stmt =con.createStatement();
	}
	public void connect(String url, String id, String pw) throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, id, pw);
            System.out.println("DB 폭발 성공");
            

	}
	public ArrayList<Student1> selectStudent() throws SQLException{
		
    	String sql = "select * from student";
		rs=stmt.executeQuery(sql);
		ArrayList<Student1> list =new ArrayList<Student1>();
		while(rs.next()) {
			String stNum= rs.getString(1);
			String stName= rs.getString(2);
			int semester =rs.getInt(3); 
			String state = rs.getString(4);
			String prNum = rs.getString(5);
			
			Student1 std = new Student1(stNum, stName, semester, state, prNum);
			list.add(std);
			
			
		}
		return list;
	
	
}
	public void insertStudent(String a, String b, int c, String d, String e) throws SQLException {
		String sql = "insert student values(?,?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1, a);
        ps.setString(2, b);
        ps.setInt(3,c);
        ps.setString(4,d);
        ps.setString(5,e);
        int count = ps.executeUpdate();
        if(count==0) {
        	System.out.println("추가실패");
        }
        else {
        	System.out.println("추가성공");
        }
	}
}
