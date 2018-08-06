package ee.sda;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private String id;
    private String password;
    private String fullName;
    private String address;
    private List<Account> accounts;
    private String phoneNumber;
    private String email;
    private String secretQuestion;
    private String secretAnswer;

    public User(
            String password,
            String fullName,
            String address,
            String phoneNumber,
            String email,
            String secretQuestion,
            String secretAnswer) {

        this.id = UUID.randomUUID().toString();
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.accounts = new ArrayList<>();
    }

    public void addMoney(long accountId, double amountOfMoney) {
        for (Account account : accounts) {
            if (account.getNumber() == accountId) {
                account.addMoney(amountOfMoney);
            }
        }
    }

    public void removeMoney(long accountId, double amountOfMoney) {
        for (Account account : accounts) {
            if (account.getNumber() == accountId) {
                account.removeMoney(amountOfMoney);
            }
        }
    }

    public double totalAmountOfMoney() {
        double sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return sum;
//
//        double sumWithIndex = 0;
//        for (int i = 0; i < accounts.size(); i++) {
//            sumWithIndex += accounts.get(i).getBalance();
//        }
//        return sumWithIndex;
    }

    public void addNewAccount(String currency) {
        Account newAccount = new Account(currency);
        accounts.add(newAccount);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", secretQuestion='" + secretQuestion + '\'' +
                ", secretAnswer='" + secretAnswer + '\'' +
                '}';
    }


}
