public class Teste {
    public static void main(String[] args) {
        Cao cao = new Cao("Rex");
        cao.fazerSom();
        cao.comer();

        Aguia aguia = new Aguia("Águia Real");
        aguia.fazerSom();
        aguia.voar();

        Gato gato = new Gato("Mimi");
        gato.fazerSom();
        gato.comer();

        Papagaio papagaio = new Papagaio("Loro");
        papagaio.fazerSom();
        papagaio.voar();
    }
}
