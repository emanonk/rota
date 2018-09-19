package com.manos.rota;


import com.manos.rota.service.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class RotaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RotaApplication.class, args);

		ApplicationContext context = SpringApplication.run(RotaApplication.class, args);

		MainController bean = context.getBean(MainController.class);
		try {
			bean.myMain();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
