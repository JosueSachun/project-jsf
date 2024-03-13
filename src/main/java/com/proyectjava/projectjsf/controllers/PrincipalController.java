/**
 * 
 */
package com.proyectjava.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.proyectjava.projectjsf.entity.Empleados;
import com.proyectjava.projectjsf.services.EmpleadoService;

/**
 * @author JOSUE
 * Clase controller que se encarga de procesar la información para la pantala principal.xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleados> empleados;
	
	/**
	 * Lista de empleados filtrados
	 */
	private List<Empleados> empleadosFiltrados;
	
	/**
	 * Servicio con los métodos que realizan la lógica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Método que se encarga de inicializar la información de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Método que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleado();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleados> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleados> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleados> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

	
}
