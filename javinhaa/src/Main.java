import javax.swing.*;
import javax.swing.JOptionPane.*;
public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo (M/F): ");

        double pesoid = 0;
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso (kg): "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura (m): "));

        if (sexo=="M") {
            peso = (72.7 * altura) - 58;
            System.out.println(nome+", seu peso ideal é igual a, aproximadamente, "+peso+".");
        } else peso = (62.1 * altura) - 44.7;
        {
            System.out.println(nome+", o seu peso ideal é igual a, aproximadamente, "+peso);
        }
    }
}

