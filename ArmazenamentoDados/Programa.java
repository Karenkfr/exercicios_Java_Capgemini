package ArmazenamentoDados;

public class Programa {
    public static void main(String[] args) {
        Aluno A1 = new Aluno("Angelina");
        Aluno A2 = new Aluno("Felix");

        Vetor lista = new Vetor();

        lista.adiciona(A1);
        lista.adiciona(A2);

        System.out.println(lista);
        System.out.println("total de alunos: " + lista.tamanho());
        System.out.println(lista.contemAluno(A1));

        try{
            System.out.println(lista.pega(101));
         }catch (IllegalArgumentException e) {
            System.out.println("O aluno da posição 101 Não existe");
        }

        Aluno A3 = new Aluno("Maria");
        lista.adiciona(1,A3);
        System.out.println(lista);
    }


}
