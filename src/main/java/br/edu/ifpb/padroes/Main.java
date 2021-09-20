package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.domain.decorator.DiscountDecorator;
import br.edu.ifpb.padroes.domain.decorator.ExtraCheeseDecorator;
import br.edu.ifpb.padroes.domain.decorator.PizzaSimples;
import br.edu.ifpb.padroes.service.PizzaShopService;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");
        
        for(Pizza pizza: pizzaShopService.getPizzas()) {
        	System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
        }

        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

        Pizza pizzaDecorada = new DiscountDecorator(new PizzaSimples(pizza.getName(), pizza.getPrice()));
//        pizzaDecorada = new ExtraCheeseDecorator(new PizzaSimples(pizza.getName(), pizza.getPrice()));
        
        pizzaDecorada.getPrice();
        pizzaDecorada.getName();
        // TODO - implementar padrão decorator para só precisar passar o objeto pizza
        pizzaShopService.orderPizza(pizza, true, true, false, true);

    }



}
