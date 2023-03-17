import javax.swing.JOptionPane;

class Pizza {
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

class Hamburguer {
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

    public String getNome() {
        return nome;
    }
}

class Restaurante1 {
    public static void main(String[] args) {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o pedido:\n1. Hamburguer\n2. Pizza\n3. Sair"));
            if (opcao == 1) {
                Hamburguer h = new Hamburguer();
                h.nome = JOptionPane.showInputDialog("Informe o nome do hamburguer:");
                h.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do hamburguer:"));
                h.artesanal = JOptionPane.showConfirmDialog(null, "O hamburguer é artesanal?") == JOptionPane.YES_OPTION;
                double valorPedido = h.calcularValor();
                JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: " + valorPedido);
            } else if (opcao == 2) {
                Pizza p = new Pizza();
                p.nome = JOptionPane.showInputDialog("Informe o nome da pizza:");
                p.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da pizza:"));
                p.possuiBorda = JOptionPane.showConfirmDialog(null, "A pizza possui borda?") == JOptionPane.YES_OPTION;
                double valorPedido = p.calcularValor();
                JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: " + valorPedido);
            }
        } while (opcao != 3);
    }
}
