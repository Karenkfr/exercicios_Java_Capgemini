package ListaEncadeada;
//Lista encadeada/ Linkedlist

//Em um vetor os elementos estão um do lado do outro, enquanto em uma lista ligada eles estão em lugares diferentes
//porém um aponta para o outro, indicando o próximo elemento
//[2][4][1][3][5]

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Paola Letícia");

        lista.adiciona("Lilica Lopes");
        System.out.println(lista);

        lista.adicionaNoComeco("Frida Ferraz Lopes");
        System.out.println(lista);

        lista.adiciona(1,"Snoop Ferraz Lopes");
        System.out.println(lista);

        Object ret = lista.pega(1);
        System.out.println(ret);

        System.out.println(lista.tamanho());

    }
}
