
package exercício.pkg11;

import java.util.Scanner;

public class Exercício11 {

    
    public static void main(String[] args) {
        
        float precoCusto = 0.0f;
        double acrescimo=0.0f;
        double valorVenda=0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o preço de custo");
        precoCusto = leitor.nextFloat();
        
        System.out.println("Digite o percentual de acréscimo");
        acrescimo = leitor.nextDouble();
        
        valorVenda = (precoCusto + (precoCusto * acrescimo));
        
        System.out.println("O valor de venda do produto é: " + valorVenda);
                
         
        
        
        
       
        
        
       
    }
    
}
