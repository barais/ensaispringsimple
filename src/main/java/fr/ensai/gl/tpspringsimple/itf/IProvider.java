package fr.ensai.gl.tpspringsimple.itf;

public interface IProvider {
	
	public boolean sendProduct(long productId, long quantity, String address);

}
