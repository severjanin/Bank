package ee.sda;

import java.util.List;

public class Bank {

    List<User> users;
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addUser(String password, String fullName, String address, String phoneNumber, String email, String secretQuestion, String secretAnswer) {
        User newUser = new User(password, fullName, address, phoneNumber, email, secretQuestion, secretAnswer);
        users.add(newUser);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Double totalAmountOfUser(String userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user.totalAmountOfMoney();
            }
        }
        return null;
    }

    public void addMoneyToUser(String userId, long accountId, double amountOfMoney) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                user.addMoney(accountId, amountOfMoney);
            }
        }
    }

    public void removeMoneyFromUser(String userId, long accountId, double amountOfMoney) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                user.removeMoney(accountId, amountOfMoney);
            }
        }
    }

}
