package com.generation.ripassonespring.repos;

import com.generation.ripassonespring.model.Provincia;
import com.generation.ripassonespring.model.Regione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegioneRepo extends JpaRepository<Regione,Long>
{
	//SELECT * FROM regione WHERE area_geografica = 'Nord'

	List<Regione> findAllByAreaGeografica(String area);

//	@Query("select  r from Regione r WHERE r.areaGeografica=:area")
	@Query(nativeQuery = true,value = "SELECT * FROM regione WHERE area_geografica=:area")
	List<Regione> trovaRegioniDiArea(String area);
}
