public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String post) {
        System.out.println(name + " recebeu uma nova notificação: " + post);
    }
}
