package br.aracomp.livariaHibernate.view;


import java.util.ArrayList;

import br.aracomp.livariaHibernate.model.Funcionario;
import br.aracomp.livariaHibernate.model.Livraria;
import br.aracomp.livariaHibernate.persistence.DAOFuncionario;
import br.aracomp.livariaHibernate.persistence.DAOLivraria;
import br.aracomp.livariaHibernate.persistence.IDAO;

public class Principal {
	public static void main(String args[]) {
		IDAO<Livraria> daoLivraria = new DAOLivraria();
		IDAO<Funcionario> daoFuncionario = new DAOFuncionario();
		
		Livraria l = new Livraria();
		
		l.setNome("Amazon");
		l.setTelefone("88526345");
		
		Funcionario j = new Funcionario();
		j.setNome("Cleber");
		j.setSalario(1008.00);
		j.setEndereco("Rua Roberto Barros de Oliveira");
		j.setTelefone("99885566");
//		j.setLivraria(l);
		daoFuncionario.add(j);
//		ArrayList<Funcionario> funcionarios = new ArrayList();
//		funcionarios.add(j);
//		
//		l.setFuncionarios(funcionarios);
//		
		daoLivraria.add(l);
//		
	}
		
	
}