package AtividadeDeRevisao.CadastroDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;


    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }


    public void exibirDetalhes(){
        System.out.println("\nTitulo: " + titulo + "\nAutor: " + autor +
                "\nAno de publicação: " + anoPublicacao + "\nPreço: " + preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                "\nTitulo = " + titulo +
                "\nAutor = " + autor +
                "\nAno de Publicação = " + anoPublicacao +
                "\nPreço = " + preco;
    }
}
