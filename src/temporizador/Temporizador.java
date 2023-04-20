package temporizador;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Temporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int segundos;
        int h, m, s, resto;

        Scanner scanf = new Scanner(System.in);

        System.out.println("Quantos segundos você deseja no seu temporizador?");
        segundos = scanf.nextInt();
        
        try {
            while (segundos >= 0) {

                h = segundos / 3600;
                resto = segundos % 3600;
                m = resto / 60;
                s = resto % 60;

                segundos--;

                System.out.printf(" %2d: %2d: %2d\n", h, m, s);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }

    }

}
