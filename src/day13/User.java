package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User>subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    // список поллписок.
    public List<User> getSubscriptions() {
        return subscriptions;
    }
    // подписаться.
    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User currentUser: subscriptions) {
           if (currentUser.getUsername().equals(user.getUsername()));
           return true;
        }
        return false;
    }
    // проверка друзья ли.
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user,text);
    }
    public String toString() {
        return username;
    }
}
