public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        blog.registerObserver(user1);
        blog.registerObserver(user2);

        blog.publishPost("Novo post sobre Design Patterns!");
        blog.publishPost("Outro post sobre Java!");

        blog.removeObserver(user2);

        blog.publishPost("Mais um post sobre Programação Orientada a Objetos!");
    }
}
