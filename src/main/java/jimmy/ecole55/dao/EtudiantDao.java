package jimmy.ecole55.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import jimmy.ecole55.model.Etudiant;

@Repository
public class EtudiantDao  implements IEtudiantdao {
	
	

	public int createEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		try 
		{
			Session session = ConnexionBD.getConnexion().getFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(etu);
			session.getTransaction().commit();
			session.close();
			return 1;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return 0;
		}
	}

	public int removeEtudiant(int id) {
		try 
		{
			Etudiant etu =new Etudiant();
			etu.setIdEtudant(id);
			Session session = ConnexionBD.getConnexion().getFactory().openSession();
			session.beginTransaction();
			session.delete(etu);
			session.getTransaction().commit();
			session.close();
			return 1;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return 0;
		}
	}

	public Etudiant getEtudiant(int id) {
		// TODO Auto-generated method stub
		Session session = ConnexionBD.getConnexion().getFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Etudiant where idEtudiant= :Id");
		query.setParameter("Id", "idEtudiant");
		Etudiant etu = (Etudiant) query.uniqueResult();
		
		return etu;
	}

	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		try 
		{
			List<Etudiant> list =new ArrayList<Etudiant>();
			Session session = ConnexionBD.getConnexion().getFactory().openSession();
			session.beginTransaction();
			list= session.createQuery("from Etudiant").list();
			session.close();
			return list;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public List<Etudiant> getEtudiantParGroupe(String gr) {
		// TODO Auto-generated method stub
		return null;
	}

}
