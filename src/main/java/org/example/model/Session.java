package org.example.model;

public class Session {
	private Movie movie;
	private Theater theater;
	private String SessionStart;
	private int Date;

	public Session(Movie movie, Theater theater, int SessionStart) {

		this.movie = movie;
		this.theater = theater;
		this.SessionStart = SessionStart;
	}
}
