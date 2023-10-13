package org.example;
import org.example.model.Movie;
import org.example.model.Theater;
import org.example.model.Session;
import java.io.*;
import com.google.gson.Gson;

public class SerializationExercises {

	public static class Exercise1 {
		public static void main(String[] args) {
			Movie movie1 = new Movie("Star Wars episodio: III", "acción", 139, "G. Lucas");
			Movie movie2 = new Movie("El retorno del Rey", "fantasía",  254, "P. Jackson");

			Theater theater1 = new Theater("C.C Las Arenas", "YelmoCines", 35011);
			Theater theater2 = new Theater("C.C 7 Palmas", "Ocines", 35019);

			Session session1 = new Session(movie1, theater1, 16);
			Session session2 = new Session(movie2, theater2, 16);

			Gson gson = new Gson();
			String movie1Json = gson.toJson(movie1);
			String movie2Json = gson.toJson(movie2);
			String theater1Json = gson.toJson(theater1);
			String theater2Json = gson.toJson(theater2);
			String session1Json = gson.toJson(session1);
			String session2Json = gson.toJson(session2);

			try (FileWriter writer = new FileWriter("movie1.json")) {
				writer.write(movie1Json);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	/*
	Deserialice los objetos creados en el ejercicio 1.
	Ahora serialízalos usando ObjectOutputStream
	 */

	public static class Exercise2 {
		public static void main(String[] args) {
			try (FileReader reader = new FileReader("movie1.json")) {
				Gson gson = new Gson();
				Movie movie1 = gson.fromJson(reader, Movie.class);

				try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("movie1.dat"))) {
					objectOutputStream.writeObject(movie1);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	Deserialice los objetos de los archivos binarios creados en el ejercicio 2.
	*/

	public static class Exercise3 {
		public static void main(String[] args) {
			try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("movie1.dat"))) {
				Movie movie1 = (Movie) objectInputStream.readObject();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}