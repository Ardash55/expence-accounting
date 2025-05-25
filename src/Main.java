import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<Category> categories = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Добавить  категорию трат");
            System.out.println("2. Добавить счет");
            System.out.println("3. Добавить трату");
            System.out.println("4. Показать категории");
            System.out.println("5. Показаать счета");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    addAccount();
                    break;
                case 3:
                    minusMoney();
                    break;
                case 4:
                    showCategories();
                    break;
                case 5:
                    showAccounts();
                    break;
            }
        }
    }

    public static void addCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название категории");
        String name = sc.nextLine();
        System.out.println("Введите количество трат на категории");
        int spending = sc.nextInt();
        Category category = new Category(name, spending);
        categories.add(category);
        System.out.println("Категория добавлена");
    }

    public static void addAccount() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Ввдите название счета");
         String name = sc.nextLine();
         System.out.println("Введите сумму на счету");
         int sum = sc.nextInt();
         Account account = new Account(name, sum);
         accounts.add(account);
         System.out.println("Счет добавлен");
    }

    public static void minusMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите категорию трат:");
        showCategories();
        int categoryNumber = sc.nextInt();
        Category category = categories.get(categoryNumber - 1);
        System.out.println("Выберите счет для трат");
        showAccounts();
        int accountNumber = sc.nextInt();
        Account account = accounts.get(accountNumber - 1);
        System. out.println("Введите сумму трат");
        int sum = sc.nextInt();
        account.minusSum(sum);
        category.plusSpending(sum);
        System.out.println(account.getName() + ": " + account.getAmount());
        System.out.println(category.getName() + ": " + category.getSpending());
    }

    public static void showCategories() {
        int id = 1;
        System.out.println("Ваши категории трат:");
        for (Category category : categories) {
            System.out.println(id + ". " + category.getName() + ": " + category.getSpending());
            id++;
        }
        System.out.println("");
    }

    public static void showAccounts() {
        int id = 1;
        System.out.println("Ваши счета:");
        for (Account account : accounts) {
            System.out.println(id + ". " + account.getName() + ": " + account.getAmount());
            id++;
        }
        System.out.println("");
    }
}