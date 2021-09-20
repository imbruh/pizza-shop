package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountDecorator extends PizzaDecorator{
	
	public DiscountDecorator(Pizza pizzaDecorada) {
		super(pizzaDecorada);
	}
	
	public void discountCoupon() {
		doDiscountCoupon();
	}
	
	private Float doDiscountCoupon() {
		Float price = super.getPrice();
		price *= 0.25f;
		return price;
	}
}
