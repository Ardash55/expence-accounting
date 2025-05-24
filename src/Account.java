public class Account {
    private int amount;
    private String name;

    public Account(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void plusSum(int plus) {
        amount += plus;
    }

    public void minusSum(int minus) {
        amount -= minus;
    }
}
