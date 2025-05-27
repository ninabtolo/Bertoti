import java.util.ArrayList;
import java.util.List;

interface ComponenteProduto {
    void aplicarPromocao(double desconto);
}

class Produto implements ComponenteProduto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void aplicarPromocao(double desconto) {
        preco *= (1 - desconto);
        System.out.println(nome + "agora custa RS" + preco);
    }
}

class CategoriaProduto implements ComponenteProduto {
    private List<ComponenteProduto> produtos = new ArrayList<>();

    public void adicionar (ComponenteProduto produto) {
        produtos.add(produto);
    }

    @Override
    public void aplicarPromocao(double desconto) {
        for (ComponenteProduto produto : produtos) {
            produto.aplicarPromocao(desconto);
        }
    }
}