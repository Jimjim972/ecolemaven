package jimmy.ecole55.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue
	private int idEtudant;
	private String nom, prenom, groupe;
	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Etudiant(String nom, String prenom, String groupe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.groupe = groupe;
	}


	public int getIdEtudant() {
		return idEtudant;
	}


	public void setIdEtudant(int idEtudant) {
		this.idEtudant = idEtudant;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getGroupe() {
		return groupe;
	}


	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}


	@Override
	public String toString() {
		return "Etudiant [idEtudant=" + idEtudant + ", nom=" + nom + ", prenom=" + prenom + ", groupe=" + groupe + "]";
	}
	
	
	

}
