package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.model.GestionBiblioteca;

public class Menu {
	
	static GestionBiblioteca gb = new GestionBiblioteca();

	public static void main(String[] args) {

		try {
			while (true) {
				mostrarMenu();
				gestionarBiblio(recogerOpcion());
				System.out.println();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void mostrarMenu() {
		System.out.println("1. Generar libros");
		System.out.println("2. Mostrar libros");
		System.out.println("3. Mostrar autores");
		System.out.println("4. Mostrar libros > 1900");
		System.out.println("5. Introducir libro");
		System.out.println("6. Salir");
		System.out.print("Introduce tu opción: ");
	}

	public static int recogerOpcion() throws NumberFormatException, IOException {
		BufferedReader consola = new BufferedReader(new InputStreamReader(
				System.in));
		int a = Integer.parseInt(consola.readLine());
		return a;
	}

	public static void gestionarBiblio(int opcion) throws NumberFormatException, IOException{
		switch (opcion) {
		case 1:
			gb.generarLibros();
			break;
		case 2:
			gb.mostrarLibros();

			break;
		case 3:
			gb.mostrarAutores();

			break;
		case 4:
			gb.mostrarLibrosModernos();

			break;
		case 5:
			gb.introducirLibro();

			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Opción no contemplada");
			break;
		}
	}
}
