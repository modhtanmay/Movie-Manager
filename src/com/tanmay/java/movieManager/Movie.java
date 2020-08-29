package com.tanmay.java.movieManager;

import java.time.LocalDate;

public class Movie {
	private int MovieId;
	private String MovieName;
	private LocalDate DateOfRelease;
	private String MovieType;
	private String InStock;
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public LocalDate getDateOfRelease() {
		return DateOfRelease;
	}
	public void setDateOfRelease(LocalDate dateOfRelease) {
		DateOfRelease = dateOfRelease;
	}
	public String getMovieType() {
		return MovieType;
	}
	public void setMovieType(String movieType) {
		MovieType = movieType;
	}
	public String getInStock() {
		return InStock;
	}
	public void setInStock(String inStock) {
		InStock = inStock;
	}
	public Movie() {
		
	}
	
	public Movie(int movieId, String movieName, LocalDate dateOfRelease, String movieType, String inStock) {
		super();
		MovieId = movieId;
		MovieName = movieName;
		DateOfRelease = dateOfRelease;
		MovieType = movieType;
		InStock = inStock;
	}
	
	
}
