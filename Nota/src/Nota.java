import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez e continue pedindo até que o usuário informe um valor válido.
 */


public class Nota {
   // private static int nota;

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;
            
            System.out.println("Nota: ");
            nota = scan.nextInt();

            while(nota < 0 | nota>10){
                System.out.println("Nota inválida! Digite novamente: ");
                nota = scan.nextInt();

            }
        }
        
    }

}
