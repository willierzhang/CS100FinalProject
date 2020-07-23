public class Mushroom extends PizzaDecorator {
    Pizza pizza;
    double price = 1.59;

    public Mushroom(Pizza pizza){
        this.pizza = pizza;
    }

    public String getName(){
        return pizza.getName() + ", Mushroom";
    }

    public double cost(){
        return pizza.cost() + price;
    }
}