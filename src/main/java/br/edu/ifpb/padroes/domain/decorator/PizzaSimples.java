package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaSimples implements Pizza{
	private String name;
	private Float price;
	
    public PizzaSimples(String name, Float price) {
        this.name = name;
        this.price = price;
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
