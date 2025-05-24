public class Main {
    public static void main(String[] args) {
        Account cash = new Account(200, "Наличные");
        Category food = new Category("Еда", 200);
    }

    public static void minusMoney(int sum, Account account, Category category) {
        account.minusSum(sum);
        category.plusSpending(sum);
    }
}