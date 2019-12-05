package com.elorrieta;

import java.util.Scanner;

public class Biblios {

	public static void main(String[] args) {
		// 
		System.out.println("Incio de proyecto");
		
		System.out.println("Por favor, introduzca que operación quiere realizar:");
		System.out.println("A: sacar un libro");
		System.out.println("B: devolver un libro");
		System.out.println("s: salir");
		System.out.println("");
		System.out.println("Seleccione una opción valida");
		
		Scanner sc= new Scanner(System.in);
		char opcion=sc.nextLine().toUpperCase().charAt(0);
		
		switch (opcion) {
		case 'A': 
			
			break;
		case 'B': 
			
			break;
		case 'S': 
			
			break;

		default:
			break;
		}
		sc.close();
	}

}
