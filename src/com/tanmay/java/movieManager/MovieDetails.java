package com.tanmay.java.movieManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class MovieDetails  {
	public int addMovie(Movie m) throws ClassNotFoundException, SQLException  {

		DBHandler dbHandler = new DBHandler();
		Connection conn = dbHandler.establishConnection();
		java.sql.Date date = getCurrentDatetime();
		int res = 0;
		PreparedStatement stmt = null;
		try {
		stmt = conn.prepareStatement("insert into Movie values(?,?,?,?,?)");
		stmt.setInt(1,m.getMovieId());
		stmt.setString(2,m.getMovieName());
		stmt.setDate(3,date);
		stmt.setString(4,m.getMovieType());
		stmt.setString(5,m.getInStock());
		res = stmt.executeUpdate();
		} catch(Exception e) {
			System.out.println("Movie Present");
		}
		return res;
	}
	
	public java.sql.Date getCurrentDatetime() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}
	
	public Movie getMovie(int movieId) throws ClassNotFoundException, SQLException  {
		DBHandler dbHandler = new DBHandler();
		Connection conn = dbHandler.establishConnection();
		Movie m = new Movie();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Movie where Movieid ="+movieId);
		while(rs.next()) {
			m.setMovieId(rs.getInt("Movieid"));
			m.setMovieName(rs.getString("MovieName"));
		    m.setDateOfRelease(LocalDate.now());
			m.setMovieType(rs.getString("MovieType"));
			m.setInStock(rs.getString("InStock"));
		}
		
		return m;
	}
	
	public int deleteMovie(int movieId) throws ClassNotFoundException, SQLException {
		DBHandler dbHandler = new DBHandler();
		Connection conn = dbHandler.establishConnection();
		PreparedStatement stmt = null;
		
		stmt = conn.prepareStatement("delete from Movie where MovieId = ?");
		stmt.setInt(1,movieId);
		
		int res = stmt.executeUpdate();
		
		return res;
	}
	
}
