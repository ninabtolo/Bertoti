import java.util.List;
import java.util.ArrayList;

public class Blog implements Subject {
    private List<Observer> observers;
    private String latestPost;

    public Blog() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestPost);
        }
    }

    public void publishPost(String post) {
        this.latestPost = post;
        notifyObservers();
    }
}
