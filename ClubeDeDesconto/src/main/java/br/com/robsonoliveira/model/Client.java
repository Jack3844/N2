package br.com.robsonoliveira.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 5,nullable = false)
	private String sequencia;
	@Column(length = 20,nullable = false)
	private String name;
	@Column(length = 40,nullable = false)
	private String lastName;
	@Column(length = 11,nullable = false)
	private String cpf;
	@Column(length = 11,nullable = false)
	private String phoneNumber;
	
	public Client(int id,String sequencia, String name, String lastName, String cpf, String phoneNumber) {
		this.id = id;
		this.sequencia = sequencia;
		this.name = name;
		this.lastName = lastName;
		this.cpf = cpf;
		this.phoneNumber = phoneNumber;
	}

	public Client() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
