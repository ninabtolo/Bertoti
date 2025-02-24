public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void comer() {
        System.out.println(getNome() + " está comendo ração de gato.");
    }
}
