package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
	
	private PizzaHotService pizzaHotService;
	private List<PizzaHotPizza> cache = new ArrayList<>();
	
	public PizzaHotServiceProxy() {
        this.pizzaHotService = new PizzaHotServiceImpl();
    }
	
    @Override
    public List<PizzaHotPizza> getPizzas() {
    	
    	List<PizzaHotPizza> pizzas = new ArrayList<>();
    	if(cache.isEmpty()) {
    		pizzas = this.pizzaHotService.getPizzas();
	    	for(PizzaHotPizza pizza: pizzas) {
	    		cache.add(pizza);    	
	    	}	
    	}
    	
    	return cache;
    	
    }
    
    public void reset() {
    	cache.clear();
    }
}
