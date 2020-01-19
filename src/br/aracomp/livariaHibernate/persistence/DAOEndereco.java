package br.aracomp.livariaHibernate.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.aracomp.livariaHibernate.model.Endereco;
import br.aracomp.livariaHibernate.model.Pessoa;

public class DAOEndereco implements IDAO<Endereco> {
private static final EntityManagerFactory entity = Persistence.createEntityManagerFactory("default");
	
	EntityManager entityManager = entity.createEntityManager();

	@Override
	public void add(Endereco obj) {
		EntityManager entityManager = entity.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(obj);
		transaction.commit();
		
		entityManager.close();
	}

}
