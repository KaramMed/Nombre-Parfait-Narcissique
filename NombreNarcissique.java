package Mathematique;

import java.util.ArrayList;

public class NombreNarcissique {

	// methode qui determine si un nombre est narcissique
	// exemple 8202 = 8^4 + 2^4 + 0^4 + 2^4
	public static boolean narcissique(int n) {
		// on calcule la taille du nombre
		int taille = String.valueOf(n).length();
		// on recupere chaque chiffre 
		ArrayList<Integer> chiffres = new ArrayList<Integer>();
		int nombre = n;
		while(n>0) {
			chiffres.add(n%10);
			n=n/10;
		}
		// on somme les chiffres a la puissance de la taille
		int somme = 0;
		for(int c : chiffres) {
			somme = (int) (somme + Math.pow(c,taille));
		}
		if(nombre==somme) {
			return true;
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		// pour chaque nombre sous seuil on voit s'il l'est
		int seuil = 100000;
		for(int i=0;i<seuil;i++) {
			if(narcissique(i)) {
				System.out.println(i);
			}
		}
	}
	
}
