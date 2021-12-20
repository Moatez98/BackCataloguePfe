package tn.essat.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.essat.model.Pfe;
@Repository
public interface IPfe extends JpaRepository<Pfe, Integer> {
	@Query("select m from Pfe m where m.type.id=:x")
	public List<Pfe> getAllpfebype(@Param("x") Integer id);
	@Query("select m from Pfe m where m.titre like %:x%")
	public List<Pfe> getAllpfebytitre(@Param("x") String  titre);
}
