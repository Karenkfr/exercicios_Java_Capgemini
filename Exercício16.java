/** Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
 * durante o semestre. Calcular a sua média (aritmética), informar o nome e 
 * sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação 
 * (media entre 5.1 a 6.9);
 */

package exercício.pkg16;

import java.util.Scanner;

public class Exercício16 {

    
    public static void main(String[] args) {
        
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        float media = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
        nota1 = leitor.nextFloat();
        
        System.out.println("Digite a segunda nota");
        nota2 = leitor.nextFloat();
        
        System.out.println("Digite a terceira nota");
        nota3 = leitor.nextFloat();
        
        media = ( (nota1 + nota2 + nota3)/3 );
        
            if (media >=7) {
            System.out.println("Aprovado");
        } else {
            
            if (media<=5) {
            System.out.println("Reprovado");
        } else {
                
            if (media>5 && media<7) {
            System.out.println("Recuperação");
            }
            }
        }
    }
    
}
