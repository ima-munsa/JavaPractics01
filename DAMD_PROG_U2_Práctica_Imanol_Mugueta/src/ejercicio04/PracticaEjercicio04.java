package ejercicio04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio04 {

	public static void main(String[] args) {

		// Mensaje de información sobre funcionamiento

		JOptionPane.showMessageDialog(null,"Ejercicio 04 - Número de aprobados (do-while):  "
				+ "Las calificaciones deben ser de 0 a 10, -1 para finalizar");

		// Declaración variables
		Scanner lector = new Scanner(System.in);
		int nota = 0;
		int contadorAprobado = 0;

		do {
			System.out.print("Introduce una calificación: ");
			nota = lector.nextInt();
			if (nota >= 5 && nota <= 10) {
				contadorAprobado++;
			} else if (nota > 10) {
				System.out.println("Debes introducir un valor menor de 10");
			}

		} while (nota >= 0);

		// Salida
		System.out.println("Total de aprobados: " + contadorAprobado);

		lector.close();

	}

}
