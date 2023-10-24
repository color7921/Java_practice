package Mission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class Exercise001 {

	public static void main(String[] args) {
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "tiger";
			//접속하는 과정
			
			Class.forName(driver); //JDBC 드라이버 로드(mysql)
			Connection con = DriverManager.getConnection(url, username, password);
			//con은 DB연결객체, get커넥션을 통해 생성
			
			showData(con, "city", "id, name, countrycode, district, population");
			showData(con, "country", "*");
			showData(con, "countrylanguage", "*");
			//메서드 호출
			
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void showData(Connection con, String tablename, String fields) throws Exception{
		
		Statement st = con.createStatement();
		//커넥션 객체로부터 질의를 실행하기위한 객체(statement) 생성
		ResultSet rs = st.executeQuery("select * from %s limit 10");
		//질의 수행
		//executeQuery를 통해 만든다.
		ResultSetMetaData rsmd = rs.getMetaData();
		//
		int count = rsmd.getColumnCount();
		//getcolumncount 로부터 count 생성
		
		System.out.println("=".repeat(100));
		System.out.println("Table : " + tablename);
		System.out.println("=".repeat(100));
		while (rs.next()) {
		 {
				for(int i = 1; i <= count; i++) {
					if(i != 1) System.out.print(",");
					System.out.print(rs.getString(i));
				} System.out.println();
			}
		}
		rs.close();
		st.close();
	}
}
