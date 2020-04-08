package Mathematique;

import java.util.ArrayList;

public class NombreParfait {

	// methode qui determine si nombre est parfait 
	// ( c-a-d la somme de ses diviseurs l'egale )
	public static boolean parfait(int n) {
		// on recolte la liste des diviseurs
		ArrayList<Integer> diviseurs = new ArrayList<Integer>();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				diviseurs.add(i);
			}
		}
		// on somme les diviseurs
		int somme = 0;
		for(int d:diviseurs) {
			somme = somme + d;
		}
		// on compare pour voir si parfait
		if(somme==n) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// on va essayer de voir tout les nombres parfait a un seuil donnée
		int seuil = 10000;
		for(int i=1;i<seuil;i++) {
			if(parfait(i)) {
				System.out.println(i);
			}
		}
	}
	
}
