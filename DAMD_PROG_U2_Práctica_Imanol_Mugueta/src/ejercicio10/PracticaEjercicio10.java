package ejercicio10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio10 {

	public static void main(String[] args) {

		// Enunciado del ejercicio
		JOptionPane.showMessageDialog(null, "Ejercicio 10 - Billetes y monedas");

		// Declaración de variables
		int billete500;
		int billete200;
		int billete100;
		int billete50;
		int billete20;
		int billete10;
		int billete5;
		int moneda2;
		int moneda1;
		int cantidad = 0;
		Scanner lector = new Scanner(System.in);

		// Entrada y conversión
		System.out.print("Introduce la cantidad: ");
		cantidad = lector.nextInt();

		
		// Condiciones de entrada, calculos y salida
		if (cantidad >= 500) {
			billete500 = cantidad / 500;
			System.out.println("Billetes de 500€: " + billete500);
			cantidad %= 500; // Obtenemos el resto de la cantidad omitiendo los billetes de 500
		}

		if (cantidad >= 200) {
			billete200 = cantidad / 200;
			System.out.println("Billetes de 200€: " + billete200);
			cantidad %= 200; // Obtenemos el resto de la cantidad omitiendo los billetes de 200
		}

		if (cantidad >= 100) {
			billete100 = cantidad / 100;
			System.out.println("Billetes de 100€: " + billete100);
			cantidad %= 100; // Obtenemos el resto de la cantidad omitiendo los billetes de 100
		}

		if (cantidad >= 50) {
			billete50 = cantidad / 50;
			System.out.println("Billetes de 50€: " + billete50);
			cantidad %= 50; // Obtenemos el resto de la cantidad omitiendo los billetes de 50
		}

		if (cantidad >= 20) {
			billete20 = cantidad / 20;
			System.out.println("Billetes de 20€: " + billete20);
			cantidad %= 20; // Obtenemos el resto de la cantidad omitiendo los billetes de 20
		}

		if (cantidad >= 10) {
			billete10 = cantidad / 10;
			System.out.println("Billetes de 10€: " + billete10);
			cantidad %= 10; // Obtenemos el resto de la cantidad omitiendo los billetes de 10
		}

		if (cantidad >= 5) {
			billete5 = cantidad / 5;
			System.out.println("Billetes de 5€: " + billete5);
			cantidad %= 5; // Obtenemos el resto de la cantidad omitiendo los billetes de 5
		}

		if (cantidad >= 2) {
			moneda2 = cantidad / 2;
			System.out.println("Monedas de 2€: " + moneda2);
			cantidad %= 2; // Obtenemos el resto de la cantidad omitiendo las monedas de 2
		}

		if (cantidad >= 1) {
			moneda1 = cantidad / 1;
			System.out.println("Monedas de 1€: " + moneda1);
			cantidad %= 1; 
		}

		
		lector.close();

	}
}