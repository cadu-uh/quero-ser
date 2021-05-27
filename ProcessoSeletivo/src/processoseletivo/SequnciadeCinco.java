package processoseletivo;

/**
 *
 * @author Carlos
 */

//Url https://dojopuzzles.com/problems/sequencia-de-cinco/
import java.util.Random;

public class SequnciadeCinco {

    public static Random gerador = new Random();

    public static int[][] preenche(int m[][]) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = gerador.nextInt(5)+ 1;
            }
        }

        return m;

    }

    public static void print(int m[][]) {

        for (int i = 0; i < m.length; i++) {
            System.out.println("");

            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");

            }
        }
    }

    public static int[] prodLinha(int m[][]) {

        int vetor[] = new int[5];
        int aux = 1, i = 0;

        while (i < vetor.length) {

            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k < m[0].length; k++) {
    
                        aux = aux * m[j][k];
                }
                 vetor[i]=aux;
                aux=1;
                i++;
            }
        }

        return vetor;
    }
  
    
    public static int[] prodColuna(int m[][]) {

        int vetor[] = new int[5];
        int aux = 1, i = 0;

        while (i < vetor.length) {

            for (int j = 0; j < m[0].length; j++) {
                for (int k = 0; k < m.length; k++) {
    
                        aux = aux * m[k][j];
                }
                 vetor[i]=aux;
                aux=1;
                i++;
            }
      }

        return vetor;
    }
    
    public static int prodDiag1 (int m[][]){
        int num = 1;
  
            
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if(i == j){
                        num = num*m[i][j];  
                    }
                    
                }
            
        }
        
        return num;
    }
    
    public static int prodDiag2 (int m[][]){
        int num = 1;
        int coluna = m[0].length-1;
        int linha= 0;
        
        while (coluna >=0 && linha < m.length){
            num = num * m[coluna][linha];
            linha++;
            coluna--;
        }
  
        return num;
    }
    
    public static int numMaior(int v1[], int v[], int num, int num2){
        int maior = num;
        
        int vet[] = new int[12];
        
        for (int i = 0; i < 5; i++) {
            vet[i]=v1[i];
            vet[i+5]= v[i];
            
        }
        
      vet[vet.length-1] = num;
      vet[vet.length-2] = num2;
      
        for (int i = 0; i <vet.length; i++) {
            if(vet[i] > maior){
                maior = vet[i];
            }    
        }
        return maior;  
    }

    public static void main(String[] args) {

        int m[][] = new int[5][5];
        m = preenche(m);
        print(m);
        int vetor[] = prodLinha(m);
        int vetor2[] = prodColuna(m);
        System.out.println("\n");
        int n =prodDiag1(m);
        int n1 = prodDiag2(m);
        int maior = numMaior(vetor, vetor2, n, n1);
      
        System.out.println(maior);   
    }

}
