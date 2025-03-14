package com.generation.ripassonespring;

import com.generation.ripassonespring.model.Regione;
import com.generation.ripassonespring.repos.RegioneRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RipassoneSpringApplicationTests
{
	@Autowired
	RegioneRepo rRepo;

	@Test
	void contextLoads()
	{
		List<Regione> tutte =  rRepo.trovaRegioniDiArea("Sud");
		for(Regione regione :tutte)
			System.out.println(regione);
	}

}
