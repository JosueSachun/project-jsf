/**
 * 
 */
package com.proyectjava.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * Clase que se encarga de cerrar la sesión del usuario
 */
@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión...");
	}
	
	/**
	 * Método que permite cerrar la sesión del usuario y redireccionar a la pantalla de login	
	 */
	public void cerrarSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que permite redireccionar a una pantalla
	 * @param pagina {@link String} página a redireccionarse
	 * @throws IOException Exception en caso de error al encontrar página
	 */
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
}
