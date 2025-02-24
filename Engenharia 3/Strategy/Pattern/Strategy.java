public class Strategy {
    public static void main(String[] args) {
        Animal aguia = new Animal("Águia", new Voo());
        Animal peixe = new Animal("Peixe", new Nado());
        Animal cachorro = new Animal("Cachorro", new Comida());

        aguia.mover();
        peixe.mover();
        cachorro.mover();

        cachorro.setMovimentacao(new Voo());
        cachorro.mover();
    }
}
