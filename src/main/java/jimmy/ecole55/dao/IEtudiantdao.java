package jimmy.ecole55.dao;

import java.util.List;

import jimmy.ecole55.model.Etudiant;

public interface IEtudiantdao {
	
	
	public int createEtudiant(Etudiant etu);
	public int removeEtudiant(int id);
	public Etudiant getEtudiant(int id);
	public List<Etudiant> getAllEtudiants();
	public List<Etudiant> getEtudiantParGroupe(String gr);

}
