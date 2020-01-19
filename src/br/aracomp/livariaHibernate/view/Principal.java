package br.aracomp.livariaHibernate.view;


import java.util.ArrayList;

import br.aracomp.livariaHibernate.model.Endereco;
import br.aracomp.livariaHibernate.model.Livraria;
import br.aracomp.livariaHibernate.model.Pessoa;
import br.aracomp.livariaHibernate.persistence.DAOEndereco;
import br.aracomp.livariaHibernate.persistence.DAOLivraria;
import br.aracomp.livariaHibernate.persistence.DAOPessoa;
import br.aracomp.livariaHibernate.persistence.IDAO;

public class Principal {
	public static void main(String args[]) {
		IDAO<Livraria> daoLivraria = new DAOLivraria();
//		IDAO<Funcionario> daoFuncionario = new DAOFuncionario();
		IDAO<Pessoa> daoPessoa = new DAOPessoa();
		IDAO<Endereco> daoEndereco = new DAOEndereco(); 
		
		Livraria l = new Livraria();
		l.setNome("Amazon");
		l.setTelefone("88526345");
//		Funcionario j = new Funcionario();
//		j.setNome("Cleber");
//		j.setSalario(1008.00);
//		j.setTelefone("99885566");
//		j.setLivraria(l);
//		daoFuncionario.add(j);
//		ArrayList<Funcionario> funcionarios = new ArrayList();
//		funcionarios.add(j);
//		
//		l.setFuncionarios(funcionarios);
//		
		daoLivraria.add(l);
		
		Endereco e = new Endereco();
		e.setCidade("Arapiraca");
		e.setEstado("Alagoas");
		e.setPais("Brasil");
		daoEndereco.add(e);
		Pessoa p = new Pessoa();
		p.setNome("Alex");
		p.setEndereco(e);
		daoPessoa.add(p);
	}
		
	
}