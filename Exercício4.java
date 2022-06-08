
package exercício.pkg4;

import java.util.Scanner;

public class Exercício4 {

   
    public static void main(String[] args) {
    
        String nomeVendedor;
        float salarioFixoVendedor =0.0f;
        float totalVendas =0.0f;
        float salarioTotal =0.0f;
        float comissao = 0.0f;
        
     Scanner leitor = new Scanner(System.in);
     
        System.out.println("Digite o nome do vendedor");
        nomeVendedor = leitor.next();
        
        System.out.println("Digite o salário fixo do vendedor");
        salarioFixoVendedor = leitor.nextFloat();
        
        System.out.println("Digite o total de vendas do vendedor");
        totalVendas = leitor.nextFloat();
        
        comissao = (float) (totalVendas * 0.15);
        salarioTotal = salarioFixoVendedor + comissao;
        
        System.out.println(nomeVendedor + "receberá : " + salarioTotal);
        
        
    }
    
}
