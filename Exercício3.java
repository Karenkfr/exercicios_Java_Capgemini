
package exercício.pkg3;

import java.util.Scanner;


public class Exercício3 {

    
    public static void main(String[] args) {
       
        float kilometragemPercorrida = 0f;
        float litrosCombustível = 0f;
        float consumoMedio = 0f;
        
        Scanner leitor  = new Scanner(System.in);
        
        System.out.println("Digite a kilometragem percorrida");
        kilometragemPercorrida = leitor.nextFloat();
        
        System.out.println("Digite quantos litros possuía o tanque do carro");
        litrosCombustível = leitor.nextFloat();
        
        consumoMedio = kilometragemPercorrida/litrosCombustível;
        
        System.out.println("O Consumo médio é: " + consumoMedio);
        
        
     
    }
    
}
