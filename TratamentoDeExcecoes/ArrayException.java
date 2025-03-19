package TratamentoDeExcecoes;

public class ArrayException {
    public static void main(String[] args) {
        int[]Array={10, 20, 30, 40};
        int indice = 5;

        try {
            System.out.println("Elemento do indice: " + indice+":"+Array[indice]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Elemento não pertence ao indice");
        }finally {
            System.out.println("Finalizando...");
        }
    }
}
