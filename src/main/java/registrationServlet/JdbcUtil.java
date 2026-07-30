package registrationServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	static {
        // load and register the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        //Establishing the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String username="root";
        String password="Hritik@97";
        return DriverManager.getConnection(url,username,password);
    }

    public static void closeConnection(Connection connection, Statement statement) throws SQLException {
        statement.close();
        connection.close();
    }

}
