package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
				"jdbctest", "jdbctest");
		Statement stmt = conn.createStatement();
		if(args.length == 1 && args[0].equals("create")) {
			stmt.executeUpdate("create table product (id char(5), classid char(2), name varchar(50), balance int, price float)");
			System.out.println("테이블이 생성되었습니다.");
		} else {
			stmt.executeUpdate("drop table product");
			System.out.println("테이블이 삭제되었습니다.");
		}
		stmt.close();
		conn.close();
	}
}
