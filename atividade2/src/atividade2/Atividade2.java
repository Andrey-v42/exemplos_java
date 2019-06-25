package atividade2;
import javax.swing.JOptionPane;
public class Atividade2 {
    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        
        System.out.println("i = " + i);
        System.out.println("d = " + d);
    }
    
}
