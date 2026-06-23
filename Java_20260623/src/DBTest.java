import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String password = "root";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공");
			
			String sql = "select * from students";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("번호\t이름\t나이\t학과");
			System.out.println("-------------------------------");
			while(rs.next()) {
				int no = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String major = rs.getString("major");
				System.out.printf("%d\t%s\t%d\t%s\n", no, name, age, major);
			}
			
			Scanner s = new Scanner(System.in);
			System.out.print("삭제할 행의 id를 입력해주세요 : ");
			int delid = s.nextInt();
			sql = "delete from students where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, delid);	
			ps.executeUpdate();
			
//			Scanner s = new Scanner(System.in);
//			System.out.println("추가할 행의 정보를 입력해주세요.");
//			System.out.print("이름 : ");
//			String insid = s.next();
//			System.out.print("나이 : ");
//			int insage = s.nextInt();
//			s.next();
//			System.out.print("학과 : ");
//			String insmajor = s.nextLine();
//			
//			sql = "insert into students(name, age, major) values(?, ?, ?)";
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, insid);
//			ps.setInt(2, insage);
//			ps.setString(3, insmajor);
//			ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
		finally {
			if(conn !=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
