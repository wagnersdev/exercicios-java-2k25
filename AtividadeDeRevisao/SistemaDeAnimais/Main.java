package AtividadeDeRevisao.SistemaDeAnimais;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] animais = {new Cachorro().fazerSom(), new Gato().fazerSom(), new Vaca().fazerSom()};
        System.out.println(Arrays.toString(animais));

    }
}
