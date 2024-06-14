package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.vo.Gym;
import oracle.jdbc.datasource.impl.OracleDataSource;

public class GymDao {
	public List<Gym> findGymsByGymId() throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("fit_together");
		ods.setPassword("oracle");
		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM GYMS WHERE ID=?");

			ResultSet rs = stmt.executeQuery();
			List<Gym> gyms = new ArrayList<>();
			while (rs.next()) {
				Gym one = new Gym(rs.getInt("GYM_ID"), rs.getString("TYPE"), rs.getString("LOCATION"),
						rs.getString("NAME"),rs.getString("OWNER"),rs.getString("MANAGEMENT"));
				gyms.add(one);
			}

			return gyms;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<Gym> findGymsByType() throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("fit_together");
		ods.setPassword("oracle");
		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM GYMS WHERE TYPE=?");

			ResultSet rs = stmt.executeQuery();
			List<Gym> gyms = new ArrayList<>();
			while (rs.next()) {
				Gym one = new Gym(rs.getInt("GYM_ID"), rs.getString("TYPE"), rs.getString("LOCATION"),
						rs.getString("NAME"),rs.getString("OWNER"),rs.getString("MANAGEMENT"));
				gyms.add(one);
			}

			return gyms;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
