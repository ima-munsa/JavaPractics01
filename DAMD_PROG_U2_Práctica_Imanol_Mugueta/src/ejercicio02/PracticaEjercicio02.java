package ejercicio02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio02 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ejercicio 02 - Mes del año (switch)");

		// Entrada

		Scanner lector = new Scanner(System.in); // Declaración variable "lector" (clase Scanner)
		System.out.print("Por favor, introduzca un número del 1 al 12: ");

		// Operación (conversión de Scanner a int)
		int numeroMes = lector.nextInt(); // Declaración variable "numeroMes" (String)

		// Salida

		switch (numeroMes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		}
		lector.close();

	}

}
