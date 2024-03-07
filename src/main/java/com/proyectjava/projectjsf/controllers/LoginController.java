/**
 * 
 */
package com.proyectjava.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * Clase que permite controlar el funcionamiento con la pantalla de login.xhtml
 */

@ManagedBean
public class LoginController {
	private String usuario;
	private String password;

	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		if (usuario.equals("josue") && password.equals("123")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("frmLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("frmLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
