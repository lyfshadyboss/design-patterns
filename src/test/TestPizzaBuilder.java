package test;

import creational.builder.HawaiianPizzaBuilder;
import creational.builder.Pizza;
import creational.builder.PizzaBuilder;
import creational.builder.SpicyPizzaBuilder;
import creational.builder.Waiter;

public class TestPizzaBuilder {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		Pizza pizza;

		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();
		pizza = waiter.getPizza();
		pizza.dump();

		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();
		pizza = waiter.getPizza();
		pizza.dump();
	}
}
