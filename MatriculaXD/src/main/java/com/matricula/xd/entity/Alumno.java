package com.matricula.xd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name="alumnos")
public @Data class Alumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "El nombre no puede estar vacío")
	@Column(name = "nombre", nullable=false, length = 20)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 20)
	private String apellido;
	
	
	@Column(name = "dni",unique=true, nullable = false, length = 8)
	private String dni;

	@Column(name = "sexo", nullable = false, length = 1)
	private String sexo;
	
	@Column(name = "telefono", nullable = false, length = 9)
	private String telefono;
	
	@Column(name = "correo", nullable = false, length = 30) //cambiar en requerimientos
	private String correo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fec_nacimiento", nullable = false)
	private Date fecNacimiento;
	
	@Column(name = "direccion", nullable = false, length = 40)
	private String direccion;
	
	@Column()
	private Boolean habilitado; 
	
	@Column()
	private Boolean matriculado; 
	
	public String getNombreCompleto() {
		return nombre +" "+apellido;
	}
}
