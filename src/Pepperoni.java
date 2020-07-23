public class Pepperoni extends PizzaDecorator {
    Pizza pizza;
    double price = 3.59;

    public Pepperoni(Pizza pizza){
        this.pizza = pizza;
    }

    public String getName(){
        return pizza.getName() + ", Pepperoni";
    }

    public double cost(){
        return pizza.cost() + price;
    }
}