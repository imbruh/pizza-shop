package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaDecorator implements Pizza{
	private Pizza pizza;
	private Float price;
	private String name;
	
	PizzaDecorator(Pizza pizza) {
	        this.pizza = pizza;
	    }

	    @Override
	    public Float getPrice() {
	       return this.price;
	    }

	    @Override
	    public String getName() {
	        return this.name;
	    }
	    
}
