/**Leia dois valores para as variáveis A e B,efetuar as trocas dos valores de 
 * forma que a variável A passe a possuir ovalor da variável B e a variável B 
 * passe a possuir o valor da variável A.Apresentar os valores trocados;
*/
package exercício.pkg6;

import java.util.Scanner;


public class Exercício6 {
    public static void main(String[] args) {
       
        int variavelA=0;
        int variavelB=0;
        int variavelC=0;
        
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um valor para A");
    variavelA = leitor.nextInt();
    
    System.out.println("Digite um valor para B");
    variavelB = leitor.nextInt();
    
    
    variavelC = variavelA;
    variavelA = variavelB;
    variavelB = variavelC;
    
    System.out.println("O novo valor de A é: " + variavelA);
    
    System.out.println("O novo valor de B é: " + variavelB);
    
    }
    
}
