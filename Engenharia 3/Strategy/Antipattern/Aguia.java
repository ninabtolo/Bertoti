public class Aguia extends Animal {
    public Aguia(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.println(getNome() + " está voando alto.");
    }
}
