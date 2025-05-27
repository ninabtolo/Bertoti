import java.util.ArrayList;
import java.util.List;

class Loja {
    private List<Observador> clientes = new ArrayList<>();
    private CategoriaProduto estoque = new CategoriaProduto();

    public void adicionarCliente(Observador cliente) {
        clientes.add(cliente);
    }

    public void adicionarProduto(ComponenteProduto produto) {
        estoque.adicionar(produto);
    }

    public void lancarPromocao(double desconto) {
        estoque.aplicarPromocao(desconto);
        String mensagem = "Promoção de " + (desconto * 100) + "%!";
        for (Observador cliente : clientes) {
            cliente.atualizar(mensagem);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarCliente(new Cliente("João", new EmailNotificacao()));
        loja.adicionarCliente(new Cliente("Maria", new SMSNotificacao()));

        Produto celular = new Produto("iPhone", 5000);
        Produto fones = new Produto("AirPods", 1000);
        loja.adicionarProduto(celular);
        loja.adicionarProduto(fones);

        loja.lancarPromocao(0.1);
    }
}
