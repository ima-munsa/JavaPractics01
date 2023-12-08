package ejercicio09;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio09 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ejercicio 09 - Calificación media de una clase");

		// Declaración Variables

		int numeroAlumnos;
		int contador = 0; // Contador de número de calificaciones
		float notaMedia = 0; // Almacenaremos cálculo de la media de calificaciones
		float nota;
		float sumaNotas = 0; // Suma de las notas para obtener la media
		Scanner lector = new Scanner(System.in);

		// Entrada y conversión
		System.out.print("Número de alumnos: ");
		numeroAlumnos = lector.nextInt();

		// Operaciones y entrada de calificaciones
		for (int i = 1; i <= numeroAlumnos; i++) {

			System.out.print("Calificación media del alumno " + i + ": ");
			nota = lector.nextFloat();
			sumaNotas = sumaNotas + nota;
			contador++; // Contador actualizado al final del bloque
		}

		notaMedia = sumaNotas / contador; // Cálculo de nota media

		System.out.println("La calificación media del grupo es " + notaMedia);

		lector.close();
	}

}
