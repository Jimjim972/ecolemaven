package jimmy.ecole55.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jimmy.ecole55.dao.EtudiantDao;
import jimmy.ecole55.dao.IEtudiantdao;
import jimmy.ecole55.model.Etudiant;

@Service
public class EtudiantService implements IEtudiantService{
	
	@Autowired
	private IEtudiantdao dao =new EtudiantDao();

	public int createEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		return dao.createEtudiant(etu);
	}

	public int removeEtudiant(int id) {
		// TODO Auto-generated method stub
		return dao.removeEtudiant(id);
	}

	public Etudiant getEtudiant(int id) {
		// TODO Auto-generated method stub
		return dao.getEtudiant(id);
	}

	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		return dao.getAllEtudiants();
	}

	public List<Etudiant> getEtudiantParGroupe(String gr) {
		// TODO Auto-generated method stub
		return dao.getEtudiantParGroupe(gr);
	}

}
