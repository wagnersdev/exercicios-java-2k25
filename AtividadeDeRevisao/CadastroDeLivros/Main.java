package AtividadeDeRevisao.CadastroDeLivros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        while (true){
            System.out.println("===== MENU =====");
            System.out.println("1 - CRIAR NOVO LIVRO");
            System.out.println("2 - EXIBIR LIVROS");
            System.out.println("3 - ALTERAR INFORMAÇÕES DO LIVRO");
            System.out.println("4 - REMOVER LIVRO");
            System.out.println("5 - SAIR DO PROGRAMA");
            System.out.println("ESCOLHA UMA OPÇÃO: ");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.print("Titulo: ");
                    String tituloLivro = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Ano de publicação: ");
                    int anoDePublicacao = sc.nextInt();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    livros.add(new Livro(tituloLivro,autor,anoDePublicacao,preco));
                    break;

                case 2:
                    if (livros.isEmpty()){
                        System.out.println("Lista de livros vazia.");
                    }else {
                        for (Livro livro: livros){
                            livro.exibirDetalhes();
                        }
                    }

                    break;

                case 3:
                    if(livros.isEmpty()){
                        System.out.println("Lista de livros vazia.");
                    }else {
                        sc.nextLine();
                        System.out.println("Informe o titulo livro que deseja alterar: ");
                        String livroAlterado = sc.nextLine();

                        for(int i = 0; i < livros.size(); i++){
                            Livro livro = livros.get(i);
                            if(livro.getTitulo().equalsIgnoreCase(livroAlterado)){

                                System.out.println("Novo titulo: ");
                                String novoTitulo = sc.nextLine();
                                livro.setTitulo(novoTitulo);

                                System.out.println("Novo autor: ");
                                String novoAutor = sc.nextLine();
                                livro.setAutor(novoAutor);

                                System.out.println("Novo ano de publicacao: ");
                                int novoAnoPublicacao = sc.nextInt();
                                livro.setAnoPublicacao(novoAnoPublicacao);

                                System.out.println("Novo preço: ");
                                double novoPreco = sc.nextDouble();
                                livro.setPreco(novoPreco);

                                System.out.println("Livro alterado com sucesso.");
                            }else{
                                System.out.println("Livro não encontrado.");
                            }
                        }
                    }
                        break;

                case 4:

                    if(livros.isEmpty()){
                        System.out.println("Lista de livros vazia.");
                    }else {
                        sc.nextLine();
                        System.out.println("Informe o nome do livro que deseja excluir: ");
                        String livroExcluido = sc.nextLine();

                        for (int i = 0; i < livros.size(); i++) {
                            Livro livro = livros.get(i);
                            if (livro.getTitulo().equalsIgnoreCase(livroExcluido)) {
                                livros.remove(i);
                                System.out.println("Livro excluído!");
                            }else{
                                System.out.println("Livro nao encontrado!!");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    sc.close();
                    return;
                default:
                    System.out.println("opcao invalida");
            }

        }
    }

}
