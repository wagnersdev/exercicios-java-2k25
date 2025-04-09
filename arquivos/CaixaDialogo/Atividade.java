package CaixaDialogo;

import javax.swing.JOptionPane;

public class Atividade {
    public static void main(String[] args) {

        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        int idadeInt = Integer.parseInt(idade);
        
        if(idadeInt >= 18){
            JOptionPane.showMessageDialog(null, "Você é maior de idade", "Resultado" , JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Você é menor de idade", "Resultado", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
