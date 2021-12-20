package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IPfe;
import tn.essat.dao.IType;
import tn.essat.model.Pfe;

@RestController
@CrossOrigin("*")
public class Appctrl {
	@Autowired
	IType dao_type;
	@Autowired
	IPfe dao_pfe;

	public void setDao_type(IType dao_type) {
		this.dao_type = dao_type;
	}

	public void setDao_pfe(IPfe dao_pfe) {
		this.dao_pfe = dao_pfe;
	}

	@GetMapping("/Pfes")
	public List<Pfe> f() {
		return dao_pfe.findAll();
	}

	@GetMapping("/PfeBytype/{id}")
	public List<Pfe> f1(@PathVariable("id") int id) {
		return dao_pfe.getAllpfebype(id);
	}

	@GetMapping("/PfesBytitre/{titre}")
	public List<Pfe> f2(@PathVariable("titre") String titre) {
		return dao_pfe.getAllpfebytitre(titre);
	}

	@GetMapping("/supprimer/{id}")
	public void f3(@PathVariable("id") Integer id) {
		dao_pfe.deleteById(id);
	}
	@PostMapping("/ajouter")
	public Pfe f4(@RequestBody Pfe pfe) {
		return dao_pfe.save(pfe);
	}

}s
