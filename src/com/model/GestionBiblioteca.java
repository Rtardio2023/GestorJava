package com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionBiblioteca {

	List<Libro> libros = new ArrayList<Libro>();
	
	public void generarLibros(){
		Libro l = new Libro();
		l.setTitulo("Aldaleon");
		l.setAutor("Silvano Gil");
		l.setFecha(2009);
		libros.add(l);
		
		l = new Libro();
		l.setTitulo("Helena");
		l.setAutor("Silvano Gil");
		l.setFecha(2011);
		libros.add(l);
	}
	
	public void mostrarLibros(){
		for (Iterator iterator = libros.iterator(); iterator.hasNext();) {
			Libro libro = (Libro) iterator.next();
			System.out.println("Titulo: "+libro.getTitulo());
		}
	}	
	
	public void mostrarAutores(){
		for (Iterator iterator = libros.iterator(); iterator.hasNext();) {
			Libro libro = (Libro) iterator.next();
			System.out.println("Autor: "+libro.getAutor());
		}
	}
	
	public void mostrarLibrosModernos(){
		for (Iterator iterator = libros.iterator(); iterator.hasNext();) {
			Libro libro = (Libro) iterator.next();
			if(libro.getFecha()>1900){
				System.out.println("Titulo: "+libro.getTitulo());
			}
		}
	}
	
	public void introducirLibro() throws NumberFormatException, IOException{
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in)); 
		Libro libro = new Libro();
		
		System.out.print("Titulo> ");
	    libro.setTitulo(consola.readLine()); 
	    
	    System.out.print("Autor> ");
	    libro.setAutor(consola.readLine()); 

        System.out.print("Fecha> ");
        libro.setFecha(Integer.parseInt(consola.readLine())); 
        
        libros.add(libro);

	}
}
