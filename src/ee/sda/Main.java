package ee.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Royal bank of scamming your money Unlmtd");
        Scanner scanner = new Scanner(System.in);

        User user = new User("123",
                "Bob Customer",
                "Tallinn",
                "+372 123 4567",
                "bob@gmail.com",
                "Question",
                "Answer");

        user.addNewAccount("EUR");
        bank.addUser(user);


        while (true) {

            System.out.println("Welcome to " + bank.getBankName() + " !");
            System.out.println("Choose your action:");
            System.out.println("1 - create new user;");
            System.out.println("2 - add money to selected account of your user;");
            System.out.println("3 - withdraw money from users account;");
            System.out.println("4 - check total amount of money of your user");
            System.out.println("5 - print bank details");
            System.out.println("0 - exit");

            int userOption = scanner.nextInt();
            scanner.nextLine();
            switch (userOption) {
                case 1:
                    System.out.println("Create password");
                    String password = scanner.nextLine();
                    System.out.println("Please enter your full name");
                    String fullName = scanner.nextLine();
                    System.out.println("Please enter your address");
                    String address= scanner.nextLine();
                    System.out.println("Please enter your phone number");
                    String phoneNumber= scanner.nextLine();
                    System.out.println("Please enter your email");
                    String email= scanner.nextLine();
                    System.out.println("Please create a secret question");
                    String secretQuestion= scanner.nextLine();
                    System.out.println("Please provide answer to your secret question");
                    String secretAnswer= scanner.nextLine();

                    User user1 = new User(password, fullName, address, phoneNumber, email,secretQuestion, secretAnswer);
                    user.addNewAccount("EUR");
                    bank.addUser(user1);

                    break;
                case 2:
                    System.out.println("Please enter userId");
                    String userId = scanner.next();
                    System.out.println("Add account Id");
                    Long accountId = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Add amount of money");
                    double money = scanner.nextDouble();
                    scanner.nextLine();
                    bank.addMoneyToUser(userId, accountId, money);
                    System.out.println("Total amount of user");
                    System.out.println(bank.totalAmountOfUser(userId));
                    break;
                case 3:
                    System.out.println("Please enter userId");
                    String userIdWithdraw = scanner.next();
                    System.out.println("Add account Id");
                    Long accountIdWithdraw = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Add amount of money");
                    double moneyToRemove = scanner.nextDouble();
                    scanner.nextLine();
                    bank.substractFromUser(userIdWithdraw, accountIdWithdraw, moneyToRemove);
                    System.out.println("Total amount of user");
                    System.out.println(bank.totalAmountOfUser(userIdWithdraw));
                    break;
                case 4:
                    System.out.println("Please enter userId");
                    String idOfUser = scanner.nextLine();
                    System.out.println(bank.totalAmountOfUser(idOfUser));
                    break;
                case 5:
                    System.out.println(bank);
                    break;
                case 0:
                    return;
                default:
                    break;

            }
        }
    }
}