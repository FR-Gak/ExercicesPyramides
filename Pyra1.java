package pyramides;

import java.util.Scanner;

public class Pyra1 {
	
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
		for(int i = lignes; i>=0;i--){
			ligne(i-1);
		}
	}
	public static void ligne(int nLigne){
		for(int e = (lignes-1)-(nLigne+1); e>=0; e--)System.out.print(" ");
		for(int e = 2*nLigne; e>=0;e--){
			if(e==0)System.out.println("*");
			else System.out.print("*");
		}
	}
}
