package com.exercicio.aula.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="projeto")
public class Projeto {
	@Id
	@Column(name="CodProj", nullable = false)
	private int CodProj;
	@Column(name="tipo", length = 15,nullable = false)
	private String tipo;
	@Column(name="descr",length = 255, nullable = false)
	private String descr;
	@ManyToOne(targetEntity = Emp.class, fetch = FetchType.LAZY)
	@JoinColumn(name="EmpCodEmp", nullable = false)
	private int EmpCodEmp;
	private Emp emp;
}
