package com.exercicio.aula.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emp")
public class Emp {
	@Id
	@Column(name="CodEmp", nullable =  false)
	private int CodEmp;
	@Column(name="Nome", length = 100, nullable = false)
	private String Nome;
	@Column(name="Cat", length =1, nullable = false )
	private String Cat;
	@Column(name="Sal", precision=7, scale=2, nullable = false)
	private BigDecimal Sal;
	@Column(name="DataIni", nullable = false)
	private LocalDate DataIni;
}
