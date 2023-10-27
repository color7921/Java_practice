package Mission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class QueryByPreparedStatement {

	public static void main(String[] args) {
		Connection con = null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/sqltest";
			String username = "scott";
			String password = "tiger";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("바꿀 enable의 10의 자리 입력");
			int num = sc.nextInt();
			
			System.out.println("True or False");
			boolean a = sc.nextBoolean();
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = con.prepareStatement("update user set enable = ? where username like ?");
			ps.setBoolean(1, a);
			ps.setString(2, "user"+num+"%");
			int rs = ps.executeUpdate();
			
			//rs.close();
			ps.close();
			con.close();
			
		}catch (Exception e){
			System.out.println("연결 실패" +e.getMessage());
			e.printStackTrace();
		}
	}
}
