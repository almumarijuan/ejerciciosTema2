package ej2_6_palindromo;

import java.util.Scanner;

public class PalindromoRecursivo {
	
	public static boolean esPalindromo(String texto) {
		//caso base: cadena de longitud 0 o 1
		if (texto.length() <= 1) return true;
		//paso recursivo: comparar inicio y final
		if(texto.charAt(0) != texto.charAt(texto.length()-1)) {
			return false;
		}
		return esPalindromo(texto.substring(1,texto.length()-1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la palabra que quiera comprobar:");
		String texto = sc.nextLine();
		System.out.println(esPalindromo(texto));
		sc.close();
		
	}
}
