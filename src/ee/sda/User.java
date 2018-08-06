package ee.sda;

import java.util.UUID;

public class User {

    private String id;
    private String password;
    private String fullName;
    private String address;
    private long accountNumber;
    private String phoneNumber;
    private String email;
    private String secretQuestion;
    private String secretAnswer;

    public User(String id,
                String password,
                String fullName,
                String address, long accountNumber,
                String phoneNumber,
                String email,
                String secretQuestion,
                String secretAnswer) {

        this.id = UUID.randomUUID().toString();
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
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

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
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
                ", accountNumber=" + accountNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", secretQuestion='" + secretQuestion + '\'' +
                ", secretAnswer='" + secretAnswer + '\'' +
                '}';
    }



}
