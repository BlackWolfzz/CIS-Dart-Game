package DB;

import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {

	public static Connection connect() {
		Connection conn = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dartgame", "root", "");
			// JOptionPane.showMessageDialog(null, "Connection Success");

		} catch (Exception e) {
		}
		return conn;
	}

}
