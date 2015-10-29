package cn.zucc.day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class SqlDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动错误");
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/score","root","root");
			Statement stat = conn.createStatement();
			//String sql = "insert into stu(name,Address,Email,Grade) values('阿白','理四','das@qq.com',1)";
			//stat.execute(sql);
			String sql = "select * from stu";
				ResultSet rs = stat.executeQuery(sql);
				Set<Student> set = new HashSet<Student>();
				while(rs.next()){
					Student student = new Student();
					student.setName(rs.getString("name"));
					student.setAddress(rs.getString("Address"));
					student.setEmail(rs.getString("Email"));
					student.setGrade(rs.getString("Grade"));
					student.setScode(rs.getInt("Scode"));
					set.add(student);
				}
				for(Student stu :set){
					System.out.println(stu);
				}
				
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接错误");
			e.printStackTrace();
		}
		
		

	}

}
