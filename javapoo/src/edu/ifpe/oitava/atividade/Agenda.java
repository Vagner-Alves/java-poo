package edu.ifpe.oitava.atividade;

import java.util.ArrayList;


import edu.ifpe.setima.atividade.Contato;

public class Agenda {
	private ArrayList<Contato> contatos;
	
	   public void adicionarContato(String nome, String telefone) {
	        Contato contato = new Contato(nome, telefone);
	        contatos.add(contato);
	        System.out.println("Contato " + nome + " adicionado!");
	    }

	    
	    public Contato consultarContato(String nome) {
	        for (Contato contato : contatos) {
	            if (contato.getNome().equalsIgnoreCase(nome)) {
	                return contato;
	            }
	        }
	        return null;
	    }

	    
	    public void alterarContato(String nome, String novoTelefone) {
	        Contato contato = consultarContato(nome);
	        if (contato != null) {
	            contato.setTelefone(novoTelefone);
	            System.out.println("Telefone de " + nome + " alterado!");
	        } else {
	            System.out.println("Contato " + nome + " não encontrado.");
	        }
	    }

	  
	    public void excluirContato(String nome) {
	        Contato contato = consultarContato(nome);
	        if (contato != null) {
	            contatos.remove(contato);
	            System.out.println("Contato " + nome + " excluído!");
	        } else {
	            System.out.println("Contato " + nome + " não encontrado.");
	        }
	    }
		
}
