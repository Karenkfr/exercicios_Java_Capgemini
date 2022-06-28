/*Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior*/

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escreva um número");
        num1 = leitor.nextInt();
        
        System.out.println("Escreva outro número");
        num2 = leitor.nextInt();
        
        if (num1 > num2) {
        System.out.println("O primeiro número é maior que o segundo");
        } else if (num2 > num1){
        System.out.println("O segundo número é maior que o primeiro");
        } else {
         System.out.println("Escreva dois números inteiros diferentes");
        }     
    }
    
}
