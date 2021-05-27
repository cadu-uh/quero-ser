
package processoseletivo;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */

// URL https://dojopuzzles.com/problems/produto-escalar-de-vetores/
public class EscalaVetores {
    
    public static int[] intercalaVetor (int [] ve1, int[] ve2){
        
            int [] ve3 = new int [ve1.length*2];
            int aux1 = 0, aux2 = 0;
      
            for (int i = 0; i < ve3.length; i++) {
                if (i % 2 == 0){
                    ve3[i] = ve1[aux1];
                    aux1++;
                    
                }else if (i % 2 !=0 ){
                    ve3[i] = ve2[aux2];
                    aux2++;
                }

        }
                 
            return ve3;
        }
    
    public static void main(String[] args) {
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual Tamanho dos Vetores ?");
        int tam = input.nextInt();
        
        int vet1[] = new int[tam];
        for (int i = 0; i < vet1.length; i++) {
            vet1[i]=1;
        }
        int vet2[] = new int[tam];
        for (int i = 0; i < vet2.length; i++) {
            vet2[i]=0;
        }
        
        int [] v3 = intercalaVetor(vet1, vet2);
        System.out.println("");
        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i]+ " ");
        }
        
    }
    
}
