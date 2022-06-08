
package exercício20;

import java.util.Scanner;

public class Exercício20 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
   
        int anoFabricacao = 0;
        float valorCarro = 0.00f;
        float porcentagemDesconto = 0.00f;
        float valorDesconto = 0.00f;
        
     boolean desejaRepetir = true; 
     
     while (desejaRepetir == true) {
      
             System.out.println("Digite o ano  do carro");
             anoFabricacao = leitor.nextInt();
             
             System.out.println("Digite o valor  do carro");
             valorCarro = leitor.nextFloat();
             
             if (anoFabricacao <= 2000) {
                 porcentagemDesconto = 0.012f;
             
             
             } else {
             
             porcentagemDesconto = 0.007f;
             
             }
     
             valorDesconto = (valorCarro * porcentagemDesconto);
             
             System.out.println("Deseja cadastrar mais carros?");
             
     
     
                 } 
     
             
            
            
        
        
    }
    
}
