package pyramides;

import java.util.Scanner;

public class Pyra1et2 {
	
	private static int lines=0;
	private static String direction= "";

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer un entier :");
		try {
			lines = clavier.nextInt();
		} catch (Exception e) {
			System.out.println("Ce n'est pas un valeur possible.");
			return;
		}
		
		System.out.println("Choisir le sens de la pyramide (up or down) :");
		try {
			clavier.nextLine();
			direction = clavier.nextLine();
		} catch (Exception e) {
			System.out.println("Ce n'est pas un valeur possible.");
			return;
		}
		
		if(direction.equalsIgnoreCase("up")){
			for(int i = 0; i<lines;i++){
				drawLine(i);
			}
		}else if(direction.equalsIgnoreCase("down")){
			for(int i = lines; i>=0;i--){
				drawLine(i-1);
			}
		}else{
			System.out.println("Choix non valide.");
			return;
		}
	}
	
	public static void drawLine(int currentLine){
		for(int e = (lines-1)-(currentLine+1); e>=0; e--)System.out.print(" ");
		for(int e = 2*currentLine; e>=0;e--)System.out.print("*");
		System.out.println("");
	}
}
