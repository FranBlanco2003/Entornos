import java.util.Scanner;

public class Ej7p2A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca número: ");

        int n = sc.nextInt();

        int[][] aN = new int[n][n];

        int c = 0;

        // Rellena array con nulos
        for (int i = 0; i < aN.length; i++) {
            for (int j = 0; j < aN.length; j++) {
                double p = Math.random();
                if (p <= 0.1) {
                    aN[i][j] = (int) ((Math.random() * 9) + 1);
                    c = c + 1;
                } else {
                    aN[i][j] = 0;
                }
            }
        }

        // Rellenar nuevo array
        int[][] aO = new int[c][3];
        int contador = 0;
        for (int i = 0; i < aN.length; i++) {
            for (int j = 0; j < aN.length; j++) {
                if (aN[i][j] != 0) {
                    aO[contador][0] = i + 1;
                    aO[contador][1] = j + 1;
                    aO[contador][2] = aN[i][j];
                    contador = contador + 1;
                }
            }
        }

        System.out.println("Matriz casi nula: ");
        // imprime
        for (int i = 0; i < aN.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < aN.length; j++) {
                System.out.print(aN[i][j] + " ");

            }
            System.out.print("|");
            System.out.println();
        }

        System.out.println();

        System.out.println("Matriz óptima: ");
        // imprime nuevo
        for (int i = 0; i < aO.length; i++) {
            System.out.print("| ");
            System.out.print(aO[i][0] + " ");
            System.out.print(aO[i][1] + " ");
            System.out.print(aO[i][2]);
            System.out.print(" |");
            System.out.println();
        }
        sc.close();
    }
}
