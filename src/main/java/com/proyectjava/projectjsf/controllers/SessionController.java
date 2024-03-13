/**
 * 
 */
package com.proyectjava.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.projectjava.projectjsf.dto.UsuarioDTO;

/**
 * Clase que se enncarga de manetener la información del usuario que ingresa al aplicativo
 */

@ManagedBean
@SessionScoped
public class SessionController {
	/**
	 * Usuario que se mantendrá en sesión
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesión del usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sesión...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
}
