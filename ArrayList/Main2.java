import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    static class Produto {
        String nome;
        int estoqueAtual;

        Produto(String nome, int estoqueAtual) {
            this.nome = nome;
            this.estoqueAtual = estoqueAtual;
        }
    }

    static class Venda {
        String produtoNome;
        int quantidade;

        Venda(String produtoNome, int quantidade) {
            this.produtoNome = produtoNome;
            this.quantidade = quantidade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        List<Produto> produtos = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistema de Estoque ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Registrar venda");
            System.out.println("3 - Ver tabelas (VMD, Estoque Mín., Estoque Máx., Decisão)");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Estoque atual (>= 0): ");
                int estoqueAtual = sc.nextInt();
                sc.nextLine();
                if (estoqueAtual < 0) {
                    System.out.println("Estoque atual deve ser >= 0.");
                    continue;
                }

                Produto p = buscarProduto(produtos, nome);
                if (p == null) {
                    produtos.add(new Produto(nome, estoqueAtual));
                    System.out.println("Produto adicionado!");
                } else {
                    p.estoqueAtual = estoqueAtual;
                    System.out.println("Produto já existia. Estoque atualizado!");
                }

            } else if (opcao == 2) {
                if (produtos.isEmpty()) {
                    System.out.println("Cadastre produtos antes de registrar vendas.");
                    continue;
                }

                System.out.print("Nome do produto (igual ao cadastrado): ");
                String produtoNome = sc.nextLine();

                Produto p = buscarProduto(produtos, produtoNome);
                if (p == null) {
                    System.out.println("Produto não encontrado.");
                    continue;
                }

                System.out.print("Quantidade comprada: ");
                int qtd = sc.nextInt();
                sc.nextLine();
                if (qtd <= 0) {
                    System.out.println("Quantidade deve ser > 0.");
                    continue;
                }

                vendas.add(new Venda(produtoNome, qtd));
                System.out.println("Venda registrada!");

            } else if (opcao == 3) {
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                    continue;
                }

                int distintos = produtos.size();

                System.out.println("\n--- Tabela 1: VMD (Venda Média Diária) ---");
                double[] vmds = new double[produtos.size()];
                int[] temposReposicao = new int[produtos.size()];
                double[] estoquesMin = new double[produtos.size()];
                double[] maxCompras = new double[produtos.size()];
                double[] estoquesMax = new double[produtos.size()];

                for (int i = 0; i < produtos.size(); i++) {
                    Produto p = produtos.get(i);
                    int somaVendas = somaVendasDoProduto(vendas, p.nome);
                    double vmd = distintos > 0 ? (somaVendas * 1.0) / distintos / 25.0 : 0.0;
                    vmds[i] = vmd;
                    System.out.println("Produto: " + p.nome + " | VMD: " + String.format("%.2f", vmd));
                }

                System.out.println("\n--- Tabela 2: Estoque Mínimo ---");
                for (int i = 0; i < produtos.size(); i++) {
                    int tempo = 1 + rnd.nextInt(7);
                    temposReposicao[i] = tempo;
                    double estoqueMin = temposReposicao[i] * vmds[i];
                    estoquesMin[i] = estoqueMin;
                    System.out.println("Produto: " + produtos.get(i).nome +
                            " | Tempo rep.: " + temposReposicao[i] + "d" +
                            " | Estoque Mín.: " + String.format("%.2f", estoqueMin));
                }

                System.out.println("\n--- Tabela 3: Estoque Máximo ---");
                for (int i = 0; i < produtos.size(); i++) {
                    Produto p = produtos.get(i);
                    int maxCompra = maiorCompraUnica(vendas, p.nome);
                    maxCompras[i] = maxCompra;
                    double estoqueMax = maxCompra * estoquesMin[i];
                    estoquesMax[i] = estoqueMax;
                    System.out.println("Produto: " + p.nome +
                            " | Maior compra (1 venda): " + (int) maxCompras[i] +
                            " | Estoque Máx.: " + String.format("%.2f", estoqueMax));
                }

                System.out.println("\n--- Tabela 4: Tomada de Decisão ---");
                for (int i = 0; i < produtos.size(); i++) {
                    Produto p = produtos.get(i);
                    String decisao = (estoquesMin[i] > p.estoqueAtual) ? "COMPRAR" : "NÃO COMPRAR";
                    System.out.println("Produto: " + p.nome +
                            " | Estoque atual: " + p.estoqueAtual +
                            " | Estoque mín.: " + String.format("%.2f", estoquesMin[i]) +
                            " | Decisão: " + decisao);
                }

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }

    static Produto buscarProduto(List<Produto> produtos, String nome) {
        for (Produto p : produtos) {
            if (p.nome.equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    static int somaVendasDoProduto(List<Venda> vendas, String nomeProduto) {
        int soma = 0;
        for (Venda v : vendas) {
            if (v.produtoNome.equalsIgnoreCase(nomeProduto)) {
                soma += v.quantidade;
            }
        }
        return soma;
    }

    static int maiorCompraUnica(List<Venda> vendas, String nomeProduto) {
        int max = 0;
        for (Venda v : vendas) {
            if (v.produtoNome.equalsIgnoreCase(nomeProduto)) {
                if (v.quantidade > max) {
                    max = v.quantidade;
                }
            }
        }
        return max;
    }
}