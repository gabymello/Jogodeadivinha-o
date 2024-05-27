
 
package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class Jogodaadivinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(10) + 1;
        int tentativas = 0;
        int contador = 0;

        String nome = JOptionPane.showInputDialog(null, "Olá,qual o seu nome?");

        System.out.println("Você terá 5 chances para adivinhar o número.");
        int numero = 0;
        while (numero != numeroAleatorio) {
            contador ++;
            System.out.println("Adivinhe o número?");

            numero = sc.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Você acetou!!" + "Em " + contador + " vezes");

            } else if (numero > numeroAleatorio) {
                System.out.println("O número que foi digitado é maior que o número sorteado.");
            } else {
               
                System.out.println("O número que foi digitado é menor que o número sorteado.");

            }
        }
            
    }
    
}
