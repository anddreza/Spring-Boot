package br.com.project.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Especificar a criação da tabela
@Entity
//Criar o nome da tabela como "pessoas"
@Table(name = "pessoas")
public class Pessoa {
	//Atributos
	//Responsavel para criação da Primary Key

    @Id
		//Informação autoincrementada, toda vez que passar um nome e uma idade será gerada o codigo

    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nome;
	private int idade;


	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
