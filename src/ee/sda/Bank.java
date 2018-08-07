package ee.sda;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<User> users;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.users = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
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
                return;
            }
        }
    }

    public void substractFromUser(String userId, long accountId, double amountOfMoney) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                user.substractMoney(accountId, amountOfMoney);
            }
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "users=" + users +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
