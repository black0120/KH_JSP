package member;

import java.sql.*;

// DAO(Data Access Object) - 데이터 베이스 접속과 관련된 메서드를 정의
public class MemberDAO {
	private Connection conn = null;
	private Statement stat = null;	
	
	public MemberDAO() {
		this.connect();
	}
	
	public MemberVO getRecord(String userid) {
		// SQL 질의문 작성
		String sql = "SELECT * FROM member_t WHERE userid = '" + userid + "'";
		MemberVO m = null;
		try {
			// SQL 질의문 실행
			ResultSet res = this.stat.executeQuery(sql);
			res.next();
			m = new MemberVO( //생성자 맞춰서 객체에 값을 담는다.
				res.getString("userid"),
				res.getString("password"),
				res.getString("email"),
				res.getDate("joindate")
			);
			
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return m;
	}
	
	private void connect() {
		try {
			// JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 드라이버 로딩 완료!");
			
			// 접속 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //jdbc:oracle:thin:@서버주소:포트번호:xe
			String user = "web_admin";
			String password = "admin";
			
			// DB접속 객체 생성, 접속 시도
			this.conn = DriverManager.getConnection(url, user, password);
			System.out.println("Oracle DB 접속 완료!");
			// SQL 구문 작업용 객체 생성
			this.stat = conn.createStatement();
			
		} catch (ClassNotFoundException e) { //JDBC 드라이버 로딩에 필요.
			e.printStackTrace();
		} catch (SQLException e) { //DB접속 객체 생성, 접속 시도에 필요.
			
		}
	}
	
	public void close() {
		try {
			// 모든 커넥션 정보 close()
			this.stat.close();
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
