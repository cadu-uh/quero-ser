package asdas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pergunta24 {

    public static void leitor(String path) throws IOException {
        FileReader leitor = new FileReader(path);
        BufferedReader bf = new BufferedReader(leitor);
        String linha = "";
        while (true) {
            if (linha != null) {
                linha = bf.readLine();
                System.out.println(linha);
            } else {
                break;
            }
        }
        bf.close();

    }

    public static void main(String[] args) throws IOException {
        String caminho = "nomes.txt";

        leitor(caminho);
      
        
    }

}
