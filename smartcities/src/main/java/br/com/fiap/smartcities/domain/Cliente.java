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
@Table(name = "tbl_cliente")
public class Cliente {

	@Id
	@SequenceGenerator(name = "cliente",sequenceName="sq_tbl_cliente",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cliente")
	@Column(name = "id_cliente")
	private int id;
	
	@Column(name = "nome_cliente",length=50)
	private String nome;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_compra")
	private Calendar dataCompra;
	
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
	
	public Calendar getDataCompra() {
		return dataCompra;
	}
	
	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}
}
