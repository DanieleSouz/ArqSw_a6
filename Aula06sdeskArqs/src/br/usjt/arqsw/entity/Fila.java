package br.usjt.arqsw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Fila {
	/**
	 * @author 816121026 Daniele Souza Santos SIN3AN MCA1
	 */

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@NotNull @Column(name="id_fila")
	private int id;
	
	@NotNull
	@Size(max=45)
	@Column(name="nm_fila")
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
}