ackage jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
System.out.println("JDBC Appstarted");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://loclhost/jdbc_demo", "root", "root");
String createTable="create table students(id int auto_increment,name varchar(40),city varchar(40))";
Statement smt=con.createStatement();
smt.execute(createTable);
smt.close();
	}

}





package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("jdbc app started");
Class.forName("com.mysql.cj.jdbc.driver");
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","root");
String createTable="create table students(id int auto_increment,name varchar(40),city varchar(50)";
String insertTable="insert into students(name,city) values('ram','mumbai'),('shyam','pune')";
Statement smt=con.createStatement();
smt.execute(createTable);
smt.executeUpdate(insertTable);

ResultSet rs=smt.executeQuery("select * from students");
while(rs.next()) {
	int id=rs.getInt("id");
	String name=rs.getString("name");
	String city=rs.getString("city");
	
	System.out.println(  id  +""+name+""+city);
}
smt.close();



	}

}
