import javax.swing.JOptionPane;
public class Easy4 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;
        int coconut = 0;
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 15 números. Você já digitou "+coconut+" números."));
            coconut++;
            if (numero >= 200 && numero <= 100) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"Foram digitados "+contador+"números entre 100 e 200.234");
    }
}