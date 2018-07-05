package pyramides;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyra1et2 {

    private static int lines = 0;
    private static String direction = "";

    public static void main(String[] args) {
        // Prompt the user to select the pyramid size and direction
        try (Scanner clavier = new Scanner(System.in)) {
            System.out.println("Entrer un entier :");
            lines = clavier.nextInt();

            System.out.println("Choisir le sens de la pyramide (up or down) :");
            clavier.nextLine();
            direction = clavier.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Ce n'est pas un valeur possible.");
            return;
        }

        Direction directionEnum = Direction.fromName(direction);

        if (directionEnum == null) {
            System.out.println("Choix non valide.");
            return;
        }

        // Draw the pyramid according to the requested size and direction
        for (int i = 0; i < lines; i++) {
            int value;
            switch (directionEnum) {
                case UP:
                    value = i;
                    break;
                case DOWN:
                    value = lines - 1 - i;
                    break;
                default:
                    throw new UnsupportedOperationException("The " + directionEnum + " direction is not supported");
            }
            drawLine(value);
        }
    }

    /**
     * Draw one line of the pyramid
     *
     * @param currentLine The index of the line from {@code 0} to {@code size - 1}
     */
    public static void drawLine(int currentLine) {
        for (int e = (lines - 1) - (currentLine + 1); e >= 0; e--) System.out.print(" ");
        for (int e = 2 * currentLine; e >= 0; e--) System.out.print("*");
        System.out.println();
    }

    public enum Direction {
        UP,
        DOWN,
        RIGHT;

        public static Direction fromName(String name) {
            for (Direction direction : Direction.values()) {
                if (name.equalsIgnoreCase(direction.name())) {
                    return direction;
                }
            }
            return null;
        }
    }
}
