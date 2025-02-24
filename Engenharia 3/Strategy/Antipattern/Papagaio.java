public class Papagaio extends Animal {
    public Papagaio(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.println(getNome() + " está voando baixo.");
    }
}
