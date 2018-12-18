package fr.ensai.gl.tpspringsimple.impl;

import org.springframework.stereotype.Component;

import fr.ensai.gl.tpspringsimple.itf.IBank;
@Component

public class Bank implements IBank{

	@Override
	public boolean transfer(long from, long to, long amount) {
		
		System.err.println("from : " + from+"\n" + "to : " + to+"\n"+"amount : " + amount+"\n");
		return true;
	}

}
