package br.aracomp.livariaHibernate.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.aracomp.livariaHibernate.model.Funcionario;

public class DAOFuncionario implements IDAO<Funcionario> {
private static final EntityManagerFactory entity = Persistence.createEntityManagerFactory("default");
	
	EntityManager entityManager = entity.createEntityManager();

	@Override
	public void add(Funcionario obj) {
		EntityManager entityManager = entity.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(obj);
		transaction.commit();
		
		entityManager.close();
	}
	
}
