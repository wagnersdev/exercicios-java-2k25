package AtividadeDeRevisao.SistemaDeAnimais;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();

        animais.add(new Cachorro().fazerSom());
        animais.add(new Gato().fazerSom());
        animais.add(new Vaca().fazerSom());

        for(String a: animais){
            System.out.println(a);
        }

    }
}
