package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator extends PizzaDecorator{
	
	private Float increase = 1.10f;
	private String increaseName = " (extra cheese)";
	
	public ExtraCheeseDecorator(Pizza pizzaDecorada) {
		super(pizzaDecorada);
	}
	
	public void doExtraCheese(Float price, String name) {
		setIncrease(price, name);
	}
	
	public Float getPrice() {
		return increase;			
	}
	
	public String getName() {
		return increaseName;			
	}
	
	public void setIncrease(Float price, String name) {
		increase *= price;
		
		name += increaseName;
	}
}
