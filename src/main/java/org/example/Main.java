package org.example;

public class SerializationExercises {
	/*

	Debe definir la clase para los conceptos movie, theatre y session.
	Una sesión es una obra de cine en un teatro.
	Crea 2 instancias de cada clase y relaciona entre ellas.
	Serialice a Json todos los objetos y guárdelos en archivos diferentes.
	 */
	public class Exercise1 {
		public void main(String[] args) {
			// Instancias de movie:
			Movie movie1 = new Movie("Star Wars episodio: III", "acción", "139", "G. Lucas");
			Movie movie2 = new Movie("El retorno del rey", "fantasía", "254", "P. Jackson");

			// Instancias de Theater:
			Theater theater1 = new Theater("C.C Las Arenas", "YelmoCines");
			Theater theater2 = new Theater("C.C 7 Palmas", "Ocines");

			// Instancias de Session:
			Session session1 = new Session(movie1, theater1, "16:30");
			Session session2 = new Session(movie2, theater2, "21:20);

		}
	}
	 class Movie {
		 private string Nombre;
		 private string Genero;
		 private int Duracion;
		 private string Director;

		 public Movie(String Nombre, String Genero, int Duracion, String Director) {
			 this.Nombre = Nombre;
			 this.Genero = Genero;
			 this.Duracion = Duracion;
			 this.Director = Director;
		 }
	 }
	static class Theater{

		private string localication;
		private string Tname;
		private int CodigoPostal;

		public Theater (String location, String Tname, int CodigoPostal) {
			this.localication = location;
			this.Tname = Tname;
			this.CodigoPostal = CodigoPostal;
		}
	}

	class Session{
		private Movie movie;
		private Theater theater;
		private String SessionStart;
		private int Date;

		public class Session(Movie movie, Theater theater, String SessionStart){

			this.movie = movie;
			this.theater = theater;
			this.SessionStart = SessionStart;}


	 }
	/*
		Deserialize the objects created in exercise 1.
		Now serialize them using ObjectOutputStream
	 */
	public static class Exercise2 {

		public static void main(String[] args) {

		}
	}

	/*
	   Deserialize the objects from the binary files created in exercise 2.
	*/
	public static class Exercise3 {

		public static void main(String[] args) {

		}
	}
}