public class main {
    public static void main(String args[]){
        PizzaStore store = new PizzaStore(new PizzaFactory());
        Pizza pizza = store.orderPizza("cheese");
        sop("Ordered " + pizza.getName());

        pizza = new Ham(pizza);
        sop("Added Ham");

        pizza = new Mushroom(pizza);
        sop("Added mushroom");

        pizza = new Pepperoni(pizza);
        sop("Added pepperoni");

        sop("Build Your Own pizza: " + pizza.getName());

        System.out.println("Total cost: " + pizza.cost());
    }

    static void sop(String str){
        System.out.println(str);
    }
}
