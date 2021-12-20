package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pfe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id ;
private String titre ;
@ManyToOne
@JoinColumn(name = "type_id")
private Type type ;
public Pfe() {
	super();
}
public Pfe(Integer id, String titre, tn.essat.model.Type type) {
	super();
	this.id = id;
	this.titre = titre;
	this.type = type;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}


}
