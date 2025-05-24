public class Main {
    public static void main(String[] args) {
        Account cash = new Account(200, "Наличные");
        Category food = new Category("Еда", 200);
        System.out.println(cash.getAmount());
        System.out.println(cash.getName());
        System.out.println(food.getName());
        System.out.println(food.getSpending());
    }
}