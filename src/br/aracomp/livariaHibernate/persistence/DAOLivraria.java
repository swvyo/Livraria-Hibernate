package br.aracomp.livariaHibernate.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aracomp.livariaHibernate.model.Livraria;

public class DAOLivraria implements IDAO<Livraria> {
	private static final EntityManagerFactory entity = Persistence.createEntityManagerFactory("livros");
	
	EntityManager entityManager = entity.createEntityManager();

	@Override
	public void add(Livraria obj) {
		EntityManager entityManager = entity.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(obj);
		transaction.commit();
		
		entityManager.close();
	}
	
	
//	public static void inserirDados() {
//		EntityManager entityManager = entity.createEntityManager();
//		Livraria livraria = new Livraria();
//		
//		livraria.setNome("Cultura");
//		livraria.setTelefone("98175623");
//		
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.YEAR, 1999);
//		calendar.set(Calendar.MONTH, 9);
//		calendar.set(Calendar.DAY_OF_MONTH, 29);
//
//		
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		entityManager.persist(livraria);
//		transaction.commit();
//		
//		entityManager.close();
//	}
}
