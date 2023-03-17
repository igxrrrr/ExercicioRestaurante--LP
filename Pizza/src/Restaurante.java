import javax.swing.*;

class Pizza1 {
    public String nome;
    public double valor;
    public boolean possuiBorda;

    public Double calcularValor() {
        if (possuiBorda) {
            return valor + 5.0;
        } else {
            return valor;
        }
    }

    public String getNome() {
        return nome;
    }
}

class Hamburguer1 {
    String nome;
    double valor;
    boolean artesanal;

    public double calcularValor() {
        if (artesanal) {
            return valor + 8.0;
        } else {
            return valor;
        }
    }

    public String getNome()
    {
        return nome;
    }
}

class Restaurante2 {
    public static void main(String[] args) {
        int caixa;
        do {
            new ImageIcon("smile.png");
            caixa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o pedido: obs: Responda em ('1','2' ou '3')\n1. Hamburguer\n2. Pizza\n3. Sair"));
            if (caixa == 1) {
                Hamburguer h = new Hamburguer();
                h.nome = JOptionPane.showInputDialog("Diga o nome do hamburguer:");
                h.valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do hamburguer:"));
                h.artesanal = JOptionPane.showConfirmDialog(null, "O hamburguer é feito artesanal?") == JOptionPane.YES_OPTION;
                double valorPedido = h.calcularValor();
                JOptionPane.showMessageDialog(null, "O valor total do Hamburguer " +h.nome +" é: R$" + valorPedido);
            } else if (caixa == 2) {
                Pizza p = new Pizza();
                p.nome = JOptionPane.showInputDialog("Diga o nome da pizza:");
                p.valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da pizza:"));
                p.possuiBorda = JOptionPane.showConfirmDialog(null, "A pizza tem borda?") == JOptionPane.YES_OPTION;
                double valorPedido = p.calcularValor();
                JOptionPane.showMessageDialog(null, "O valor total do pedido é: R$" + valorPedido);
            }
        } while (caixa != 3);
    }
