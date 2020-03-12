package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jimmy.ecole55.model.Etudiant;
import jimmy.ecole55.service.IEtudiantService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext bob = new AnnotationConfigApplicationContext();
		bob.scan("jimmy.ecole55.dao");
		bob.scan("jimmy.ecole55.service");
		bob.refresh();
		
		IEtudiantService etuServ = (IEtudiantService) bob.getBean("etudiantService");
		etuServ.createEtudiant(new Etudiant("pavade","jimmy","B"));

	}

}
