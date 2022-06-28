/*
 Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
maior, e uma mensagem que são diferentes;
 */

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        num1 = leitor.nextInt();
        
        System.out.println("Digite outro número");
        num2 = leitor.nextInt();
        
        if (num1 == num2) {
            System.out.println("Os numeros digitados são iguais");
        } else if (num1 > num2) {
            System.out.println("O numero maior é: " + Math.max(num1,num2)+ " e eles são diferentes");
        }
       
    }
    
}
