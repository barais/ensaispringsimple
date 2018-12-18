package fr.ensai.gl.tpspringsimple.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.ensai.gl.tpspringsimple.itf.IBank;
import fr.ensai.gl.tpspringsimple.itf.IFastLane;
import fr.ensai.gl.tpspringsimple.itf.IJustHaveALook;
import fr.ensai.gl.tpspringsimple.itf.IProvider;
import fr.ensai.gl.tpspringsimple.itf.Product;

@Component()
public class Store implements IFastLane, IJustHaveALook {
	
	@Autowired
	IBank bank;
	@Autowired
	IProvider provider;
	public Map<Product, Long> listAvailable() {
		return null;
	}
	@Override
	public boolean isAvailable(long productID) {
		return true;
	}
	@Override
	public boolean buyProduct(long productID, long quantity) {
		bank.transfer(1, 2, 25);
		provider.sendProduct(productID, quantity, "Chez moi");
		return true;
	}

	
	
}
