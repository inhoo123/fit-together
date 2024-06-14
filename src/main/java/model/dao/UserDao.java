package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.vo.Gym;
import model.vo.User;
import oracle.jdbc.datasource.impl.OracleDataSource;

public class UserDao {

	public boolean save(User newUser) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("fit_together");
		ods.setPassword("oracle");

		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?,?)");
			stmt.setString(1, newUser.getId());
			stmt.setString(2, newUser.getPassword());
			stmt.setString(3, newUser.getName());
			stmt.setString(4, newUser.getGender());
			stmt.setInt(5, newUser.getBirth());
			stmt.setString(6, newUser.getEmail());
			stmt.setString(7, newUser.getInterest());

			int r = stmt.executeUpdate();
			return r == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public User findById(String id) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("fit_together");
		ods.setPassword("oracle");
		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM USERS WHERE ID=?");
			stmt.setString(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				User user = new User(rs.getString("ID"), rs.getString("PASSWORD"), rs.getString("NAME"),
						rs.getString("GENDER"), rs.getInt("BIRTH"), rs.getString("EMAIL"), rs.getString("INTEREST"));

				return user;
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
