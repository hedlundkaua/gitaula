package Entities;

public class Person {
    private String name;
    private Double money;
    private Double amount;
    public Person(){
    }

    public Person(String name, Double money, Double amount) {
        this.name = name;
        this.money = money;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
