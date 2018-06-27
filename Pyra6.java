package pyramides;

import java.util.Scanner;

public class Pyra6 {
	
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
			return;
		}
		System.out.println("Entrer un entier (etages):");
		try {
			etages = clavier.nextInt()-1;
		} catch (Exception e) {
			System.out.println("Ce n'est pas un valeur possible.");
			return;
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
			if(i == 0){// dernière pyra de l'étage
				System.out.print("*");
				for(int e = 2*nLigne-2; e>=0;e--)System.out.print(" "); 
				if(nLigne !=0)System.out.print("*");
			}else{
				System.out.print("*");//début de la pyramide
				for(int e = 2*nLigne-2; e>=0;e--)System.out.print(" ");//espace dans la pyra 
				if(nLigne !=0)System.out.print("*");//fin de la pyra
				for(int e = 2*(lignes-nLigne); e>=0; e--)System.out.print(" ");//espace entre deux pyra
			}
		}
	}
}
