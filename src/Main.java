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

            }
            break;
        }
        Category food = new Category("Еда", 200);
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
         Account account = new Account(sum, name);
         accounts.add(account);
         System.out.println("Счет добавлен");
    }

//    public static void minusMoney(int sum, Account account, Category category) {
//        account.minusSum(sum);
//        category.plusSpending(sum);
//    }
}