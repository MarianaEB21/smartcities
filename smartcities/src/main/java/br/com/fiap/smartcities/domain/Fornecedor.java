package br.com.fiap.smartcities.domain;

import java.util.Calendar;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "tbl_fornecedor")
public class Fornecedor {

	@Id
	@SequenceGenerator(name = "fornecedor",sequenceName="sq_tbl_fornecedor",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="fornecedor")
	@Column(name = "id_fornecedor")
	private int id;
	
	@Column(name = "nome_fornecedor",length=50)
	private String nome;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_entrega")
	private Calendar dataEntrega;
	
	public Integer GetId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public Calendar getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
}
