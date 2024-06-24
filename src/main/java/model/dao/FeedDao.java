package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.Feed;
import model.vo.Gym;
import oracle.jdbc.datasource.impl.OracleDataSource;

public class FeedDao {
	// =====================SAVE====================================================================
	public boolean save(Feed newFeed) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("fit_together");
		ods.setPassword("oracle");

		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn
					.prepareStatement("INSERT INTO FEEDS VALUES(FEEDS_SEQ.NEXTVAL, ?, ?, ?, ?, ?)");

			stmt.setString(1, newFeed.getWriterId());
			stmt.setString(2, newFeed.getTitle());
			stmt.setString(3, newFeed.getBody());
			stmt.setString(4, newFeed.getCategory());
			stmt.setDate(5, newFeed.getWritedAt());

			int r = stmt.executeUpdate();

			return r == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// =================================FIND================================
	public Feed findByNo(int no) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("fit_together");
		ods.setPassword("oracle");
		try (Connection conn = ods.getConnection()) {
			// 식별키로 조회하고,
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM FEEDS WHERE NO = ?");
			stmt.setInt(1, no);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// rs.getString("writer_id");
				return new Feed(rs.getInt("no"), rs.getString("writer_id"), rs.getString("title"), rs.getString("body"),
						rs.getString("category"), rs.getDate("writed_at"));
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
//==================================list=========================================================

	public List<Feed> findAll() throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("fit_together");
		ods.setPassword("oracle");
		try (Connection conn = ods.getConnection()) {
			// 식별키로 조회하고,
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM FEEDS ORDER BY WRITED_AT DESC");

			ResultSet rs = stmt.executeQuery();
			List<Feed> feeds = new ArrayList<>();
			while (rs.next()) {
				// rs.getString("writer_id");
				Feed one = new Feed(rs.getInt("no"), rs.getString("writer_id"), rs.getString("title"), rs.getString("body"),
						rs.getString("category"), rs.getDate("writed_at"));
				feeds.add(one);
			}

			return feeds;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
