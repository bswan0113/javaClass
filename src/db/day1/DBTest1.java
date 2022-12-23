package db.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import lombok.Data;

public class DBTest1 {
static 	Statement st = null;
static 	ResultSet rs = null;
static PreparedStatement ps = null;

	public static void main(String[] args) throws SQLException {
		Connection con = null;
        String url = "jdbc:mysql://localhost/university"; 
        String id = "root";
        String pw = "root";
        con = connect(url,id,pw);
        ArrayList<Student1> list = null;
        st=con.createStatement();
       // updateStudent(con,"2022160001","크리스마스");
        deleteStudent(con, "1");
        
      list=selectStudent(con);
      System.out.println(list);
      ps.executeUpdate();
        
        
        
        
        
        connetClose(con);
      
        
    
    }
	private static void deleteStudent(Connection con, String string) throws SQLException {
		String sql = "delete from student where st_num=?";
		ps=con.prepareStatement(sql);
		ps.setString(1, string);
	}
	private static void updateStudent(Connection con, String string, String string2) throws SQLException {
		String sql = "UPDATE STUDENT SET ST_NAME = ? WHERE ST_NUM=?";
        ps=con.prepareStatement(sql);
        ps.setString(1, string2);
        ps.setString(2, string);
    
        int count = ps.executeUpdate();
        if(count==0) {
        	System.out.println("추가실패");
        }
        else {
        	System.out.println("추가성공");
        }		
	}
	public static void insertStudent(Connection con,String a, String b, int c, String d, String e) throws SQLException {
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
		
	
	public static Connection connect(String url, String id, String pw) {
		// Connection 객체를 자동완성으로 import할 때는 com.mysql.connection이 아닌
        // java 표준인 java.sql.Connection 클래스를 import해야 한다.
        Connection con = null;

        try{
            // 1. 드라이버 로딩
            // 드라이버 인터페이스를 구현한 클래스를 로딩
            // mysql, oracle 등 각 벤더사 마다 클래스 이름이 다르다.
            // mysql은 "com.mysql.jdbc.Driver"이며, 이는 외우는 것이 아니라 구글링하면 된다.
            // 참고로 이전에 연동했던 jar 파일을 보면 com.mysql.jdbc 패키지에 Driver 라는 클래스가 있다.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 연결하기
            // 드라이버 매니저에게 Connection 객체를 달라고 요청한다.
            // Connection을 얻기 위해 필요한 url 역시, 벤더사마다 다르다.
            // mysql은 "jdbc:mysql://localhost->프로그램서버=실행서버 인 경우/사용할db이름" 이다.

            // @param  getConnection(url, userName, password);
            // @return Connection
            con = DriverManager.getConnection(url, id, pw);
            System.out.println("연결 성공");
            

        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch(SQLException e){
            System.out.println("에러: " + e);
        }
		return con;
	}
	
	public static void connetClose(Connection con) {
	      try{
              if( con != null && !con.isClosed()){
                  con.close();
                  System.out.println("끝");
              }
          }
          catch( SQLException e){
              e.printStackTrace();
          }
	}
	
	
	public static ArrayList<Student1> selectStudent(Connection con) throws SQLException{
	
        	String sql = "select * from student";
			rs=st.executeQuery(sql);
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
	

	}
@Data
class Student1 {
	String st_num;
	String st_name;
	int semester;
	String st_state;
	String st_pr_num;

	public Student1(String st_num, String st_name, int semester, String st_state, String st_pr_num) {
		this.st_num = st_num;
		this.st_name = st_name;
		this.semester = semester;
		this.st_state = st_state;
		this.st_pr_num = st_pr_num;
	}
}
