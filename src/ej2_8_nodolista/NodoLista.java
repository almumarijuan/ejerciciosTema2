package ej2_8_nodolista;

public class NodoLista {
	
	private int dato;
	private NodoLista siguiente;
	
	public NodoLista(int dato,NodoLista siguiente) {
		this.dato=dato;
		this.siguiente=siguiente;
	}
	public static NodoLista invertirRecursivo (NodoLista actual) {
		// Caso base: lista vacía o único elemento
		if (actual == null || actual.siguiente == null) {
		return actual;
		}
		// Paso recursivo:
		// TODO: Complete este código
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
