package asdas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora {
    
    public static String leitor(String path) throws IOException {
        FileReader leitor = new FileReader(path);
        BufferedReader bf = new BufferedReader(leitor);
        String linha = "";
        while (true) {
            if (linha != null) {
                return linha = bf.readLine();
            } else {
                break;
            }
        }
        bf.close();
        return linha;
    }
    
 
    public static double somar(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtrair(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiplicar(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    
     public static double dividir (double num1 , double num2){
      double result = num1 / num2;
      return result;
    }
     
     public static void main(String[] args) throws IOException {
        String cami1 ="txtValor1.txt";
        String cami2 = "txtValor2.txt";
        
        double num1 = Double.parseDouble(leitor(cami1));
        double num2 = Double.parseDouble(leitor(cami2));
        
        double soma= somar(num1, num2);
        double subtrai = subtrair(num1, num2);
        double dividi = dividir(num1, num2);
        double mutiplica = multiplicar(num1, num2);
        
         System.out.println("Valores: \n"
                 + "Soma: "+ soma+ "\n "
                 + "Subtração: " + subtrai + "\n "
                 + "Divisão: " + dividi + "\n "
                 + "Multiplicação: " + mutiplica + "");
        
        
        
    }
    
}
     

    


