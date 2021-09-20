package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {
	
	private DamenosService damenosService;
	private List<DamenosPizza> cache = new ArrayList<>();
	
	public DamenosServiceProxy() {
        this.damenosService = new DamenosServiceImpl();
    }
	
    @Override
    public List<DamenosPizza> getPizzas() {
    	
    	List<DamenosPizza> pizzas = new ArrayList<>();
    	if(cache.isEmpty()) {
    		pizzas = this.damenosService.getPizzas();
	    	for(DamenosPizza pizza: pizzas) {
	    		cache.add(pizza);    	
	    	}	
    	}
    	
    	return cache;
    }
}
