package ExerciciosLogica;

import java.io.IOException;
import java.util.Scanner;

public class PositivosEMedia {


    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double numeros[] = new double[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitor.nextDouble();
            if (numeros[i] > 0) {
                cont++;
                media += numeros[i];
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

        }







}

