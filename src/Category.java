public class Category {
    private String name;
    private int Spending;

    public Category(String name, int spending) {
        this.name = name;
        Spending = spending;
    }

    public String getName() {
        return name;
    }

    public int getSpending() {
        return Spending;
    }

    public void plusSpending(int plus) {
        Spending += plus;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public void setSpending(int newSpending) {
        Spending = newSpending;
    }
}
