package org.example;

import org.example.model.Session;


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
			Movie movie1 = new Movie("Star Wars episodio: III", "acción", 139, "G. Lucas");
			Movie movie2 = new Movie("El retorno del Rey", "fantasía",  254, "P. Jackson");

			// Instancias de Theater:
			Theater theater1 = new Theater("C.C Las Arenas", "YelmoCines",35011);
			Theater theater2 = new Theater("C.C 7 Palmas", "Ocines",35019);

			// Instancias de Session:
			Session session1 = new Session(movie1, theater1, 16);
			Session session2 = new Session(movie2, theater2, 16);

		}
	}

	/*

	Deserialice los objetos creados en el ejercicio 1.
	Ahora serialízalos usando ObjectOutputStream
	 */
	public static class Exercise2 {

		public static void main(String[] args) {

		}
	}

	/*

Deserialice los objetos de los archivos binarios creados en el ejercicio 2.
	*/
	public static class Exercise3 {

		public static void main(String[] args) {

		}
	}
}