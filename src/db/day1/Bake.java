package db.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;

public class Bake {
static 	Statement st = null;
static 	ResultSet rs = null;
static PreparedStatement ps = null;
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		System.out.println("접속하려는 DB명을 입력해주세요.");
		
		String url="jdbc:mysql://localhost/"+scan.nextLine();
		System.out.println("ID를 입력해주세요.");
		String id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pw = scan.nextLine();
        con = connect(url,id,pw);
        ArrayList<Student2> list = null;
        st=con.createStatement();
        int select =0;
        
        do {
        	System.out.println("학생 조회는 1번, 학생 추가는 2번을 눌러주세요. 시스템을 종료하시려면 3번을 눌러주세요.");
        	select=scan.nextInt(); scan.nextLine();
        switch(select) {
        case 1: list = selectStudent(con);
        	for(Student2 tmp : list) {
        		System.out.println(tmp);
        	}
        	
        	break;
        case 2: insert(con);
        	break;
        case 3: System.out.println("시스템을 종료합니다.");
        	break;
        default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
        
        }while(select!=3);

        
        
        connetClose(con);
      
        
    
    }

	
       private static void insert(Connection con) throws SQLException {
    			String sql = "insert student values(?,?,?,?,?)";
    			System.out.println("학번을 입력해주세요.");
    			String a = scan.nextLine();
    			System.out.println("이름을 입력해주세요.");
    			String b = scan.nextLine();
    			System.out.println("학기을 입력해주세요.");
    			int c = scan.nextInt();scan.nextLine();
    			System.out.println("학적상태를 입력해주세요.");
    			String d = scan.nextLine();
    			System.out.println("지도교수 교번을 입력해주세요.");
    			String e = scan.nextLine();
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
	


	/* String url = "jdbc:mysql://localhost/university"; 
        String id = "root";
        String pw = "root";*/
	

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

        Connection con = null;

        try{
   
            Class.forName("com.mysql.cj.jdbc.Driver");

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
	
	
	public static ArrayList<Student2> selectStudent(Connection con) throws SQLException{
	
        	String sql = "select * from student";
			rs=st.executeQuery(sql);
			ArrayList<Student2> list =new ArrayList<Student2>();
			while(rs.next()) {
				String stNum= rs.getString(1);
				String stName= rs.getString(2);
				int semester =rs.getInt(3); 
				String state = rs.getString(4);
				String prNum = rs.getString(5);
				
				Student2 std = new Student2(stNum, stName, semester, state, prNum);
				list.add(std);
				
				
				
				
			}
			return list;
		
		
	}
	

	}

@Data
class Student2 {
	String st_num;
	String st_name;
	int semester;
	String st_state;
	String st_pr_num;

	public Student2(String st_num, String st_name, int semester, String st_state, String st_pr_num) {
		this.st_num = st_num;
		this.st_name = st_name;
		this.semester = semester;
		this.st_state = st_state;
		this.st_pr_num = st_pr_num;
	}

	@Override
	public String toString() {
		return "학번 : " + st_num + " 이름 : " + st_name + " "+semester +"학기 " +" 학적 : " +st_state;
	}
	
}
