package ej21sistdearchivos;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; // Archivos directos en esta carpeta
	private List<Carpeta> subcarpetas; // Carpetas dentro de esta carpeta
	
	public Carpeta (String nombre) { 
		this.nombre=nombre;
		this.archivos= new ArrayList<Archivo>();
		this.subcarpetas=new ArrayList<Carpeta>();
	}
	public List<Archivo> getArchivos () { return this.archivos; }
	public List<Carpeta> getSubcarpetas () { return this.subcarpetas; }
	
	public static double calcularPesoTotal (Carpeta inicio) {
		double suma=0;
		for(Archivo a: inicio.getArchivos()) {
			suma += a.getPesoMB();
		}
		for(Carpeta c: inicio.getSubcarpetas()) {
			suma += calcularPesoTotal(c);
		}
		return suma;
	}
	
	public static void main(String[] args) {
	    // Crear archivos
	    Archivo a1 = new Archivo("foto.png", 2.5);
	    Archivo a2 = new Archivo("documento.pdf", 1.2);
	    Archivo a3 = new Archivo("video.mp4", 15.0);
	    Archivo a4 = new Archivo("notas.txt", 0.3);

	    // Crear carpetas
	    Carpeta raiz = new Carpeta("raiz");
	    Carpeta sub1 = new Carpeta("sub1");
	    Carpeta sub2 = new Carpeta("sub2");
	    Carpeta subsub = new Carpeta("subsub");

	    // Añadir archivos a carpetas
	    raiz.getArchivos().add(a1);
	    raiz.getArchivos().add(a2);

	    sub1.getArchivos().add(a3);
	    sub2.getArchivos().add(a4);

	    // Añadir subcarpetas
	    raiz.getSubcarpetas().add(sub1);
	    raiz.getSubcarpetas().add(sub2);

	    sub1.getSubcarpetas().add(subsub);  // subcarpeta dentro de sub1

	    // Calcular el peso total
	    double total = calcularPesoTotal(raiz);

	    System.out.println("El peso total es: " + total + " MB");
	}
}
