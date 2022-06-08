/** Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
 * A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit
 * e C a temperatura em Celsius; 
 */
package exercício.pkg7;

import java.util.Scanner;

public class Exercício7 {

    
    public static void main(String[] args) {
        
        float temperaturaCelsius=0;
        float temperaturaFahrenheit=0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em ºC");
        temperaturaCelsius = leitor.nextFloat();
        
        temperaturaFahrenheit = ( (9 * temperaturaCelsius+160)/5);
        
        System.out.println("A temperatura em ºF é: " +  temperaturaFahrenheit);
        
        
        
        
        
    }
    
}
