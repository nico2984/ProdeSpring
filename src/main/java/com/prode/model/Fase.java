package com.prode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the fases database table.
 * 
 */
@Entity
@Table(name="fases")
public class Fase implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String descripcion = "";

    public Fase() {
    }

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}


	@Column(name="Descripcion", nullable=false, length=200)
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}