public class ArrayDuplo {
    public static void main(String[] args) {

        // Declaração e inicialização dos arrays
        String[] alunos = {"Ana", "Bruno", "Carlos", "Diana"};
        double[] notas = {8.5, 7.0, 9.2, 6.8};

        // Percorrendo os arrays e exibindo os dados
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: "+ alunos[i] + " - Notas: " + notas[i]);
        }
    }
}
