/*
 Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80,
menor que 25 ou igual a 40;
 */

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = 0;
        
        
        for(;;) {
            System.out.println("Digite um número");
            N = leitor.nextInt();
                if (N > 80){
                    System.out.println("O número é maior que 80");
                } else if (N < 25) {
                    System.out.println("O número é menor que 25");
                } else if (N == 40) {
                    System.out.println("O número é 40 ");
                } else {
                    System.out.println("O numero está fora do intervalo");
                }
        
        }
        
    }
    
}
