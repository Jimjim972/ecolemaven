package jimmy.ecole55.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnexionBD {
	
	private SessionFactory factory= null;
	private static ConnexionBD instance = null;
	
	
	private  ConnexionBD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SessionFactory getFactory() 
	{
		if (factory==null) factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		return factory;
	}

	public static  ConnexionBD getConnexion() 
	{
		if (instance==null) instance = new ConnexionBD();
		return instance;
	}
	
}
