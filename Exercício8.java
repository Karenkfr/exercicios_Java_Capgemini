
package exercício.pkg8;

import java.util.Scanner;

public class Exercício8 {

    
    public static void main(String[] args) {
        
        double cotacaoDolar=0.0d;
        double quantidadeReal=0.0d;
        double valorDolar =0.0d;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a cotação do Dolar");
        cotacaoDolar = leitor.nextDouble();
        
        System.out.println("Digite o valor em real possuído");
        quantidadeReal = leitor.nextDouble();
        
        valorDolar = quantidadeReal/cotacaoDolar;
        
        System.out.println("O valor possuído, em dolar é: U$" + valorDolar);
        
        
       
        
        
    }
    
}
