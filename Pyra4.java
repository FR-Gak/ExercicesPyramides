package pyramides;

import java.util.Scanner;

public class Pyra4 {

	private static int lignes=0;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un entier :");
		try {
			lignes = clavier.nextInt()-1;
		} catch (Exception e) {
			System.out.println("Ce n'est pas un valeur possible.");
		}
		for(int i = 0; i<=lignes;i++){
			ligne(i);
		}
		for(int i = 0; i<=lignes;i++){
			ligneDouble(i);
		}
	}
	public static void ligne(int nLigne){//pyra du haut
		for(int e = 2*lignes-nLigne; e>=0; e--)System.out.print(" ");
		for(int e = 2*nLigne; e>=0;e--){
			if(e==0)System.out.println("*");
			else System.out.print("*");
		}
	}
	public static void ligneDouble(int nLigne){
		for(int e = (lignes-1)-nLigne; e>=0; e--)System.out.print(" ");
		for(int e = 2*nLigne; e>=0;e--)System.out.print("*");//première pyra du bas
		for(int e = 2*(lignes-nLigne); e>=0; e--)System.out.print(" ");//espace entre deux pyra du bas
		for(int e = 2*nLigne; e>=0;e--){//deuxieme pyra du bas
			if(e==0)System.out.println("*");
			else System.out.print("*");
		}
	}
}
