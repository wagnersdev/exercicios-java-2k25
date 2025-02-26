import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         ArrayList<Pessoa> list = new ArrayList<>();
        int op = 0;

        while (op!=4) {
            System.out.println("menu");
            System.out.println("1-Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3-Remover");
            System.out.println("4-Sair");
            System.out.println("Escolha a opçao");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome=sc.next();
                    System.out.println("Digite o telefone: ");
                    String telefone=sc.next();
                    list.add(new Pessoa(nome, telefone));
                    
                    break;
                case 2:
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        for(Pessoa p:list){
                            System.out.println("Nome: " + p.getNome() + " Telefone: " + p.getTelefone());

                        }
                    }
                case 3:
                    sc.next();
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        System.out.println("Digite o seu indice a ser removido: ");
                        int indice = sc.nextInt();
                        if(indice>=0 && indice < list.size()){
                            list.remove(indice);
                            System.out.println("Contato removido com sucesso!");
                        }
                    }
                case 4:
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }

        sc.close(); 
    }
}
