/**Faça um algoritmo que receba um número e diga se este número está no
intervalo entre 100 e 200;
*/ 
package exercício.pkg15;

import  java.util.Scanner;

public class Exercício15 {

   
    public static void main(String[] args) {
        
        int valorRecebido = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        valorRecebido = leitor.nextInt();
        
        if (valorRecebido > 100 && valorRecebido < 200){
             System.out.println("O valor está dentro do intervalo");
             
        } else {
            System.out.println("O valor está fora do intervalo");
    }
    
}

}