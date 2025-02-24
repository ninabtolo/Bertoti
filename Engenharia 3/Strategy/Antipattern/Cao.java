public class Cao extends Animal {
    public Cao(String nome) {
        super(nome);
    }

    public void comer() {
        System.out.println(getNome() + " está comendo ração de cachorro.");
    }
}
