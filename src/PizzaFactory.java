public class PizzaFactory {
    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;
        if(pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(pizzaType.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if(pizzaType.equals("hawaiian")){
            pizza = new HawaiianPizza();
        }
        else if(pizzaType.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
