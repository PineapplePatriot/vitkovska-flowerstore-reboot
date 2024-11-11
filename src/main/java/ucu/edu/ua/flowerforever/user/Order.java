package ucu.edu.ua.flowerforever.user;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers(String status) {
        for (User user : users) {
            user.update(status);
        }
    }

    public void order() {
        notifyUsers("Order has been placed");
    }
}
