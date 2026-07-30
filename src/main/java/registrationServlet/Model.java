package registrationServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {

	private String name;
	private String age;
	private String city;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int register() throws SQLException {
		Connection connection=JdbcUtil.getConnection();
		
		String sql="Insert into student (id,name,age,city) values(?,?,?,?)";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1, Integer.parseInt(id));
        statement.setString(2, name);
        statement.setInt(3,Integer.parseInt(age));
        statement.setString(4, city);
        int row= statement.executeUpdate();
        JdbcUtil.closeConnection(connection, statement);
        return row;
        
        
	}
}
