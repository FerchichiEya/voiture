package com.eya.Voitures;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eya.Voitures.entities.Voiture;
import com.eya.Voitures.service.VoitureService;

@SpringBootApplication
public class VoituresApplication implements CommandLineRunner {
	@Autowired
	VoitureService  voitureService;

	public  static  void  main(String[]  args)  { 
		SpringApplication.run(VoituresApplication.class,  args);
	}

	@Override
	public  void  run(String...  args)  throws  Exception  { 
		/*voitureService.saveVoiture(new  Voiture("Range Rover",  760000.0,  new  Date()));
		voitureService.saveVoiture(new  Voiture("Clio",  2800.0,  new  Date()));
		voitureService.saveVoiture(new  Voiture("Audi",  900.0,  new  Date()));*/

	}


	

}
