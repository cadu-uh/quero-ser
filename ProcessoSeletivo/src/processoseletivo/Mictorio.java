package processoseletivo;
/**
 *
 * @author Carlos
 */

// Url https://dojopuzzles.com/problems/distribuicao-de-mictorios/
import java.util.Scanner;

public class Mictorio {

    public static int[] mijoes(int mij, int[] mics) {

        int aux = mij;

        if (mij == 0) {
            for (int i = 0; i < mics.length; i = i + 2) {
                mics[i] = 1;
            }

        } else if (mij == mics.length - 1) {

            for (int i = mics.length - 1; i >= 0; i = i - 2) {
                mics[i] = 1;
            }
        } else {

            for (int i = mij; i < mics.length; i += 2) {
                mics[i] = 1;
                if (i + 2 >= mics.length-1) {

                    for (int j = aux; j >= 0; j -= 2) {
                        mics[j] = 1;
                    }

                }
            }
        }

        return mics;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos Mictorios ha no banheiro ?");
        int mij = input.nextInt();
        int vetor[] = new int[mij];

        System.out.println("\n Em Qual dos Mictorios Abaixo você quer fazer suas necessidades ?");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(i + " ");

        }

        int mic = input.nextInt();
        
        vetor=mijoes(mic, vetor);
        System.out.println("Mictorios Disponiveis : ");
        
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == 1){
                System.out.print(i + " ");
            }
            
        }

    }

}
