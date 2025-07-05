import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<Category> categories = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Category food = new Category("Еда", 200);
        Category travel = new Category("Путешествия", 300);
        categories.add(food);
        categories.add(travel);
        Account cash = new Account("Наличные", 500);
        accounts.add(cash);

        while (true) {
            System.out.println("1. Добавить  категорию трат");
            System.out.println("2. Добавить счет");
            System.out.println("3. Добавить трату");
            System.out.println("4. Показать категории");
            System.out.println("5. Показаать счета");
            System.out.println("6. Изменить категории трат");
            System.out.println("0. Выход");
            int choice = sc.nextInt();

            if (choice > 0 && choice <= 6) {
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
                    case 6:
                        changeCategory();
                        break;
                }
            } else if (choice == 0) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Вы не выбрали функцию");
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
        System.out.println("0. Назад");
        int categoryNumber = sc.nextInt();
        if (categoryNumber > 0) {
            Category category = categories.get(categoryNumber - 1);
            System.out.println("Выберите счет для трат");
            showAccounts();
            System.out.println("0. Назад");
            int accountNumber = sc.nextInt();
            if (accountNumber > 0) {
                Account account = accounts.get(accountNumber - 1);
                System. out.println("Введите сумму трат");
                int sum = sc.nextInt();
                account.minusSum(sum);
                category.plusSpending(sum);
                System.out.println(account.getName() + ": " + account.getAmount());
                System.out.println(category.getName() + ": " + category.getSpending());
            } else {}
        } else {}
    }

    public static void showCategories() {
        int id = 1;
        System.out.println("Ваши категории трат:");
        for (Category category : categories) {
            System.out.println(id + ". " + category.getName() + ": " + category.getSpending());
            id++;
        }
//        changeCategory();
    }

    public static void showAccounts() {
        int id = 1;
        System.out.println("Ваши счета:");
        for (Account account : accounts) {
            System.out.println(id + ". " + account.getName() + ": " + account.getAmount());
            id++;
        }
    }

    public static void changeCategory() {
        System.out.println("Выберите кааатегорию для трат");
        showCategories();
        int categoryNumber = sc.nextInt();
        sc.nextLine();
        Category category = categories.get(categoryNumber - 1);
        System.out.println("Введите новое название");
        String newName = sc.nextLine();
        category.setName(newName);
        System.out.println("Введите сумму на счету");
        int spending = sc.nextInt();
        sc.nextLine();
        category.setSpending(spending);
        System.out.println(category.getName() + ": " + category.getSpending());
    }
}