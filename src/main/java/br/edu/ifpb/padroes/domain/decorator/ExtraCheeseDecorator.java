package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator extends PizzaDecorator{
	
	public ExtraCheeseDecorator(Pizza pizzaDecorada) {
		super(pizzaDecorada);
	}
	
	public void ExtraCheese() {
		doDiscountCoupon();
		super.getPrice();
	}
	
	private void doDiscountCoupon() {
		Float price = super.getPrice();
		price *= 0.25f;
		String name = super.getName();
		name += " (extra cheese)";
		
	}
}
