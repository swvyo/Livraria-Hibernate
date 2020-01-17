package br.aracomp.livariaHibernate.view;


import java.util.List;
import br.aracomp.livariaHibernate.model.*;
import br.aracomp.livariaHibernate.persistence.*;

public class Principal {
	public static void main(String args[]) {
		IDAO<Livraria> daoLivraria = new DAOLivraria();
		Livraria l = new Livraria();
		
		l.setNome("Saraiva");
		l.setTelefone("88526345");
		
		daoLivraria.add(l);
		
	}
		
	
}