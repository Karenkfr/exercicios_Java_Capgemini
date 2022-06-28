/*
 Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        String nome;
        int sexo;
        int idade;
        int saude;
        
        Scanner leitor = new Scanner(System.in);
        
        for (;;) {
            
            System.out.println("Digite o nome da pessoa");
            nome = leitor.next();
            
            System.out.println("Digite o sexo da pessoa 1 = Mulher e 2 = Homem");
            sexo = leitor.nextInt();
            
            System.out.println("Digite a idade da pessoa");
            idade = leitor.nextInt();
            
            System.out.println("Digite a saúde da pessoa: 1= Boa e 2 = ruim");
            saude = leitor.nextInt();
            
            if (idade >= 18 && saude == 1 && sexo == 2){
                System.out.println("Apto para o serviço militar");
            } else {
                System.out.println("Não apto para o serviço militar");
            }
            
        }
            
        }
    
}
