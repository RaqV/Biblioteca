package com.elorrieta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblios {

	public static void main(String[] args) {
		// 
		System.out.println("Incio de proyecto");
		
		boolean finalizar = false;
		do {
		
		System.out.println("Por favor, introduzca que operación quiere realizar:");
		System.out.println("A: sacar un libro");
		System.out.println("B: devolver un libro");
		System.out.println("s: salir");
		System.out.println("");
		System.out.println("Seleccione una opción valida");
		
		Scanner sc= new Scanner(System.in);
		char opcion=sc.nextLine().toUpperCase().charAt(0);
		
		List<Libro> listaLibros = new ArrayList<Libro>();
		
		switch (opcion) {
		case 'A': 
			listaLibros.remove(0);
			break;
		case 'B': 
			listaLibros.add(new Libro("el silmarillosn", "a001"));
			break;
		case 'S': 
			finalizar = true;
			break;

		default:
			break;
		}
		sc.close();
	}while(finalizar==false);
	}
}
