import java.util.ArrayList;
import java.util.List;

public class UserNameSubject implements Subject{

    private  String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        updateAll();
    }

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void updateAll() {
        for (Observer o : observers
             ) {
            o.update(this.username);
        }
    }
}
