package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(max = 15, message = "El nombre no debe tener mas de 15 caracteres")
	@NotEmpty(message ="Este campo no puede estar vacio.")
	private String nombre;
	
	@Size(max = 15, message = "La descripcion no debe tener mas de 15 caracteres")
	@NotEmpty(message ="Este campo no puede estar vacio.")
	private String descripcion;
	
	@NotNull(message = "El campo no puede estar vacio")
	@Min(value = 0, message = "El precio no debe ser negativo.")
	private Double precio;
	
	@NotEmpty(message ="Este campo no puede estar vacio.")
	@Pattern(regexp = "^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])\\2(\\d{4})$",
	message = "El formato debe ser dd/mm/aaaa")
	private String vencimiento;
	
	
	public Producto() {
		super();
	}

	/*
	public Producto(String nombre, String descripcion, Double precio, String vencimiento) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.vencimiento = vencimiento;
	}
	
	*/

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public String getVencimiento() {
		return vencimiento;
	}
	
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

}
