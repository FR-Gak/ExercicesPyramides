package pyramides;

import java.util.Scanner;

public class Pyra5 {
	
	public static int lignes=0;
	public static int etages=0;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un entier (lignes):");
		try {
			lignes = clavier.nextInt()-1;
		} catch (Exception e) {
			System.out.println("Ce n'est pas un valeur possible.");
		}
		System.out.println("Entrer un entier (etages):");
		try {
			etages = clavier.nextInt()-1;
		} catch (Exception e) {
			System.out.println("Ce n'est pas un valeur possible.");
		}
		for(int i = etages; i>=0;i--){
			etage(i);
		}
	}
	public static void etage(int nEtage){
		for(int i = 0; i<=lignes;i++){
			for(int e = nEtage*(lignes+1)-1;e>=0;e--)System.out.print(" ");//esapce avant chaque ligne en fonction de l'etage
			for(int e = (lignes-1)-i; e>=0; e--)System.out.print(" ");//espace avant chaque ligne en fonction de la ligne
			ligne(i, nEtage);
			System.out.println("");
		}
	}
	public static void ligne(int nLigne, int nEtage){
		for(int i = etages-nEtage;i>=0;i--){//nombre de pyra à faire
			if(i == 0){
				for(int e = 2*nLigne; e>=0;e--)System.out.print("*");
			}else{
				for(int e = 2*nLigne; e>=0;e--)System.out.print("*");
				for(int e = 2*(lignes-nLigne); e>=0; e--)System.out.print(" ");//espace entre deux pyra
			}
		}
	}
}
