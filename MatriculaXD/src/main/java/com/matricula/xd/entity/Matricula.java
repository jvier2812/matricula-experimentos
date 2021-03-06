package com.matricula.xd.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="matriculas")
public @Data class Matricula {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Alumno alumno;
	
	@Column()
	private String semestre="2020-2";
	
	/*@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_matricula", nullable = false)
	private Date fechaMatricula;
	*/
	
	@ManyToMany()
	private List<Curso> cursosMatriculados;
	
}
