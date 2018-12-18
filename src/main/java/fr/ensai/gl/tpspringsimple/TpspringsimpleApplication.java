package fr.ensai.gl.tpspringsimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import fr.ensai.gl.tpspringsimple.itf.IFastLane;

@SpringBootApplication
@ComponentScan
public class TpspringsimpleApplication implements CommandLineRunner{

	@Autowired
	IFastLane lane;
	
	public static void main(String[] args) {
		SpringApplication.run(TpspringsimpleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ok" + args[0]);
		lane.buyProduct(25, 30);
	}

}

