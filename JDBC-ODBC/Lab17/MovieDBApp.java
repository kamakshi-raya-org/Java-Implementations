package Lab17;

import java.sql.*;

public class MovieDBApp {

	public static void main(String[] args) {

		properties dbAccess = new properties();
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(dbAccess.DB_URL, dbAccess.USER, dbAccess.PASS);
			
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT MOVIE.* , MOVIE_REVIEW.* FROM MOVIE, MOVIE_REVIEW where MOVIE.MOVIE_ID = MOVIE_REVIEW.MOVIE_ID;";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt("MOVIE_ID");
				String name = rs.getString("MOVIE_NAME");
				String rating = rs.getString("MOVIE_RATING");
				String review_id = rs.getString("REVIEW_ID");
				String review = rs.getString("REVIEW");
				int stars = rs.getInt("STARS");
				
				System.out.print("ID: " + id);
				System.out.print(", Movie Name : " + name);
				System.out.print(", Movie Rating: " + rating);
				System.out.print(", Movie Review ID: " + review_id);
				System.out.print(", Movie Review: " + review);
				System.out.print(", Movie Stars: " + stars);
				System.out.println("\n");
			
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			System.out.println("End of Program!");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

}