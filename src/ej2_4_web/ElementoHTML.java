package ej2_4_web;

import java.util.ArrayList;
import java.util.List;

public class ElementoHTML {
	
	private String tag; // Ejemplo: "div", "p", "img"
	private List<ElementoHTML> hijos;
	public ElementoHTML(String tag) {
		this.tag=tag;
		this.hijos= new ArrayList<ElementoHTML>();
	}
	
	public String getTag () { return this.tag; }
	
	public List<ElementoHTML> getHijos () { return this.hijos; }

	//devuelve un entero indicando
	//cuántas veces aparece una etiqueta específica (tagBuscado) dentro del árbol que comienza en
	//elemento.
	public static int contarEtiquetas (ElementoHTML elemento, String tagBuscado) {
		int numTag=0;
		if(elemento.getTag().equals(tagBuscado) ) {
			numTag +=1;
		}
		for(ElementoHTML e: elemento.getHijos()) {
			numTag +=contarEtiquetas(e,tagBuscado);
		}
		return numTag;
	}

	public static void main(String[] args) {
		

	}

}
