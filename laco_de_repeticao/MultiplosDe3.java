package laco_de_repeticao;

public class MultiplosDe3 {
    public static void main(String[] args) {

        int cont = 0;
        for(int i=1;i<=100;i++){
            if(i % 3 == 0){
                cont++;    
            }
        }
        System.out.println(cont);
    }
       
}
