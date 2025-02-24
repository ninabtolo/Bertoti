public class Animal {
    private String nome;
    private Movimentacao movimentacao;

    public Animal(String nome, Movimentacao movimentacao) {
        this.nome = nome;
        this.movimentacao = movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

    public void mover() {
        System.out.print(nome + " está ");
        movimentacao.mover();
    }
}
