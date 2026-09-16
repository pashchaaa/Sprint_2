package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public abstract double getDiscount();

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

}
