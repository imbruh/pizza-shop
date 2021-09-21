package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountDecorator extends PizzaDecorator{
	
	private Float discount = 0.25f;
	
	public DiscountDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void discountCoupon(Float price) {
		doDiscountCoupon(price);
	}
	
	private void doDiscountCoupon(Float price) {
		setDiscount(price);
	}
	
	public Float getPrice() {
		return discount;			
	}
	
	public void setDiscount(Float price) {
		discount *= price;
		
		discount -= price;
		
		discount *= -1;
	}
}
