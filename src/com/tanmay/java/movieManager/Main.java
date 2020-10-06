package com.tanmay.java.movieManager;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	    MovieDetails md = new MovieDetails();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		System.out.println("Welcome to Movie Handler");
		System.out.println("Enter your choice");
		// while loops
		while(choice!=4)
		{
			System.out.println("1.Add Movie");
			System.out.println("2.Delete Movie");
			System.out.println("3.Get Movie Detail");
			System.out.println("4.Exit");
			System.out.print("Your Choice : ");
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter MovieId: ");			
				int MovieId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter MovieName: ");
				String MovieName = scanner.nextLine();
			    LocalDate Date = LocalDate.now();
			    System.out.println("Movie Type: (Thriller/Horror/Family/MyThological)");
			    String MovieType = scanner.next();
			    System.out.println("Enter Ticket In Stock(yes/No)");
			    String InStock = scanner.next();
			    Movie m = new Movie();
			    m.setMovieId(MovieId);
			    m.setMovieName(MovieName);
			    m.setDateOfRelease(Date);
			    m.setMovieType(MovieType);
			    m.setInStock(InStock);
			    if(md.addMovie(m)>=1)
					System.out.println("Movie Added Successfully");
				else
					System.out.println("Movie Id Already Present");
			    
			    break;
			    
			case 2:
				System.out.println("Enter Movie Id to delete Movie:");
				int movieId = scanner.nextInt();
				if(md.deleteMovie(movieId)>=1) 
					System.out.println("Deleted SuccessFully");
				else
					System.out.println("No Movie with Id is Present");
				
				break;
				
			case 3:
				System.out.println("Movie Details");
				System.out.println("Enter Movie id to get Detail");
				int id = scanner.nextInt();
				Movie getDetail = md.getMovie(id);
				if(getDetail.getMovieId()==0) System.out.println("No Movie with id "+id+"is available");
				else {
					System.out.println("Movie Id: "+getDetail.getMovieId());
					System.out.println("Movie Name: "+getDetail.getMovieName());
					System.out.println("Movie Release Date: "+getDetail.getDateOfRelease());
					System.out.println("Movie Type: "+getDetail.getMovieType());
					System.out.println("Movie InStock: "+getDetail.getInStock());
				}
				break;
				
			default:
				System.out.println("Thank You!! Its been a Pleasure Serving you!!");
			}
		}
				
				


	}

}
