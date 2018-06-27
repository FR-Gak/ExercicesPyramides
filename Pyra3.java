package pyramides;

import java.util.Scanner;

public class Pyra3 {

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
			if(i%2 ==0)ligneTirets(i);
			else ligneEtoiles(i);
		}
	}
	public static void ligneTirets(int nLigne){
		for(int e = (lignes-1)-nLigne; e>=0; e--)System.out.print(" ");
		for(int e = 2*nLigne; e>=0;e--){
			if(e==0)System.out.println("-");
			else System.out.print("-");
		}
	}
	public static void ligneEtoiles(int nLigne){
		for(int e = (lignes-1)-nLigne; e>=0; e--)System.out.print(" ");
		for(int e = 2*nLigne; e>=0;e--){
			if(e==0)System.out.println("*");
			else System.out.print("*");
		}
	}
}
