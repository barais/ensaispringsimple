package fr.ensai.gl.tpspringsimple.impl;

import org.springframework.stereotype.Component;

import fr.ensai.gl.tpspringsimple.itf.IProvider;
@Component

public class Provider implements IProvider{

	@Override
	public boolean sendProduct(long productId, long quantity, String address) {
		System.err.println("send product" + productId);
		return true;
	}

}
