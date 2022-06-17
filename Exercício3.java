/*Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos;*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int n1;
        int n2;
        
        
        Scanner leitor = new Scanner(System.in, "UTF-8");
        
        System.out.println("Digite um numero");
        n1 = leitor.nextInt();
        
        System.out.println("Digite outro numero");
        n2 = leitor.nextInt();
        
        System.out.println("A soma dos dois números é: "+ (n1 + n2));
        System.out.println("A subtração dos dois números é :" + (n1-n2) );
        System.out.println("A divisão entre os dois números é: "+ (n1 / n2));
        System.out.println("A soma multiplicação dois números é: "+ (n1 * n2));   
    }
    
}
