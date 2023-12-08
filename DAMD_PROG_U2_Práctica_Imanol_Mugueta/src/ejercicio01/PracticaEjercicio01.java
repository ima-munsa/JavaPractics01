package ejercicio01;

import java.util.Scanner; // Paquete clase Scanner

import javax.swing.JOptionPane; // Paquete clase JOptionPane

public class PracticaEjercicio01 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ejercicio 01 - Mayor de edad (if)");

		// Declaración de variables y entradas (almacenar información introducida por
		// usuario)

		Scanner lector = new Scanner(System.in); // Declaración variable "lector" (clase Scanner)

		System.out.print("Introduzca su nombre: ");
		String nombre = lector.next(); // Declaración variable "nombre" (String)

		System.out.print("Introduzca su edad: ");
		int edad = lector.nextInt(); // Declaración variable "edad" (int)

		// Operacion condicional para comprobar la edad del usuario

		if (edad >= 18) {
			System.out.println("Hola " + nombre + ", es mayor de edad y tiene permiso para acceder al sistema");
		} else {
			System.out.println("Hola " + nombre + ", es menor de edad y no puedes acceder al sistema");
		}

		lector.close();

	}

}
