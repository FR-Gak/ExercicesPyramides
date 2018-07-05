package pyramides;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyra1et2 {

    private static int lineCount = 0;
    private static String directionInputStr = "";

    public static void main(String[] args) {
        // Prompt the user to select the pyramid size and direction
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Entrer un entier :");
            lineCount = input.nextInt();

            System.out.println("Choisir le sens de la pyramide (up or down) :");
            input.nextLine();
            directionInputStr = input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Ce n'est pas un valeur possible.");
            return;
        }

        Direction direction = Direction.fromName(directionInputStr);

        if (direction == null) {
            System.out.println("Choix non valide.");
            return;
        }

        // Draw the pyramid according to the requested size and direction
        for (int i = 0; i < lineCount; i++) {
            int lineIndex;
            switch (direction) {
                case UP:
                    lineIndex = i;
                    break;
                case DOWN:
                    lineIndex = lineCount - 1 - i;
                    break;
                default:
                    throw new UnsupportedOperationException("The " + direction + " direction is not supported");
            }
            drawLine(lineIndex);
        }
    }

    /**
     * Draw one line of the pyramid
     *
     * @param lineIndex The index of the line from {@code 0} to {@code size - 1}
     */
    public static void drawLine(int lineIndex) {
        for (int e = (lineCount - 1) - (lineIndex + 1); e >= 0; e--) System.out.print(" ");
        for (int e = 2 * lineIndex; e >= 0; e--) System.out.print("*");
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
