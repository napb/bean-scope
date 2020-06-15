package com.nico.beanscope;

import com.nico.beanscope.configuracion.PlaceholderPrueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanScopeApplication implements CommandLineRunner {

	@Autowired
	private PlaceholderPrueba placeholderPrueba;

	public static void main(String[] args) {
		SpringApplication.run(BeanScopeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("propiedad inyectada:" + placeholderPrueba.getId() + " | " + placeholderPrueba.getNombre()
				+ " | " + placeholderPrueba.getOtroobjeto().getCuidad()
				+ " | " + placeholderPrueba.getOtroobjeto().getRegion());
	}
}
