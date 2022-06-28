/*
 Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 */

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = 0;
        for (;;) {
            System.out.println("Digite um número inteiro");
            N = leitor.nextInt();
            
            if (N >0) {
                System.out.println("O número é positivo");
            }else if (N < 0){
                System.out.println("O número é negativo");
            } else {
                System.out.println("O número é zero");
            }
            
        }
        
    }
    
}
