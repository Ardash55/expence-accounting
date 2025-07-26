package org.example;

public class Account {
    private int amount;
    private String name;

    public Account(String name, int amount) {
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

    public void setAmount(int newAmount) {
        amount = newAmount;
    }

    public void plusSum(int plus) {
        amount += plus;
    }

    public void minusSum(int minus) {
        amount -= minus;
    }
}
