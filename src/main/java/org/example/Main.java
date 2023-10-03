package org.example;

public class SerializationExercises {
	/*

	Debe definir la clase para los conceptos movie, theatre y session.
	Una sesión es una obra de cine en un teatro.
	Crea 2 instancias de cada clase y relaciona entre ellas.
	Serialice a Json todos los objetos y guárdelos en archivos diferentes.
	 */
	public static class Exercise1 {
		public static void main(String[] args) {
			// Instancias de movie:
			Movie movie1 = new Movie("Star Wars episodio: III", "acción", "139", "G. Lucas");
			Movie movie2 = new Movie("El retorno del rey", "fantasía", "254", "P. Jackson");

			// Instancias de Theater:
			Theater theater1 = new Theater();
			Theater theater = new Theater();

			// Instancias de Session:
			Session session1 = new Seassion();
			Session session2 = new Seassion();

		}
	}
	 class Movie{
		public string Nombre;

		public string Genero;

		public int	Duracion;

		public string Director;

		 public Movie(String Nombre, String Genero, int Duracion, String Director) {
			 this.Nombre = Nombre;
			 this.Genero = Genero;
			 this.Duracion = Duracion;
			 this.Director = Director;



	}


		class Theatre{

			 public string localication;

			 public string Tname;

			 public int CodigoPostal;


		 }
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